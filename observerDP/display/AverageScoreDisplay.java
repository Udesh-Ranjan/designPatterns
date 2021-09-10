package observerDP.display;

import observerDP.observer.Observer;
import java.io.PrintStream;

public class AverageScoreDisplay implements Observer{
	private int wickets,runs,overs;
	@Override
	public void update(final int wickets,final int runs,final int overs){
		this.wickets=wickets;
		this.runs=runs;
		this.overs=overs;
	}
	public void display(){
		final PrintStream out=System.out;
		double runrate=runs;
		runrate/=overs;
		out.println("runrate : "+runrate);
		out.println("projected score : "+(int)(runrate*50));
	}
}


