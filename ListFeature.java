//Collection list features
import java.util.List;
import java.util.ArrayList;



/*lets make our own generics
class Container<T>{
	T value;
	//so whatever we want to assign we can
	public void show(){
		System.out.println(value.getClass().getName());
	}
}*/

public class ListFeature{
	public static void main(String[] args)  throws Exception{
		/*to achive type safety we must add the geniric
		Container<Integer> obj = new Container<>();
		obj.value=9;
		obj.show();*/

		//collection can not be used to insert a value in between of list so we can use list interface(it support index)
		List<Integer> values = new ArrayList<Integer>();
		values.add(3);
		values.add(99);
		values.add(44);
		values.add(2);
		values.add(1,10);
		values.forEach(i->System.out.println(i));


	}
}