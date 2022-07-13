package me.dongqinglin;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class UdpClient {

    private static int Client_port = 9000;
    public static void main(String[] args) throws IOException {

        System.out.println("连接到主机：" + UdpServer.LOCAL_HOST_IP + " ，端口号：" + UdpServer.PORT);
        DatagramSocket client = new DatagramSocket(Client_port, InetAddress.getByName(UdpServer.LOCAL_HOST_IP));
        byte[] bytes = "HELLO From Java".getBytes(StandardCharsets.UTF_8);
        DatagramPacket datagramPacket = new DatagramPacket(bytes, bytes.length);
        datagramPacket.setPort(8082);
        datagramPacket.setAddress(InetAddress.getByName(UdpServer.LOCAL_HOST_IP));
        client.send(datagramPacket);
        client.close();

    }
}
