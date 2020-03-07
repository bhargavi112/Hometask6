package com.epam.collection_project;
import java.util.Arrays;
public class Collection<E> {
	private int array=0;
    private static final int limit=10;
    private Object a[];
    public Collection() {
        a=new Object[limit];
    }
    public void insert(E e) {
        if(array==a.length) {
            categorize();
        }
        a[array++]=e;
    }
    @SuppressWarnings("unchecked")
    public E fetch(int i) {
        if(i>=array || i<0) {
            throw new IndexOutOfBoundsException("Index:"+i+",ArrayLen:"+i);
        }
        return (E) a[i];
    }
    @SuppressWarnings("unchecked")
    public E remove(int i) {
        if(i>=array || i<0) {
            throw new IndexOutOfBoundsException("Index:"+i+",ArrayLen:"+i);
        }
        Object o=a[i];
        int n=a.length-(i+1) ;
        System.arraycopy(a,i+1,a,i,n) ;
        array--;
        return (E) o;
    }
    public int array() {
        return array;
    } 
    @Override
    public String toString() 
    {
         StringBuilder s=new StringBuilder();
         s.append('[');
         for(int i=0;i<array;i++) {
             s.append(a[i].toString());
             if(i<array-1){
                 s.append(",");
             }
         }
         s.append(']');
         return s.toString();
    }
     
    private void categorize() {
        int len=a.length*2;
        a=Arrays.copyOf(a,len);
    }
}

