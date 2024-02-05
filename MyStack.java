package org.example;

import java.util.Objects;
import java.util.Stack;

public class MyStack <T> {
    private int size;
    private MyStack.Node<T> first;
    private MyStack.Node<T> last;


    private static class Node<T> {
        T value;
        private MyStack.Node<T> next;
        private MyStack.Node<T> prev;


        public Node(T value) {
            this.value = value;
        }
    }
    public void push(T value) {
        MyStack.Node<T> node = new MyStack.Node<>(value);
        if (first == null) {
            first = node;
            last = node;
        } else {
            last.next = node;
            node.prev = last;
            last = node;
        }
        size++;
    }
    public T get (int indeks){
        Objects.checkIndex(indeks,size);
        MyStack.Node<T> current=first;
        for (int i=0; i<indeks; i++){
            current=current.next;
        }
        return current.value;
    }
    public int getSize() {
        return size;
    }

    public T peek(){
        return last.value;
    }

    public T pop(){
        T out= last.value;
        last=last.prev;
        size--;
        return out;

    }
    public void remove(int indeks) {

        if (indeks == 0) {
            first = first.next;
        } else if (indeks == size) {
            last = last.prev;
        }else {
            Objects.checkIndex(indeks,size);
            MyStack.Node<T> current=first;
            for (int i=0; i<indeks-1; i++){
                current=current.next;
            }
            Objects.checkIndex(indeks,size);
            MyStack.Node<T> current1=first;
            for (int i=0; i==indeks-1; i++){
                current1=current1.next;
            }
            current1.prev=current.prev;
            Objects.checkIndex(indeks,size);
            MyStack.Node<T> current2=first;
            for (int i=0; i<indeks-2; i++){
                current2=current2.next;
            }
            current2.next=current.next;
        }
        size--;
    }
    public void clear(){
        first=null;
        first.next=null;
    }

}
