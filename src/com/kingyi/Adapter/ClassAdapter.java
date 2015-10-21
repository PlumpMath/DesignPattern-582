package com.kingyi.Adapter;

public class ClassAdapter extends Sour implements Target{
	
	//继承Sour 实现Target,从而拥有method2,又有Sour自己的method1
	
	@Override
	public void method2() {
		System.out.println("I get it");
	}
}
