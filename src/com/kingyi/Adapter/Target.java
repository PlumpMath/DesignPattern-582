package com.kingyi.Adapter;

public interface Target {
	
	//源文件拥有该方法
	public void method1();
	
	//源文件没有该方法，想拥有
	public void method2();
}
