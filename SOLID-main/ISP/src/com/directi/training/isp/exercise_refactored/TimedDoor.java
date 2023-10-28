package com.directi.training.isp.exercise_refactored;

public class TimedDoor implements Lockable, Openable, Timed {
    private static final int TIME_OUT = 100;
    private boolean _locked;
    private boolean _opened;

    public TimedDoor(Timer timer) {
        timer.register(TIME_OUT, this);
    }

    @Override
    public void lock() {
        _locked = true;
    }

    @Override
    public void unlock() {
        _locked = false;
    }

   

  

    @Override
    public void timeOutCallback() {
        _locked = true;
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
}
