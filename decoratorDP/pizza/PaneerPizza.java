package decoratorDP.pizza;


public class PaneerPizza extends Pizza{
	public PaneerPizza(){
		description="Paneer";
		cost=60.0;
	}
	@Override
	public String getDescription(){
		return description;
	}
	@Override
	public double getCost(){
		return cost;
	}
}
