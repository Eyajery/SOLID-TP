package com.directi.training.ocp.exercise;

public enum ResourceType {
    TIME_SLOT(new TimeSlotResource(10)), // Exemple : 10 créneaux horaires disponibles
    SPACE_SLOT(new SpaceSlotResource(20)); // Exemple : 20 espaces disponibles

    private final Resource resource;

    ResourceType(Resource resource) {
        this.resource = resource;
    }

    public Resource getResource() {
        return resource;
    }
}

