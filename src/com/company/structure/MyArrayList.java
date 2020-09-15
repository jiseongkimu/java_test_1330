package com.company.structure;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
 /*
    ArrayList LinkedList 차이점 조사
  */
public class MyArrayList<E> implements List {
    
    private E arr[];

    @Override
    public int size() { return arr.length; }

    @Override
    public boolean isEmpty() { return arr.length == 0 ? true : false; }

    @Override//해당 객체를 가지고 있니?
    public boolean contains(Object o) {
        for(int i = 0 ; i < arr.length-1 ; i++)
            if(arr[i] == o)
                return true;
        return false;
    }

    @Override//@@모릅니다
    public Iterator iterator() {
        return null;
    }

    @Override//List 컨테이너의 인스턴스를 배열(array)로 만듦.
    public Object[] toArray() {

        return new Object[0];
    }

    @Override
    public boolean add(Object o) {
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override//하나의 자료구조에 또 다른 자료구조의 엘리먼트를 넣음
    public boolean addAll(Collection c) {
        return false;
    }

    @Override//index를 명시하여 해당 공간에 addAll()
    public boolean addAll(int index, Collection c) {
        return false;
    }

    @Override//전부 삭제
    public void clear() {

    }

    @Override//내부의 엘리먼트를 가져옴
    public Object get(int index) {
        return arr[index];
    }

    @Override//특정 인덱스에 원하는 값 설정
    public Object set(int index, Object element) {
       // arr[index] = element
        return null;
    }

    @Override//특정 인덱스에 값 넣기
    public void add(int index, Object element) {
        for(int i = arr.length-1 ; i >= index ; i--) {
            arr[i + 1] = arr[i];
        }
        //arr[index] = element;

    }

    @Override//특정 인덱스에 값 삭제
    public Object remove(int index) {
        for(int i = index ; i < arr.length-1 ; i++)
            arr[i] = arr[i+1];
        return null;
    }

    @Override//해당 엘리먼트의 인덱스를 알려줌
    public int indexOf(Object o) {
        for(int i = 0 ; i < arr.length-1 ; i++)
            if (arr[i] == o)
                return i;
        return -1;
    }

    @Override//엘리먼트중 가장 뒤에있는 index출력, 없으면 -1
    public int lastIndexOf(Object o) {
        int compare1, compare2;
        for(int i = 0 ; i < arr.length-1 ; i++) {
            if (arr[i] == o) {
                if()
                compare1 = i;
            }
        }
    }

    @Override
    public ListIterator listIterator() {
        return null;
    }

    @Override
    public ListIterator listIterator(int index) {
        return null;
    }

    @Override
    public List subList(int fromIndex, int toIndex) {
        return null;
    }

    @Override
    public boolean retainAll(Collection c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection c) {
        return false;
    }

    @Override
    public boolean containsAll(Collection c) {
        return false;
    }

    @Override
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }
}
