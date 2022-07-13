
const dgram = require('dgram')


let targetPort = 8080;
let targetHOST = '127.0.0.1'
let message = new Buffer('Hello from nodejs!');
function main () {
  let udpServer = dgram.createSocket('udp4')

  udpServer.send(message, targetPort, targetHOST, function (error, bytes) {
    // console.log(error, bytes)
    udpServer.close()
  })
}

main()