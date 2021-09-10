package decoratorDP.pizza;

public class NormalPizza extends Pizza{
	public NormalPizza(){
		description="Pizza";
		cost=50.0;
	}
	public String getDescription(){
		return description;
	}
	public double getCost(){
		return cost;
	}
}
