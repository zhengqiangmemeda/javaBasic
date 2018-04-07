/**
 * 
 */
package concurrent21;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
/**
 * 
 * @ClassName: MyThread 
 * @Description: TODO()
 * @author zhengqiang
 * @Email 1126686939@qq.com 
 * @Date 2018-04-07 15:45
 */
class MyThread implements Runnable{
	@Override
	public void run(){
		synchronized(this){
			for(int i=0;i<10;i++){
				System.out.println(Thread.currentThread().getName()+": "+ i);
		}
		
			try{
				Thread.sleep(100);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}
}
/** 
 * @ClassName: ThreadPoolDemo 
 * @Description: TODO()
 * @author zhengqiang
 * @Email 1126686939@qq.com 
 * @Date 2018-04-07 15:30
 */
public class ThreadPoolDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExecutorService pool1=Executors.newCachedThreadPool();
		
		ExecutorService pool2=Executors.newFixedThreadPool(10);
		ExecutorService pool3=Executors.newSingleThreadExecutor();	
		ExecutorService pool4=Executors.newSingleThreadScheduledExecutor();	
		ExecutorService pool5=Executors.newScheduledThreadPool(10);
		
		
		

		Future f1=pool1.submit(new MyThread());
		try {
			if(f1.get()==null){
				System.out.println("pool1 is failed");
			}
		} catch (InterruptedException | ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Future f2=pool1.submit(new MyThread());
		try {
			if(f2.get()==null){
				System.out.println("pool2 is failed");
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Future f3=pool1.submit(new MyThread());
		try {
			if(f3.get()==null){
				System.out.println("pool3 is failed");
			}
		} catch (InterruptedException | ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
