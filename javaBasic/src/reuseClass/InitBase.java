/**
 * 
 */
package reuseClass;

/**   
 * @ClassName:  InitBase   
 * @Description:TODO(这里用一句话描述这个类的作用)   
 * @author: zhengqiang
 * @date:   2017年12月28日 下午3:24:14
 */
//如果不声明构造函数，那么类就创建默认不带参数的构造函数，如果声明了，那么编译器就认为不需要我去声明了。
class Base{
	Base(int i){
		System.out.println("Base construct");
	}
}
public class InitBase extends Base{

	/**   
	 * @Title: main   
	 * @Description: TODO(这里用一句话描述这个方法的作用)   
	 * @param: @param args      
	 * @return: void      
	 * @throws   
	 */
	InitBase(int i){
		super(i);//如果不调用构造函数，那么编译器就会找不到默认的构造函数
		System.out.println("kid's construct");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InitBase b=new InitBase(1);
	}

}
