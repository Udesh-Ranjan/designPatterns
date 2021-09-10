package observerDP;

import observerDP.cricketData.CricketData;
import observerDP.display.AverageScoreDisplay;
import observerDP.display.CurrentScoreDisplay;

import java.io.PrintStream;
public class MainClass{
	public static final PrintStream out=System.out;
	public static void main(String $[]){
		CricketData data=new CricketData();
		data.setRuns(100);
		data.setOvers(10);
		data.setWickets(3);
		AverageScoreDisplay avg=new AverageScoreDisplay();
		CurrentScoreDisplay curr=new CurrentScoreDisplay();
		data.addObserver(avg);
		data.addObserver(curr);
		data.updateObservers();
		avg.display();
		curr.display();
	}
}
