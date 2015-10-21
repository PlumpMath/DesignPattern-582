package com.kingyi.Adapter;

//如果接口Target没有我想要的方法

public class ObjectAdapter{
	
	private Sour sour;
	
	public ObjectAdapter(Sour sour){
		this.sour = sour;
	}
	
	//适配器直接委派即可
	public void method1(){
		this.sour.method1();
	}
	
	//适配器自己提供
	public void method2(){
		System.out.println("i create method2");
	}
}


//如果接口Target有我想要的方法，可以考虑实现该接口

/*public class ObjectAdapter implements Target{
	
	private Sour sour;
	
	public ObjectAdapter(Sour sour){
		this.sour = sour;
	}
	
	//适配器直接委派即可
	@Override
	public void method1() {
		this.sour.method1();
	}
	
	//适配器自己实现
	@Override
	public void method2() {
		System.out.println("i create method2");
	}
		
}*/
