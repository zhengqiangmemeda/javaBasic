/**
 * 
 */
package concurrent21;

/**   
 * @ClassName:  VolatileTest   
 * @Description:TODO(������һ�仰��������������)   
 * @author: zhengqiang
 * @date:   2018��3��29�� ����9:45:18
 */
public class VolatileTest implements Runnable{

	/**   
	 * @Title: main   
	 * @Description: TODO(������һ�仰�����������������)   
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
