const expect = require('chai').expect;

// change the location which mocha config file
it('will be created', function () {
  let array = []
  for (let index = 0; index < 100; index++) {
    array.push(index)
  }
  expect(array.length).to.equal(100)
});
let tom = {
  "age": 28,
  "name": "Tom",
  "job": "teacher",
  "students": [
    {},
    {},
    {}
  ]
}