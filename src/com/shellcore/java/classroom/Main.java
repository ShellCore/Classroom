package com.shellcore.java.classroom;

import com.shellcore.java.classroom.utils.Classroom;

/**
 * Created by Cesar. 18/04/2017.
 */
public class Main {

    public static void main(String[] args) {

        // Prueba del comportamiento de los salones de clases

        Classroom c1 = new Classroom(50);
        System.out.println("C1: " + c1.toString());
        System.out.println("Número de salones: " + Classroom.getNumberOfClassrooms());
        System.out.println("Salón con mayor capacidad: " + Classroom.getMaxCapacityClassroom().getClassroomRoomNumber());
        System.out.println("Capacidad del salón más grande: " + Classroom.getMaxCapacityClassroom().getCapacity());

        Classroom c2 = new Classroom(60);
        System.out.println("C2: " + c2.toString());
        System.out.println("Número de salones: " + Classroom.getNumberOfClassrooms());
        System.out.println("Salón con mayor capacidad: " + Classroom.getMaxCapacityClassroom().getClassroomRoomNumber());
        System.out.println("Capacidad del salón más grande: " + Classroom.getMaxCapacityClassroom().getCapacity());

        Classroom c3 = new Classroom(40);
        System.out.println("C3: " + c3.toString());
        System.out.println("Número de salones: " + Classroom.getNumberOfClassrooms());
        System.out.println("Salón con mayor capacidad: " + Classroom.getMaxCapacityClassroom().getClassroomRoomNumber());
        System.out.println("Capacidad del salón más grande: " + Classroom.getMaxCapacityClassroom().getCapacity());
    }
}
