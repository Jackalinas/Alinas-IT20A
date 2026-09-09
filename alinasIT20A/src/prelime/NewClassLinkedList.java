/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prelime;

/**
 *
 * @author admin
 */
public class NewClassLinkedList {

    

   
    
    class Node{
    int data;
    Node next;
    
    Node(int date){
        this.data = data;
        this.next = null;
    }
    }
    Node head;
    void add(int data){
        
        Node newNode = new Node(data);
        if (head == null){
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null){
            current = current.next;
        }
        current.next = newNode;
    }
    void display(){
        Node current = head;
        
        while (current != null){
            System.out.print(current.data  + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
    void disyplaynodes(){
        Node current = head;
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
        NewClassLinkedList list = new NewClassLinkedList();
        list.add(10);
        list.add(20);
        list.add(30);
        
        list.display();
        
        list.displaynodes();
    }
}

   

