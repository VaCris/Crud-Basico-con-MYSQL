package Clases;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Servicio {
    private Connection connection;

    public Servicio() {
       
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/ahorroperu";
            String user = "rooot";
            String password = "admin";
            connection = DriverManager.getConnection(url, user, password);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    public void agregarInvitado(String nombre) {
        String sql = "INSERT INTO invitados (nombre) VALUES (?)";
        try {
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, nombre);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void eliminarInvitado(int id) {
        String sql = "DELETE FROM invitados WHERE id = ?";
        try {
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, id);
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
                invitados.add(invitado);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return invitados;
    }

    public void actualizarInvitado(int id, String nuevoNombre) {
        String sql = "UPDATE invitados SET nombre = ? WHERE id = ?";
        try {
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, nuevoNombre);
            statement.setInt(2, id);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
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
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return invitado;
    }
   
}
