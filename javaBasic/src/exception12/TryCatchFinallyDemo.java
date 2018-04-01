/**
 * 
 */
package exception12;

/**   
 * @ClassName:  TryCatchFinallyDemo   
 * @Description:TODO(这里用一句话描述这个类的作用)   
 * @author: zhengqiang
 * @date:   2018年4月1日 下午2:15:29
 */
public class TryCatchFinallyDemo {

	/**
	 * 
	 * @Title: beforeFinally   
	 * @Description: 从结果上看，貌似`finally` 里的语句是在`return` 之后执行的，其实不然，实际上`finally` 
	 * 里的语句是在在`return` 之前执行的。那么问题来了，既然是在之前执行，那为什么`a` 的值没有被覆盖了？
	 * 实际过程是这样的：当程序执行到try{}语句中的return方法时，它会干这么一件事，将要返回的结果存储到一个
	 * 临时栈中，然后程序不会立即返回，而是去执行finally{}中的程序， 在执行`a = 2`时，程序仅仅是覆盖了a的值，
	 * 但不会去更新临时栈中的那个要返回的值 。执行完之后，就会通知主程序“finally的程序执行完毕，可以请求返回了”，
	 * 这时，就会将临时栈中的值取出来返回。这下应该清楚了，要返回的值是保存至临时栈中的。  
	 * @param: @return      
	 * @return: int      
	 * @throws
	 */
	public static int beforeFinally1(){
		int a=1;
		try{
			a=2;
			return a;
		}finally{
			a=3;
		}
	}
	/**
	 * 
	 * @Title: beforeFinally2   
	 * @Description: 在这里，finally{}里也有一个return，那么在执行这个return时，就会更新临时栈中的值。
	 * 同样，在执行完finally之后，就会通知主程序请求返回了，即将临时栈中的值取出来返回。故返回值是2. 
	 * @param: @return      
	 * @return: int      
	 * @throws
	 */
	@SuppressWarnings("finally")
	public static int beforeFinally2(){
		int a=1;
		try{
			a=2;
			return a;
		}finally{
			a=3;
			return a;
		}
	}
	/**   
	 * @Title: main   
	 * @Description: TODO(这里用一句话描述这个方法的作用)   
	 * @param: @param args      
	 * @return: void      
	 * @throws   
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(beforeFinally1());
		System.out.println(beforeFinally2());
	}

}
