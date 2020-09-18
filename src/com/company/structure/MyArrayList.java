package com.company.structure;

import java.util.*;

/*
   ArrayList LinkedList 차이점 조사
 */
public class MyArrayList<E> implements List {
    
    private Object[] arr = new Object[2];
    private int size = 0;

    @Override
    public int size() { return size; }

    @Override
    public boolean isEmpty() { return arr.length == 0 ? true : false; }

    @Override//해당 객체를 가지고 있니?
    public boolean contains(Object o) {
        for(int i = 0 ; i < arr.length-1 ; i++)
            if (arr[i].equals(o))
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
        // 1 2 3  add(4) arr.lenth = 3 size 3
        increaseArray();
        arr[size] = o;
        size++;
        return true;
    }

    private void increaseArray() {
        if(arr.length == size) {
            Object[] newArr = new Object[size * 2];
            // arr 잇었던 요소들을 newArr로 옮겨주는 작업이 필요함.
            for(int i =0; i<arr.length; i++)
                newArr[i] = arr[i];

            arr = newArr;
        }
    }

    @Override//특정 인덱스에 값 넣기
     public void add(int index, Object element) {
        increaseArray();
         for(int i = arr.length-1 ; i >= index ; i--) {
             arr[i] = arr[i+1];
         }
         arr[index] = element;
         size++;
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
        for(int i = 0 ; i < arr.length-1 ; i++) {
            remove(i);
        }
    }

    @Override//내부의 엘리먼트를 가져옴
    public Object get(int index) {
        return arr[index];
    }

    @Override//특정 인덱스에 원하는 값 설정
    public Object set(int index, Object element) {
        arr[index] = element;
        return null;
    }


    @Override//특정 인덱스의 값 삭제
    public Object remove(int index) {
        for(int i = index+1 ; i <= arr.length-1 ; i++)
            arr[i-1] = arr[i];
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
//        int compare1, compare2;
//        for(int i = 0 ; i < arr.length-1 ; i++) {
//            if (arr[i] == o) {
//                //if() 조건식 젠젠 와카라나이
//                compare1 = i;
//            }
    //}
        return 0;
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

    @Override
    public String toString() {
        return "MyArrayList{" +
                "arr=" + Arrays.toString(arr) +
                ", size=" + size +
                '}';
    }
}
