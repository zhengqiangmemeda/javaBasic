/**
 * 
 */
package concurrent21;

/**   
 * @ClassName:  VolatileTest   
 * @Description:TODO(这里用一句话描述这个类的作用)   
 * @author: zhengqiang
 * @date:   2018年3月29日 上午9:45:18
 */
public class VolatileTest implements Runnable{

	/**   
	 * @Title: main   
	 * @Description: TODO(这里用一句话描述这个方法的作用)   
	 * @param: @param args      
	 * @return: void      
	 * @throws   
	 */
	private static boolean status=false;
	
	public void changeStatus(){
		status=true;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		if(status)
			System.out.println(Thread.currentThread().getName()+" is Running()");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1=new Thread(new VolatileTest(),"t1");
		Thread t2=new Thread(new VolatileTest(),"t2");
		t1.start();
		t2.start();
	}
}
