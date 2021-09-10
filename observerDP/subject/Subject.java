package observerDP.subject;

import observerDP.observer.Observer;

public interface Subject{
	public abstract void updateObservers();
	public abstract void addObserver(final Observer observer);
	public abstract void removeObserver(final Observer observer);
}



