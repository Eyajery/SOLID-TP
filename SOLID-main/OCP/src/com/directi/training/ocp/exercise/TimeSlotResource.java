package com.directi.training.ocp.exercise;
public class TimeSlotResource implements Resource {
    private int[] timeSlots;
    private int nextFreeSlot;

    public TimeSlotResource(int numberOfSlots) {
        timeSlots = new int[numberOfSlots];
        nextFreeSlot = 0;
    }

    private int findFreeTimeSlot() {
        for (int i = 0; i < timeSlots.length; i++) {
            if (timeSlots[i] == 0) {
                return i;
            }
        }
        return -1; // Aucun créneau horaire disponible
    }

    @Override
    public int allocate() {
        int resourceId = findFreeTimeSlot();
        if (resourceId != -1) {
            timeSlots[resourceId] = 1; // Marquez le créneau horaire comme occupé
        }
        return resourceId;
    }

    @Override
    public void free(int resourceId) {
        if (resourceId >= 0 && resourceId < timeSlots.length) {
            timeSlots[resourceId] = 0; // Libérez le créneau horaire
        }
    }
}

