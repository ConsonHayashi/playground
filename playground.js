function makeListNode(length) {
    var root, parent;
    for (var i = 0; i < length; i++) {
        var node = new ListNode(i + 1);
        if (i == 0) {
            root = node;
            parent = root;
        }
        else {
            parent.next = node;
            parent = parent.next;
        }
    }
    return root;
}
function printListNode(node) {
    // console.log(node)
    var root, parent;
    root = node;
    parent = root;
    while (parent.next != undefined || parent.next != null) {
        console.log(parent.data);
        parent = parent.next;
    }
}
function main() {
    // console.log("Hello, Language TypeScript");
    var node = makeListNode(100);
    printListNode(node);
}
var ListNode = /** @class */ (function () {
    function ListNode(data) {
        this.data = data;
    }
    return ListNode;
}());
main();
