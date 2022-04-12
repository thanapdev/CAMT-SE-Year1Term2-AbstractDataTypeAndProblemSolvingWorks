//Name : Thanapong Yamkamol
//ID : 642115022

import java.util.LinkedList;

public class stack<E> {
    private LinkedList<E> list = new LinkedList<E>();
  
    public int getSize() {
      return list.size();
    }
  
    public E peek() {
      return list.get(getSize() - 1);
    }
  
    public void push(E o) {
      list.add(o);
    }
  
    public E pop() {
      E o = list.get(getSize() - 1);
      list.remove(getSize() - 1);
      return o;
    }
  
    public boolean isEmpty() {
      return list.isEmpty();
    }
    
    @Override
    public String toString() {
      return "stack: " + list.toString();
    }
  }