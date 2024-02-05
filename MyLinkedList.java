package org.example;

//import org.w3c.dom.Node;

//import java.util.LinkedList;

import java.util.LinkedList;
import java.util.Objects;

public class MyLinkedList <T> {

    private int size;
    private Node<T> head;
    private Node<T> tail;

    private static class Node<T> {
        T value;
        Node<T> next;
        Node<T> prev;

        public Node(T value) {
            this.value = value;
        }
    }

    public void add(T value) {
        Node<T> node = new Node<>(value);
        if (head == null) {
            head = node;
            tail = node;
        } else {
            tail.next = node;
            node.prev = tail;
            tail = node;
        }
        size++;
    }
public T get (int indeks){
    Objects.checkIndex(indeks,size);
    Node <T> current=head;
    for (int i=0; i<indeks; i++){
        current=current.next;
    }
    return current.value;
}
    public int getSize() {
        return size;
    }
    public void remove(int indeks) {

        if (indeks == 0) {
            head = head.next;
        } else if (indeks == size) {
            tail = tail.prev;
        }else {
            Objects.checkIndex(indeks,size);
            Node <T> current=head;
            for (int i=0; i<indeks-1; i++){
                current=current.next;
            }
            Objects.checkIndex(indeks,size);
            Node <T> current1=head;
            for (int i=0; i==indeks-1; i++){
                current1=current1.next;
            }
            current1.prev=current.prev;
            Objects.checkIndex(indeks,size);
            Node <T> current2=head;
            for (int i=0; i<indeks-2; i++){
                current2=current2.next;
            }
            current2.next=current.next;
        }
        size--;
    }
    public void clear(){
        head=null;
        tail=null;

    }

}
