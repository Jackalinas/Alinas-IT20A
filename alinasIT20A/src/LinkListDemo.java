



public class LinkListDemo {
    class node{
    int data;
    node next;
    
    node(int date){
        this.data = data;
        this.next = null;
    }
    }
    node head;
    void add(int data){
        
        node newNode = new node(data);
        if (head == null){
            head = newNode;
            return;
        }
        node current = head;
        while (current.next != null){
            current = current.next;
        }
        current.next = newNode;
    }
    void display(){
        node current = head;
        
        while (current != null){
            System.out.print(current.data  + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
    void disyplaynodes(){
        node current = head;
        while (current != null){
            System.out.println("data: " + current.data);
            System.out.println("| current pointers: " + current);
            System.out.println("| next: ");
            
            if (current.next != null){
                System.out.println(current.next);
            }else{
                System.out.println("null");
            }
            current = current.next;
        }
    }
    
    public static void main (String [] args){
        singlyLinkedList list = new singlyLinkedList();
        list.add(10);
        list.add(20);
        list.add(30);
        list.display();
        list.displaynodes();
    }
}
