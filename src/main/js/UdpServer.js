
const dgram = require('dgram')


let PORT = 8082;
let HOST = '127.0.0.1'

function main () {
  let udpServer = dgram.createSocket('udp4')

  udpServer.on("listening", function () {
    console.log('UDP Server listening on ' + HOST + ':' + PORT);
  })
  udpServer.on("message", function (message, remote) {
    console.log(message.toString("utf-8"))
  })
  udpServer.bind(PORT, HOST)
}

main()

