package otroProceso;

import java.net.*;
import java.io.*;

public class ProcesoLegacy {

    String mensaje;

    public static void main(String args[]) {
        try {
            int serverPort = 7896;
            ServerSocket listenSocket = new ServerSocket(serverPort);
            while (true) {
                System.out.println("Waiting for messages...");
                Socket clientSocket = listenSocket.accept();  // Listens for a connection to be made to this socket and accepts it. The method blocks until a connection is made. 
                Connection c = new Connection(clientSocket);
                c.start();
            }
        } catch (IOException e) {
            System.out.println("Listen :" + e.getMessage());
        }
    }

}

class Connection extends Thread {

    DataInputStream in;
    DataOutputStream out;
    Socket clientSocket;
    String mensaje;

    public Connection(Socket aClientSocket) {
        try {
            clientSocket = aClientSocket;
            in = new DataInputStream(clientSocket.getInputStream());
            out = new DataOutputStream(clientSocket.getOutputStream());
        } catch (IOException e) {
            System.out.println("Connection:" + e.getMessage());
        }
    }

    public void mandaUDP() {
        DatagramSocket aSocket = null;
        try {
            aSocket = new DatagramSocket();
            String myMessage = mensaje;
            byte[] m = myMessage.getBytes();
            

//                InetAddress aHost = InetAddress.getByName("localhost");148.205.199.97
            InetAddress aHost = InetAddress.getByAddress("localhost", new byte[]{(byte) 127, (byte) 0, (byte) 0, (byte) 1});
            int serverPort = 6789;
            DatagramPacket request = new DatagramPacket(m, m.length, aHost, serverPort);
            aSocket.send(request);
            byte[] buffer = new byte[1000];
            DatagramPacket reply = new DatagramPacket(buffer, buffer.length);
            aSocket.receive(reply);
            System.out.println("Reply: " + new String(reply.getData()));

        } catch (SocketException e) {
            System.out.println("Socket: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("IO: " + e.getMessage());
        } finally {
            if (aSocket != null) {
                aSocket.close();
            }
        }
    }

    @Override
    public void run() {
        try {			                 // an echo server
            //RECIBE TCP
            String data = in.readUTF();
            System.out.println("Message received from: " + clientSocket.getRemoteSocketAddress());
            System.out.println(data);
            out.writeUTF(data);
            mensaje = data + "CAMBIO";
            System.out.println(mensaje);

            this.mandaUDP();

        } catch (EOFException e) {
            System.out.println("EOF:" + e.getMessage());
        } catch (IOException e) {
            System.out.println("IO:" + e.getMessage());
        } finally {
            try {
                clientSocket.close();
            } catch (IOException e) {
                System.out.println(e);
            }
        }
    }
}
