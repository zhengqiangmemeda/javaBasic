/**
 * 
 */
package concurrent21;

/**   
 * @ClassName:  SyschronizedMethod   
 * @Description:TODO(这里用一句话描述这个类的作用)   
 * @author: zhengqiang
 * @date:   2018年3月25日 上午10:05:28
 */
public class SynchronizedMethod implements Runnable{

	/**   
	 * @Title: main   
	 * @Description: TODO(这里用一句话描述这个方法的作用)   
	 * @param: @param args      
	 * @return: void      
	 * @throws   
	 */
	private static int  count1;
	private static int  count2;
	
	public SynchronizedMethod(){
		count1=0;
		count2=0;
	}
	
	public void writeCount1_readCount2(){
		synchronized (this) {
			try {
				for(int i=0;i<5;i++)
					System.out.println(Thread.currentThread().getName()+" is writing count1 to: "+(++count1));
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(Thread.currentThread().getName()+" is reading count2 of: "+count2);
	}
	
	public void writeCount2_readCount1(){
		synchronized (this) {			
			try {
				for(int i=0;i<5;i++)
					System.out.println(Thread.currentThread().getName()+" is writing count2 to: "+(++count2));
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(Thread.currentThread().getName()+" is reading count1 of: "+count1);
	}
	
	public synchronized static void staticWriteCount(){
		try {
			for(int i=0;i<5;i++)
				System.out.println(Thread.currentThread().getName()+" is writing count1 to: "+(++count1));
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		String tName=Thread.currentThread().getName();
		//if("t1".equals(tName))
			//writeCount1_readCount2();
		//if("t2".equals(tName))
			//writeCount2_readCount1();
		staticWriteCount();
	}
	
	public static void main(String[] args) {
		SynchronizedMethod synT1=new SynchronizedMethod();
		SynchronizedMethod synT2=new SynchronizedMethod();
		Thread t1=new Thread(synT1,"t1");
		Thread t2=new Thread(synT2,"t2");
		t1.start();
		t2.start();
		System.out.println("Here is main Thread");
	}

}
