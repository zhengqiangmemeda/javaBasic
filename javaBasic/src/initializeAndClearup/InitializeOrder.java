/**
 * 
 */
package initializeAndClearup;

/**   
 * @ClassName:  InitizlizeOrder   
 * @Description:TODO(这里用一句话描述这个类的作用)   
 * @author: zhengqiang
 * @date:   2017年12月27日 上午11:09:12
 */

class Bowl{
	Bowl(int i){
		System.out.println("Bowl("+i+")");
	}
	void f1(int i){
		System.out.println("f1("+i+")");
	}
}

class Table{
	static Bowl bowl1=new Bowl(1);
	Table(){
		System.out.println("Table()");
		bowl2.f1(1);
	}
		void f2(int i){
			System.out.println("f2("+i+")");
		}
		static Bowl bowl2=new Bowl(2);
}

class Cupboard{
	Bowl bowl3 =new Bowl(3);
	{
		Bowl bowl11=new Bowl(11);
	}
	
	static Bowl bowl4=new Bowl(4);
	Cupboard(){
		System.out.println("Cupboard()");
		bowl4.f1(2);
	}
	void f3(int i){
		System.out.println("f3("+i+")");
	}

	static Bowl bowl5=new Bowl(5);
	
}

public class InitializeOrder {
	/**   
	 * @Title: main   
	 * @Description: TODO(这里用一句话描述这个方法的作用)   
	 * @param: @param args      
	 * @return: void      
	 * @throws   
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("creating new Cupboard() in main");
		new Cupboard();
		System.out.println("creating new Cupboard() in main");
		new Cupboard();
		table.f2(1);
		cupboard.f3(1);	

	}
	static Table table =new Table();
	static Cupboard cupboard =new Cupboard();

}
