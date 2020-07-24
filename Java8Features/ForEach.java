import java.util.List;
import java.util.Arrays;

public class ForEach{
	public static void main(String args[]){
		List<Integer> values = Arrays.asList(4,5,6,7,8);
		//old method
		for (int i=0;i<values.size();i++){
			System.out.println(values.get(i));
		}
		//enhanced for loop
		for(int i:values){
			System.out.println(i);
		}
		//forEach in java8 : other two for loops are external loops 
		//forEach is an internal loop
		values.forEach(i -> System.out.println(i));
	}
}
