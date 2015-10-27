package com.kingyi.AbstractAdapter;

/*public class T_Sour implements ITarget{

	@Override
	public void listen() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void talk() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void look() {
		// TODO Auto-generated method stub
		
	}

}
*/
public class T_Sour extends AbstractAdapter{
	//实现自己需要的方法
	
	@Override
	public void listen() {
		System.out.println("i'm listening");
	}
}