/**
 * 
 */
package javaCollection17;

import java.util.HashSet;
import java.util.TreeSet;

/**   
 * @ClassName:  Set   
 * @Description:TODO(这里用一句话描述这个类的作用)   
 * @author: zhengqiang
 * @date:   2018年3月26日 上午10:04:51
 */
public class Set {

	/**   
	 * @Title: main   
	 * @Description: TODO(这里用一句话描述这个方法的作用)   
	 * @param: @param args      
	 * @return: void      
	 * @throws   
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> hs=new HashSet<String>();
		hs.add("aa");
		hs.add("cc");
		hs.add("bb");
		hs.add("");
		hs.add(null);
		hs.add(null);
		hs.add("dd");
		hs.remove("dd");
		for(String s:hs){
			System.out.println("val:"+s+",");  
		}
		System.out.println("------------------------------");  
		TreeSet<String> ts=new TreeSet<String>();
		ts.add("aa");
		ts.add("cc");
		ts.add("bb");
		ts.add("");
		//ts.add(null);
		ts.add("dd");
		ts.remove("dd");
		for(String s:ts){
			System.out.println("val:"+s+",");  
		}

	}

}
