package utils;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionUtils {
    public static void inspect(Object obj) {
        Class<?> cl = obj.getClass();
        System.out.println("Class: " + cl.getName());

        System.out.println("Fields:");
        for (Field f : cl.getDeclaredFields()) {
            System.out.println("- " + f.getName());
        }

        System.out.println("Methods:");
        for (Method m : cl.getDeclaredMethods()) {
            System.out.println("- " + m.getName());
        }
    }
}