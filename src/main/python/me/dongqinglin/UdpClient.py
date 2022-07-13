import socket

targetIp = "127.0.0.1"
targetPort = 8082
bufferSize = 1024
message = str.encode("hello python")


def main():
    udpClient = socket.socket(family=socket.AF_INET, type=socket.SOCK_DGRAM)
    udpClient.sendto(message, (targetIp, targetPort))

main()