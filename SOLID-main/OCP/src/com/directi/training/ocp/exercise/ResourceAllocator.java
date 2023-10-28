package com.directi.training.ocp.exercise;

public class ResourceAllocator {
    private static final int INVALID_RESOURCE_ID = -1;

    public int allocate(ResourceType resourceType) {
        return resourceType.getResource().allocate();
    }

    public void free(ResourceType resourceType, int resourceId) {
        resourceType.getResource().free(resourceId);
    }
}
