package decoratorDP.christmasTree.decorator;

import decoratorDP.christmasTree.ChristmasTree;
import decoratorDP.christmasTree.decorator.TreeDecorator;

public class Garland extends TreeDecorator{
	public Garland(final ChristmasTree tree){
		super(tree);
	}
	@Override
	public String decorate(){
		return super.decorate()+decorateGarland();
	}
	private String decorateGarland(){
		return " with GarLand";
	}
}
