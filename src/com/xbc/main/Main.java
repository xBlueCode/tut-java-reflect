package com.xbc.main;

import com.xbc.inspector.ClassInspector;
import com.xbc.school.EasyMath;
import com.xbc.school.Student;

public class Main {

    public static void main(String[] args) {

        ClassInspector.inspectClass(new Student(
                "Ahmed", "Bes",new int[]{75,84,65,90}));

        ClassInspector.inspectClass(new EasyMath());
    }

}
