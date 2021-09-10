package decoratorDP.pizza.decorator;

import decoratorDP.pizza.Pizza;

public class TomatoDecorator extends PizzaDecorator{
	public TomatoDecorator(Pizza pizza){
		super(pizza);
		this.cost=30;
		this.description="Tomato";
	}
	@Override
	public double getCost(){
		return pizza.getCost()+cost;
	}
	@Override
	public String getDescription(){
		return pizza.getDescription()+","+"Tomato";
	}
}
