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
 * @Description:TODO(������һ�仰��������������)   
 * @author: zhengqiang
 * @date:   2018��3��25�� ����4:20:41
 */
public class TestSerializable implements Serializable {

	/**   
	 * @Fields serialVersionUID : TODO(��һ�仰�������������ʾʲô)   
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
	 * @Description: TODO(������һ�仰�����������������)   
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
