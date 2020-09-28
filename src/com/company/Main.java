package com.company;

import java.io.File;
import java.lang.reflect.Method;
import java.lang.reflect.Field;
import java.lang.reflect.Constructor;

public class Main {

    public static void main(String[] args) throws Exception {
        /*Class*/
        //Child 클래스의 정보를 clazz 에 할당
        Class clazz = Child.class;

        //Class name : com.company.Child
        //getName()은 클래스의 이름을 리턴
        System.out.println("Class name : " + clazz.getName());

        //forName()은 클래스 이름을 인자로 전달하여 클래스 정보를 가져옴
        Class clazz2 = Class.forName("com.company.Child");
        System.out.println("Class name : " + clazz2.getName());

        /*Constructor*/
        //getDeclaredConstructor()는 인자 없는 생성자를 가져옴
        Constructor constructor = clazz.getDeclaredConstructor();
        System.out.println("Constructor : " + constructor.getName());

        //인자를 넣으면 그 타입과 일치하는 생성자를 찾음
        Constructor constructor2 = clazz.getDeclaredConstructor(String.class);
        System.out.println("Constructor(String) : " + constructor2.getName());

        //클래스의 private, public 등 모든 생성자를 리턴
        Constructor constructors[] = clazz.getDeclaredConstructors();
        for(Constructor cons : constructors){
            System.out.println("Get constructors in Child : " + cons);
        }

        //public 생성자만 리턴
        Constructor constructors2[] = clazz.getConstructors();
        for(Constructor cons : constructors2){
            System.out.println("Get public constructors in Child : " + cons);
        }

        /*Method*/
        //getDeclaredMethod()의 인자로 메소드의 파라미터 정보(이름, 매개변수 타입)를 넘겨주면 일치하는 것을 찾아줌
        Method method1 = clazz.getDeclaredMethod("method4", int.class);
        System.out.println("Find out method4 in Child : " + method1);

        //모든 메소드를 찾는다.
        //함수 이름에 Declared가 들어가면 Super클래스의 정보는 가져오지 않는다.
        Method methods[] = clazz.getDeclaredMethods();
        for (Method method : methods){
            System.out.println("Get methods in Child : " + method);
        }

        //getMethods()는 public 메소드를 리턴해주며, 상속받는 메소드도 모두 찾아준다.
        Method methods2[] = clazz.getMethods();
        for (Method method : methods2){
            System.out.println("Get public methods in both Parent and Child : " + methods2);
        }

        /*Field*/
        //getDeclaredField()에 전달된 이름과 일치하는 Field를 찾음
        Field field = clazz.getDeclaredField("cstr1");
        System.out.println("Find out cstr1 field in Child : " + field);

        //getDeclaredFields()는 객체에 선언된 모든 Field를 찾음(상속 x)
        Field fields[] = clazz.getDeclaredFields();
        for (Field fieldss : fields){
            System.out.println("Get fields in Child : " + fieldss);
        }

        //getFields()는 상속받은 클래스를 포함한 모든 public Field를 찾아줌줌
        Field fields2[] = clazz.getFields();
        for (Field fieldss : fields2){
            System.out.println("Get public fields in both Parent and Child : " + fields2);
        }

        /*Method Call*/
        //int returnValue = (int) method1.invoke(method1, 10);
        //System.out.println("return value : " + returnValue);
    }
}
