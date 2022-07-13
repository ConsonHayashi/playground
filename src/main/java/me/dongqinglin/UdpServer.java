package me.dongqinglin;

import java.io.IOException;
import java.net.*;

public class UdpServer {
    public static String LOCAL_HOST_IP = "localhost";
    public static int PORT = 8080;


    public static void main(String[] args) throws IOException {
        DatagramSocket entryPoint = new DatagramSocket(PORT, InetAddress.getByName(LOCAL_HOST_IP));
        System.out.println("Created UDP  server socket at " + LOCAL_HOST_IP + ":" + PORT);
        while(true) {
            System.out.println("Waiting for a  UDP  packet...");
            DatagramPacket datagramPacket = new DatagramPacket(new byte[1024], 1024);
            entryPoint.receive(datagramPacket);
            displayPacketDetails(datagramPacket);
        }
    }

    public static void displayPacketDetails(DatagramPacket packet) {
        byte[] data = packet.getData();
        String msg = new String(data, packet.getOffset(), packet.getLength());
        System.out.println(msg);
    }

}
