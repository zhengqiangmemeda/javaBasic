/**
 * 
 */
package javaCollection17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/** 
 * @ClassName: SelfSort 
 * @Description: TODO()
 * @author zhengqiang
 * @Date 2018-04-20 09:45
 */
public class SelfSort {


	
	public static void main(String[] args) {
		int[] arr1={3,0,2,1,5,4,7,6,9,8};
		ArrayList<Integer> list=new ArrayList<Integer>();
		//Collections.addAll(list,arr1);
		Arrays.sort(arr1);
		for(int i:arr1)
			System.out.print(i+",");
	}

}
