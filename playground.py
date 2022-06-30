
def makeListNode(length):
    root = 0; parent = 0
    for i in range(length):
      if(i == 0):
        root = ListNode(i + 1)
        parent = root
      else:
        node = ListNode(i + 1)
        parent.next = node
        parent = node
    return root

def printListNode(node): 
    root = node
    parent = root
    while(parent.next != None):
        print(parent.data)
        parent = parent.next
    

def main():
    root = makeListNode(100)
    printListNode(root)
        

class ListNode:
    data = 0
    next = None

    def __init__(self, data):
        self.data = data


main()