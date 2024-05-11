package Control;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import Clases.Servicio;


@WebServlet("/eliminar")
public class ControladorEliminar extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public ControladorEliminar() {
        super();     
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		   String nombre = request.getParameter("nombre");
	       Servicio servicio = new Servicio();
	       servicio.eliminarInvitado(nombre);
		//doGet(request, response);
	}

}
