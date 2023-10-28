package com.directi.training.isp.exercise_refactored;


public class SensingDoor implements Openable, Sensing {
    private boolean _locked;
    private boolean _opened;
    
    @Override
    public void proximityCallback()
    {
        _opened = true;
    }
	@Override
	public void open() {
		
		if (!_locked) {
            _opened = true;
        }// TODO Auto-generated method stub
		
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		 _opened = false;
	}

    // Constructeur et autres méthodes restent inchangés
}