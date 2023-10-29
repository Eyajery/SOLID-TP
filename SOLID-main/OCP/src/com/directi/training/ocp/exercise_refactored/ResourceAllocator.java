package com.directi.training.ocp.exercise_refactored;

public class ResourceAllocator {
	
	private static final int INVALID_RESOURCE_ID = -1;

    public int allocate(Resource resource) throws InvalidResourceException{
    	int resourceId = resource.allocate();
        if (resourceId == INVALID_RESOURCE_ID) {
            throw new InvalidResourceException("Attempted to allocate an invalid resource.");
        }
        return resourceId;
    }

    public void free(Resource resource, int resourceId) throws InvalidResourceException {
    	if (resourceId == INVALID_RESOURCE_ID) {
            throw new InvalidResourceException("Attempted to free an invalid resource.");
        }
        resource.free(resourceId);
    }

}
