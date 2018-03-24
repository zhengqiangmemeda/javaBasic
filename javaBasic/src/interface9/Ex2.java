/**
 * 
 */
package interface9;

/**   
 * @ClassName:  Exercise1   
 * @Description:TODO(这里用一句话描述这个类的作用)   
 * @author: zhengqiang
 * @date:   2017年12月30日 上午9:31:05
 */

abstract class Nogo1{
	Nogo1(){
		System.out.println("Nogo1()");
	}
}

abstract class Nogo2{
	
}


class Go1 extends Nogo1{
	Go1(){
		System.out.println("Go1()");
	}
}

public class Ex2 {

	/**   
	 * @Title: main   
	 * @Description: TODO(这里用一句话描述这个方法的作用)   
	 * @param: @param args      
	 * @return: void      
	 * @throws   
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Nogo1 and Nogo2 cannot be instantiated:
		//Nogo1 ng1=new Nogo1();
		//Nogo2 ng2=new Nogo2();
		// But Nogo1() constructor called during instatiation of child: 
		Go1 go1 =new Go1();
	}

}
