package observerDP.cricketData;

import observerDP.subject.Subject;
import observerDP.observer.Observer;
import java.util.Set;
import java.util.HashSet;

public class CricketData implements Subject{
	private int wickets,runs,overs;
	private final Set<Observer>observers;
	public CricketData(){
		observers=new HashSet<>();
	}
	public int getWickets(){
		return wickets;
	}
	public void setWickets(final int wickets){
		this.wickets=wickets;
	}
	public int getRuns(){
		return runs;
	}
	public void setRuns(final int runs){
		this.runs=runs;
	}
	public int getOvers(){
		return overs;
	}
	public void setOvers(final int overs){
		this.overs=overs;
	}
	@Override
	public void addObserver(final Observer observer){
		observers.add(observer);
	}
	@Override
	public void removeObserver(final Observer observer){
		observers.remove(observer);
	}
	@Override
	public void updateObservers(){
		for(final Observer observer:observers)
			observer.update(wickets,runs,overs);
	}

}
