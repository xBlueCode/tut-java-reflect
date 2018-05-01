package com.xbc.inspector;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class ClassInspector {

    private ClassInspector(){ }

    public static void inspectClass(Object object){
        Class cls = object.getClass();

        System.out.println("==================================================");
        System.out.println("Inspecting the Class : " + cls.getName());
        System.out.println("==================================================");
        System.out.println("Belongs to: " + cls.getPackage());
        System.out.println("Class Name: "+ cls.getSimpleName());
        System.out.println("-----------");
        System.out.format("Contains %d Constructor \n", cls.getConstructors().length);
        inspectConstructors(cls.getConstructors());
        System.out.println("-----------");
        System.out.format("Contains %d declared Methods \n", cls.getDeclaredMethods().length);
        inspectMethod(cls.getDeclaredMethods());

    }
    private static void inspectConstructors(Constructor ... constructors) {
        if (constructors.length != 0) {
            for (int i = 0; i < constructors.length; i++) {
                System.out.println(" - Cosnstructor" + (i+1) + ":");
                System.out.format("    Accepts %d parameters. \n",constructors[i].getParameterCount());
                if (constructors[i].getParameterCount() != 0) {
                    for (Parameter parameter : constructors[i].getParameters()){
                        System.out.println("      "+parameter.getType());
                    }
                }
            }
        }
    }

    private static void inspectMethod(Method ... methods){
        if (methods.length != 0) {
            for (int i = 0; i < methods.length; i++) {
                System.out.println(" - Method" + (i+1) + " : " + methods[i].getName());
                System.out.format("    Accepts %d parameters. \n",methods[i].getParameterCount());
                for (Parameter parameter : methods[i].getParameters()){
                    System.out.println("      "+parameter.getType());
                }
                System.out.println("    Return Type : " + methods[i].getReturnType());

                System.out.println("");
            }
        }
    }
}
