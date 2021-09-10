package decoratorDP.pizza;

public class Margherita extends Pizza{
	public Margherita(){
		description="Margherita";
		cost=70.0;
	}
	@Override
	public String getDescription(){
		return description;
	}
	@Override
	public Double getCost(){
		return cost;
	}
}
