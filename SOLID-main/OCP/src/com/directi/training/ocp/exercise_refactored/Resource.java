package com.directi.training.ocp.exercise_refactored;

public abstract class Resource {
	protected int resourceId;
	
	public abstract int allocate();
    public abstract void free(int resourceId);
    
	public int getResourceId() {
		return resourceId;
	}
	public void setResourceId(int resourceId) {
		this.resourceId = resourceId;
	}
    
    

}
