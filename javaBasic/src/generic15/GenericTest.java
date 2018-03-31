
package generic15;

class Pair<K,V>{
	private K key;
	private V value;
	
	public Pair(K k, V v) {
		key=k;
		value=v;
	}

	public <K,V> boolean compare(Pair<K,V> p1){
		return p1.key.equals(this.key)&&p1.value.equals(this.value);	
	}
	public K getKey() {
		return key;
	}
	public void setKey(K key) {
		this.key = key;
	}
	public V getValue() {
		return value;
	}
	public void setValue(V value) {
		this.value = value;
	}
	
}
/**   
 * @ClassName:  GenericTest   
 * @Description:TODO(这里用一句话描述这个类的作用)   
 * @author: zhengqiang
 * @date:   2018年3月30日 下午5:11:58
 */
public class GenericTest {

	/**   
	 * @Title: main   
	 * @Description: TODO(这里用一句话描述这个方法的作用)   
	 * @param: @param args      
	 * @return: void      
	 * @throws   
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pair<String,Integer> p1=new Pair<String,Integer>("zq",26);
		Pair<String,Integer> p2=new Pair<String,Integer>("hn",24);
		System.out.println(p1.compare(p1));
	}

}
