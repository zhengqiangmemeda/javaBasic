/**
 * 
 */
package interface9;

/**   
 * @ClassName:  Ex13   
 * @Description:TODO(������һ�仰��������������)   
 * @author: zhengqiang
 * @date:   2017��12��30�� ����11:18:56
 */

interface A{
	public static final int AA=2;
	public void print();
}

interface B extends A{
	public void printB();
}

interface C extends A{
	public void printC();
}

class D implements B,C{

	public void print() {
		// TODO Auto-generated method stub
			System.out.println(AA);
	}

	public void printC() {
		// TODO Auto-generated method stub
		
	}

	public void printB() {
		// TODO Auto-generated method stub
		
	}
}

public class Ex13 {

	/**   
	 * @Title: main   
	 * @Description: TODO(������һ�仰�����������������)   
	 * @param: @param args      
	 * @return: void      
	 * @throws   
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b=new D();
		b.print();
		D d=new D();
		d.print();
	}

}
