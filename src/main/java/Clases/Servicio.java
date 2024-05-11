package Clases;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Servicio {
    private Connection connection;

    public Servicio() {
       
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3307/ahorroperu";
            String user = "root";
            String password = "admin";
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
