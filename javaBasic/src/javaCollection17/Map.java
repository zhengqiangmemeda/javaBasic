/**
 * 
 */
package javaCollection17;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentMap;

/**   
 * @ClassName:  Map   
 * @Description:TODO(������һ�仰��������������)   
 * @author: zhengqiang
 * @date:   2018��3��26�� ����9:17:02
 */
public class Map {

	/**   
	 * @Title: main   
	 * @Description: TODO(������һ�仰�����������������)   
	 * @param: @param args      
	 * @return: void      
	 * @throws   
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String,String> m=new HashMap<String,String>();
		m.put("zq1", "zq1");
		m.put("zq4", "zq4");
		m.put("zq3", "zq3");
		m.put("zq2", "zq2");
		m.put("zq2", "zq3");
		m.put("a",null);
		m.put("b",null);
		m.put(null,"a");
		m.put(null,"b");
		for(String key:m.keySet()){
			System.out.println("key:"+key+" , value:"+m.get(key));  
		}
		
		System.out.println("-------------------------------------------------------");  
		//
		TreeMap<String,String> tm=new TreeMap<String,String>();
		tm.put("zq1", "zq1");
		tm.put("zq4", "zq4");
		tm.put("zq3", "zq3");
		tm.put("zq2", "zq2");	
		tm.put("zq2", "zq3");
		tm.put("a",null);
		tm.put("b",null);
		for(String key:tm.keySet()){
			System.out.println("key:"+key+" , value:"+tm.get(key));  
		}
		System.out.println("-------------------------------------------------------");  
		Hashtable<String,String> ht=new Hashtable<String,String>();
		ht.put("zq1", "zq1");
		ht.put("zq4", "zq4");
		ht.put("zq3", "zq3");
		ht.put("zq2", "zq2");
		ht.put("zq2", "zq3");	
		for(String key:ht.keySet()){
			System.out.println("key:"+key+" , value:"+ht.get(key));  
		}
		System.out.println("-------------------------------------------------------"); 
		

		
	}//end of main()

}
