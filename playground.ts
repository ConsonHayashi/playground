function makeListNode(length: number) {
  let root, parent;
  for (let i = 0; i < length; i++) {
    const node = new ListNode(i + 1);
    if (i == 0) {
      root = node;
      parent = root;
    } else {
      parent.next = node;
      parent = parent.next;
    }
  }
  return root;
}
function printListNode(node: ListNode) {
  // console.log(node)
  let root, parent;
  root = node;
  parent = root;

  while (parent.next != undefined || parent.next != null) {
    console.log(parent.data)
    parent = parent.next
  }
}

function main() {
  // console.log("Hello, Language TypeScript");
  const node: ListNode = makeListNode(100)
  printListNode(node);

}

class ListNode {
  data: number;
  // undefined
  next: ListNode;

  constructor(data) {
    this.data = data
  }
}
main();

