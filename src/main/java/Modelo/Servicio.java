package Modelo;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.mysql.cj.xdevapi.SelectStatement;

public class Servicio {
    private Connection connection;

    public Servicio() {
       
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3307/db_name";
            String user = "";
            String password = "";
            connection = DriverManager.getConnection(url, user, password);
            System.out.println("Conecto");
        } catch (ClassNotFoundException | SQLException e) {
        	 System.err.println("No Conecto");
            e.printStackTrace();
        }
    }

    public void agregarInvitado(String nombre, String apellido) {
        String sql = "INSERT INTO invitados (nombre, apellido) VALUES (?,?)";
        try {
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, nombre);
            statement.setString(2, apellido);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void eliminarInvitado(String nombre) {
        String sql = "DELETE FROM invitados WHERE nombre = ? ";
        try {
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, nombre);
            statement.executeUpdate();
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void actualizarDatos(int id,String nombre, String apellido) throws SQLException{
    	String sql = "SELECT * FROM invitados WHERE id = ?";
    	String sqlu = "UPDATE invitados SET nombre = ? , apellido = ? WHERE id = ?";
    	try(PreparedStatement statement = connection.prepareStatement(sql);
    		PreparedStatement ustatement = connection.prepareStatement(sqlu);){   		    		
            statement.setInt(1, id);
    		statement.executeQuery();
    		
    		if(((ResultSet) ustatement).next()) {
    			ustatement.setString(1,nombre);
    			ustatement.setString(2,apellido);
    			ustatement.setInt(3,id);
    			ustatement.executeUpdate();
    		}
    		
    		    		
    		}catch(SQLException e) {
    			e.printStackTrace();
    		}
    	
    }
    
    public List<Invitado> consultarInvitados() {
        List<Invitado> invitados = new ArrayList<>();
        String sql = "SELECT * FROM invitados";
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                Invitado invitado = new Invitado();
                invitado.setId(resultSet.getInt("id"));
                invitado.setNombre(resultSet.getString("nombre"));
                invitado.setApellido(resultSet.getString("apellido"));
                invitados.add(invitado);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return invitados;
    }
    
    public Invitado consultarInvitadoPorId(int id) {
        Invitado invitado = null;
        String sql = "SELECT * FROM invitados WHERE id = ?";
        try {
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, id);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                invitado = new Invitado();
                invitado.setId(resultSet.getInt("id"));
                invitado.setNombre(resultSet.getString("nombre"));
                invitado.setApellido(resultSet.getString("apellido"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return invitado;
    }
   
}
