package decoratorDP.christmasTree.decorator;

import decoratorDP.christmasTree.ChristmasTree;

public abstract class TreeDecorator implements ChristmasTree{
	private ChristmasTree tree;
	public TreeDecorator(final ChristmasTree tree){
		this.tree=tree;
	}
	@Override
	public String decorate(){
		return tree.decorate();
	}
}
