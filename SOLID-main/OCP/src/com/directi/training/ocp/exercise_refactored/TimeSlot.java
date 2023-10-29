package com.directi.training.ocp.exercise_refactored;

public class TimeSlot extends Resource {

	@Override
	public int allocate() {
		resourceId = findFreeTimeSlot();
        markTimeSlotBusy(resourceId);
        return resourceId;
	}

	@Override
	public void free(int resourceId) {
		markTimeSlotFree(resourceId);
	}
	
	private void markTimeSlotFree(int resourceId)
    {
    }
	
	private void markTimeSlotBusy(int resourceId)
    {
    }

    private int findFreeTimeSlot()
    {
        return 0;
    }

}
