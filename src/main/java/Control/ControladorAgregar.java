package Control;


import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import Modelo.Servicio;


@WebServlet("/Agregar")
public class ControladorAgregar extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public ControladorAgregar() {
        super();
        // TODO Auto-generated constructor stub
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.getRequestDispatcher("Agregar.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {	
		
		String nombre = request.getParameter("nombre");
		String apellido = request.getParameter("apellido");
		Servicio servicio = new Servicio();
		servicio.agregarInvitado(nombre , apellido);

		request.getRequestDispatcher("Confirmacion.jsp").forward(request, response);
	}

}
