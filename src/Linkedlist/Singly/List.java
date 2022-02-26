package Linkedlist.Singly;




class List {

    List head = null;

    int data;
    List next;

    void insert(int data) {
        List tmp;
        List list = new List();
        if (head == null) {
            list.data = data;
            list.next = null;
            head = list;
        }
        else {
            tmp = head;
            while (tmp.next != null) {
                tmp = tmp.next;
            }
            tmp.next = new List();
            tmp.next.data = data;
        }

    }

    void print() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        List tmp = head;
        if (tmp.next == null)
            System.out.println(tmp.data);
        while(tmp.next != null) {
            System.out.println(tmp.data);
            tmp = tmp.next;
        }
        System.out.println(tmp.data);
    }


    public static void main(String[] args) {
        List list = new List();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(2);
        list.insert(4);
        list.insert(5);

        list.print();


    }
}