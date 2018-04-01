/**
 * 
 */
package concurrent21;

/**   
 * @ClassName:  Wait_Notify_Demo   
 * @Description:TODO(这里用一句话描述这个类的作用)   
 * @author: zhengqiang
 * @date:   2018年4月1日 上午9:42:24
 */
public class Wait_Notify_Demo {

	/**
	 * @throws InterruptedException    
	 * @Title: main   
	 * @Description: TODO(这里用一句话描述这个方法的作用)   
	 * @param: @param args      
	 * @return: void      
	 * @throws   
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		final Object obj=new Object();
		Thread t1=new Thread(){
			public void run(){
				synchronized(obj){
					try {
						System.out.println("t1 begin");
						obj.wait();
						System.out.println("t1 end");
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}	
				}
			}
		};
		
		Thread t2=new Thread(){
			public void run(){
				synchronized(obj){
					try {
						System.out.println("t2 begin");
						obj.wait();
						System.out.println("t2 end");
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}	
				}
			}
		};
		
		t2.start();
		t1.start();
				
		Thread.sleep(5000);
		Thread t3=new Thread(){
			public void run(){
				synchronized(obj){
					System.out.println("t3 begin");
					obj.notifyAll();
					System.out.println("t3 end");
				}	
			}
		};
		t3.start();

	}

}
