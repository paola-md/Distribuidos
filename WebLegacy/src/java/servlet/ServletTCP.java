/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.Socket;
import java.net.SocketException;
import java.net.UnknownHostException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author sdist
 */
public class ServletTCP extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            //OBTIENE DATO
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ServletBroker</title>");            
            out.println("</head>");
            out.println("<body>");
            
            String res="EROOR";
            String dato = "error";
            if(request.getParameter("dato")!=null){
                dato = request.getParameter("dato");
                out.println(dato);
            }
 
            //TCP
            Socket s = null;
            try {
                int serverPort = 7896;

                s = new Socket("localhost", serverPort);
                //   s = new Socket("127.0.0.1", serverPort);    
                DataInputStream in = new DataInputStream(s.getInputStream());
                DataOutputStream outD
                        = new DataOutputStream(s.getOutputStream());
                outD.writeUTF(dato);        	// UTF is a string encoding 

                String data = in.readUTF();
                out.println(data + " RECIBIDA");
                System.out.println("Received: " + data);
            } catch (UnknownHostException e) {
                System.out.println("Sock:" + e.getMessage());
            } catch (EOFException e) {
                System.out.println("EOF:" + e.getMessage());
            } catch (IOException e) {
                System.out.println("IO:" + e.getMessage());
            } finally {
                if (s != null) {
                    try {
                        s.close();
                    } catch (IOException e) {
                        System.out.println("close:" + e.getMessage());
                    }
                }
            }
          out.println(" Listo para UDP");
            //UDP
            	DatagramSocket aSocket = null;
	   try{
                out.println(" Dentro try");
	    	int serverPort = 6789;
                aSocket = new DatagramSocket(serverPort); 
		byte[] buffer = new byte[1000]; // buffer encapsulará mensaje
                boolean bandera = true;
                   System.out.println("Waiting for messages..."); 
                   out.println("   Esperando");
 		   DatagramPacket request2 = new DatagramPacket(buffer, buffer.length);
  		   aSocket.receive(request2);     
                   out.println("  Recibi");
                   res = "Reply: " + (new String(request2.getData())).trim() ;
                   //res = request2.getData().toString(); 
                   if (res.length()> 0){
                       System.out.println("FUERA");
                       bandera = false;
                       System.out.println(res);
                       
                   }
                   
                   System.out.println("Server received a request from "+ request2.getAddress());
                
		
	   }
           catch (SocketException e){
                System.out.println("Socket: " + e.getMessage());
	   }
           catch (IOException e) {
               System.out.println("IO: " + e.getMessage());
           }
           finally {
                if(aSocket != null) 
                    aSocket.close();
           }
            
                      

            out.println("<h1>Servlet ServletBroker at " + res + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
        
        //UDP
        

    
}

// <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
/**
 * Handles the HTTP <code>GET</code> method.
 *
 * @param request servlet request
 * @param response servlet response
 * @throws ServletException if a servlet-specific error occurs
 * @throws IOException if an I/O error occurs
 */
@Override
        protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
        protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
        public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
