/**
 * 
 */
package concurrent;

/**   
 * @ClassName:  Ex1   
 * @Description:TODO(这里用一句话描述这个类的作用)   
 * @author: zhengqiang
 * @date:   2018年1月25日 上午10:58:26
 */
class EX1Task1 implements Runnable{

	private static int taskCount=0;
	private final int id=taskCount++;
	EX1Task1(){
		System.out.println("I am task("+id+")");
	}
	
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("I am Run1()");
		Thread.yield();
		System.out.println("I am Run2()");
		Thread.yield();
		System.out.println("I am Run3()");
		Thread.yield();
	}
	
}
public class Ex1 {

	/**   
	 * @Title: main   
	 * @Description: TODO(这里用一句话描述这个方法的作用)   
	 * @param: @param args      
	 * @return: void      
	 * @throws   
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<5;i++)
			new Thread(new EX1Task1()).start();
		System.out.println("I am main()");

	}

}
