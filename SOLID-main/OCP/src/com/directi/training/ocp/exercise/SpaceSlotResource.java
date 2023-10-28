package com.directi.training.ocp.exercise;

public class SpaceSlotResource implements Resource {
    private int[] spaceSlots;
    private int nextFreeSlot;

    public SpaceSlotResource(int numberOfSlots) {
        spaceSlots = new int[numberOfSlots];
        nextFreeSlot = 0;
    }

    private int findFreeSpaceSlot() {
        for (int i = 0; i < spaceSlots.length; i++) {
            if (spaceSlots[i] == 0) {
                return i;
            }
        }
        return -1; // Aucun espace disponible
    }

    @Override
    public int allocate() {
        int resourceId = findFreeSpaceSlot();
        if (resourceId != -1) {
            spaceSlots[resourceId] = 1; // Marquez l'espace comme occupé
        }
        return resourceId;
    }

    @Override
    public void free(int resourceId) {
        if (resourceId >= 0 && resourceId < spaceSlots.length) {
            spaceSlots[resourceId] = 0; // Libérez l'espace
        }
    }
}
