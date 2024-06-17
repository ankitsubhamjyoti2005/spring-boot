package org.example.classes;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class personInvocationHandler implements InvocationHandler {
    private person Person;

    public personInvocationHandler(person Person){
        this.Person = Person;

    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] aurgs){
        System.out.println("hi");
        return null;
    }
}
