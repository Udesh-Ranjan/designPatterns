package observerDP.display;

import java.io.PrintStream;
import observerDP.observer.Observer;

public class CurrentScoreDisplay implements Observer{
	private int wickets,runs,overs;
	public void update(final int wickets,final int runs,final int overs){
		this.wickets=wickets;
		this.runs=runs;
		this.overs=overs;
	}
	public void display(){
		final PrintStream out=System.out;
		out.println("wickets : "+wickets);
		out.println("runs : "+runs);
		out.println("overs : "+overs);
	}
}
