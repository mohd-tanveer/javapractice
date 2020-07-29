import java.util.Vector;
//Vectors vs List
//vector is a dynamic array , size will increase automatically
//ArrayList and Vector both of them are implementation of List
//vectors increase the meemory by 100% where as vectors inrease by 50%
public class VectorsList{
	public static void main(String[] args){
	/*	Vector<Integer> v = new Vector<Integer>();//100%//TheadSafe //Slow
		v.add(4);
		v.add(5);
		v.add(6);
		v.add(54);
		v.add(16);
		v.add(5);
		v.add(6);
		v.add(5);
		v.add(8);
		v.add(67);
		v.add(86);
		v.add(56);
		v.add(61);
		v.add(16);
		v.add(5);
		v.add(6);
		v.add(5);
		v.add(8);
		v.add(67);
		v.add(86);
		v.add(56);
		v.add(61);
		*/
		//System.out.println("size of vector "+v.capacity());
		ArrayList<Integer> v = new ArrayList<>();//50%//Not ThreadSafe//fast
		v.forEach(i-> System.out.println(i));
	}
}