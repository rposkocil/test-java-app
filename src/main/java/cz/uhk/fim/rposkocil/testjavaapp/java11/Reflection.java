package cz.uhk.fim.rposkocil.testjavaapp.java11;

import java.lang.reflect.Method;

/**
 * Reflection Class
 * - java 1.1
 */
public class Reflection {

    Method[] methods = {};

    public Method[] getMethods() {
        return methods;
    }

    public void useReflection() {

        methods = InnerClazz.class.getMethods();

        for(Method method : methods){
            System.out.println("Method " + method.getName());
        }
    }
}
