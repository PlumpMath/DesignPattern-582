package com.kingyi.Adapter;

public class ClassAdapter extends Sour implements Target{
	
	//�̳�Sour ʵ��Target,�Ӷ�ӵ��method2,����Sour�Լ���method1
	
	@Override
	public void method2() {
		System.out.println("I get it");
	}
}
