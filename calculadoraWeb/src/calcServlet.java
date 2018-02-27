
import org.apache.commons.lang.*;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class calcServlet
 */
@WebServlet("/calcServlet")
public class calcServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public calcServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter retorno = response.getWriter();
		String valorA = request.getParameter("valor1");
		String valorB = request.getParameter("valor2");
		
		if(StringUtils.isEmpty(valorA) || StringUtils.isEmpty(valorB))
		{
			retorno.print("Valores nulos!");
		}
		else 
		{	
			String operadorLido = request.getParameter("operacoes");
			float valor1 = Float.parseFloat(valorA);
			float valor2 = Float.parseFloat(valorB);
			float resultado = 0;
			
			switch (operadorLido)
			{
				case "soma":
					resultado = valor1 + valor2;
					break;
				case "subtracao":
					resultado = valor1 - valor2;
					break;
				case "multiplicacao":
					resultado = valor1 * valor2;
					break;
				case "divisao":
					resultado = valor1 / valor2;
					break;
			}
			retorno.println("O resultado da operação é: "+ resultado);
		}
	}
		
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
