package org.example;

import java.util.Objects;
import java.util.Queue;

public class MyQueue <T> {

        private int size;
        private Node<T> first;
        private Node<T> last;


        private static class Node<T> {
            T value;
            private Node<T> next;
            private Node<T> prev;


            public Node(T value) {
                this.value = value;
            }
        }
        public void add(T value) {
            Node<T> node = new Node<>(value);
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
            Node<T> current=first;
            for (int i=0; i<indeks; i++){
                current=current.next;
            }
            return current.value;
        }
        public int getSize() {
            return size;
        }

        public T peek(){
            return first.value;
        }

    public T poll(){
            T out= first.value;
            first=first.next;
            size--;
        return out;

    }
        public void clear(){
            first=null;
            last=null;
            }
}
