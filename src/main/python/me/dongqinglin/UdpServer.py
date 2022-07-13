import socket

localIP = "127.0.0.1"
localPort = 8081
bufferSize = 1024

def main():
    udpServer = socket.socket(family=socket.AF_INET, type=socket.SOCK_DGRAM)
    udpServer.bind((localIP, localPort))
    print("UDP server starting at {}:{}".format(localIP, localPort))
    while(True):
        print("Waiting for a  UDP  packet...");
        packet = udpServer.recvfrom(bufferSize)
        message = packet[0]
        address = packet[1]
        print(message)
    pass

main()

