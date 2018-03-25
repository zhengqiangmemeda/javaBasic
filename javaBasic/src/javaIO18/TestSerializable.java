/**
 * 
 */
package javaIO18;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**   
 * @ClassName:  TestSerializable   
 * @Description:TODO(这里用一句话描述这个类的作用)   
 * @author: zhengqiang
 * @date:   2018年3月25日 下午4:20:41
 */
public class TestSerializable implements Serializable {

	/**   
	 * @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么)   
	 */  
	private static final long serialVersionUID = 1L;
	private byte id=1;
	private byte count=10;
	
	
	public String toString(){
		return "(id: "+id+", count: "+count+")";
	}
	public void testSerializable(String path,TestSerializable t) throws IOException{
		System.out.println("TestSerializable Serial " + t);
        FileOutputStream fos = new FileOutputStream(path);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(t);
        oos.flush();
        oos.close();
	}
	
	public void testDeSerializable(String path) throws IOException, ClassNotFoundException{
        FileInputStream fos = new FileInputStream(path);
        ObjectInputStream oos = new ObjectInputStream(fos);
        TestSerializable t=(TestSerializable) oos.readObject();
        System.out.println("TestDeSerializable Serial " + t);
        oos.close();
	}

	/**
	 * @throws ClassNotFoundException 
	 * @throws IOException    
	 * @Title: main   
	 * @Description: TODO(这里用一句话描述这个方法的作用)   
	 * @param: @param args      
	 * @return: void      
	 * @throws   
	 */
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		TestSerializable t=new TestSerializable();
		
		String path="../TestSerializable.txt";
		//t.testSerializable(path, t);
		t.testDeSerializable(path);
		
	}

}
