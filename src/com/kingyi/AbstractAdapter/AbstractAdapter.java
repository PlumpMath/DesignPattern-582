package com.kingyi.AbstractAdapter;

public abstract class AbstractAdapter implements ITarget{
	
	//通过抽象适配器类实现ITarget的方法，从而继承该类的子类可以选择性的实现某些方法
	
	//可以具体实现
	public void listen(){};
	public void talk(){};
	public void run(){};
	public void look(){};
}
