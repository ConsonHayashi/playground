#include <stdio.h>
#define null 0

typedef struct ListNode
{
  int data;
  struct ListNode *next;
};

struct ListNode makeListNode()
{
  const int length = 4;
  struct ListNode root, parent;
  for (int i = 0; i < length; i++)
  {
    struct ListNode node =
        {
            i + 1,
            null};
    if (i == 0)
    {
      root = node;
      parent = root;
    }
    else
    {
      parent.next = &node;
      parent = node;
    }
  }
  return root;
};

void printListNode(struct ListNode root)
{
  struct ListNode *parent;
  int data = root.data;
  while (parent->next != null)
  {
    int data = parent->data;
    printf("The data value is %d\n", data);
    parent = parent->next;
  }
}

int main()
{
  struct ListNode root = makeListNode();
  printListNode(root);
  return 0;
}
