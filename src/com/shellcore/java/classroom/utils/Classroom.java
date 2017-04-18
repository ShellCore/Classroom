package com.shellcore.java.classroom.utils;

/**
 * Created by Cesar. 17/04/2017.
 */
public class Classroom {

    private int roomNumber;
    private int roomCapacity;

    private static int aviableRoomNumber = 101;
    private static Classroom highestClassroom;

    public Classroom(int roomCapacity) {
        this.roomCapacity = roomCapacity;

        roomNumber = aviableRoomNumber;
        aviableRoomNumber++;

        if (highestClassroom == null || highestClassroom.getCapacity() < this.roomCapacity) {
            highestClassroom = this;
        }
    }

    public static int getNumberOfClassrooms() {
        return aviableRoomNumber - 101;
    }

    public int getClassroomRoomNumber() {
        return roomNumber;
    }

    public int getCapacity() {
        return roomCapacity;
    }

    public static Classroom getMaxCapacityClassroom() {
        return highestClassroom;
    }

    @Override
    public String toString() {
        return "Classroom: " + roomNumber
                + ", Capacity: " + roomCapacity;
    }
}
