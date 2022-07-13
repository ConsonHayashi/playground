const assert = require('assert');

function main(): void {
  let array = [];
  for (let i = 0; i < 100; i++) {
    array.push(i);
  }
  console.log(array.length);
}

main()