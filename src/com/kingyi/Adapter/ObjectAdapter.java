package com.kingyi.Adapter;

//����ӿ�Targetû������Ҫ�ķ���

public class ObjectAdapter{
	
	private Sour sour;
	
	public ObjectAdapter(Sour sour){
		this.sour = sour;
	}
	
	//������ֱ��ί�ɼ���
	public void method1(){
		this.sour.method1();
	}
	
	//�������Լ��ṩ
	public void method2(){
		System.out.println("i create method2");
	}
}


//����ӿ�Target������Ҫ�ķ��������Կ���ʵ�ָýӿ�

/*public class ObjectAdapter implements Target{
	
	private Sour sour;
	
	public ObjectAdapter(Sour sour){
		this.sour = sour;
	}
	
	//������ֱ��ί�ɼ���
	@Override
	public void method1() {
		this.sour.method1();
	}
	
	//�������Լ�ʵ��
	@Override
	public void method2() {
		System.out.println("i create method2");
	}
		
}*/
