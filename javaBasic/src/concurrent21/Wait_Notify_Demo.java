/**
 * 
 */
package concurrent21;

/**   
 * @ClassName:  Wait_Notify_Demo   
 * @Description:TODO(������һ�仰��������������)   
 * @author: zhengqiang
 * @date:   2018��4��1�� ����9:42:24
 */
public class Wait_Notify_Demo {

	/**
	 * @throws InterruptedException    
	 * @Title: main   
	 * @Description: TODO(������һ�仰�����������������)   
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
