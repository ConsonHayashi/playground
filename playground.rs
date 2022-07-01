fn main() {
    let root = make_list_node();
    root.print();
}

fn make_list_node() -> ListNode {
    let mut root: ListNode;
    let mut parent: ListNode;
    for i in 0..5 {
        let node = ListNode::from(i);
        if i == 0 {
            root = node;
            parent = node;
        } else {
            parent = node;
            parent.next = &mut parent;
        }
    }
    return root;
}

pub struct ListNode {
    pub data: i8,
    pub next: *const ListNode,
}

impl ListNode {
    pub fn print(&self) {
        let mut parent: *const ListNode = self;
        while (*parent).next != Option::None {
            println!("{}", (*parent).data);
            parent = parent.next;
        }
        println!("{}", (*parent).data);
    }
    pub fn from(data: i8) -> Self {
        return ListNode {
            data: data,
            next: Option::None,
        };
    }
}
