/**
 * 
 */
package interface9;

/**   
 * @ClassName:  Ex14   
 * @Description:TODO(这里用一句话描述这个类的作用)   
 * @author: zhengqiang
 * @date:   2017年12月30日 下午3:32:28
 */

interface A1{
	 void sayA1();
	 void danceA1();
}

interface A2{
	 void sayA2();
	 void danceA2();
}

interface A3{
	 void sayA3();
	 void danceA3();
}

interface B1 extends A1,A2,A3{
	 void sayB1();
}

class C1{
	public void sayC1(){
		System.out.println("sayC1()");
	}
}

class D1  extends C1 implements B1{

	public void sayA1() {
		// TODO Auto-generated method stub
		System.out.println("sayA1()");
	}

	public void danceA1() {
		// TODO Auto-generated method stub
		System.out.println("danceA1()");
	}

	public void sayA2() {
		// TODO Auto-generated method stub
		System.out.println("sayA2()");
	}

	public void danceA2() {
		// TODO Auto-generated method stub
		System.out.println("danceA2()");
	}

	public void sayA3() {
		// TODO Auto-generated method stub
		System.out.println("sayA3()");
	}

	public void danceA3() {
		// TODO Auto-generated method stub
		System.out.println("danceA3()");
	}

	public void sayB1() {
		// TODO Auto-generated method stub
		System.out.println("sayB1()");
	}
	
}

public class Ex14 {

	/**   
	 * @Title: main   
	 * @Description: TODO(这里用一句话描述这个方法的作用)   
	 * @param: @param args      
	 * @return: void      
	 * @throws   
	 */
	public static void say1(A1 a){a.sayA1();}
	public static void say2(A2 a){a.sayA2();}
	public static void say3(A3 a){a.sayA3();}
	public static void say4(B1 a){a.danceA1();a.sayA1();}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		D1 d=new D1();
		say1(d);
		say2(d);
		say3(d);
		say4(d);
	}

}
