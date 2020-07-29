/*Collection is an interface which is implemented by ArrayList 
Collection values = new Arraylist();
but above will accept everything so to be specific we can use Generics
values.add(5);
values.add(5);
values.add("tamata");

Collectuion<Integer> values = new ArrayList<Integer>() or
Collection<Integer> values = new ArrayList<>();///by default right side will be consider as  integer
*angular bracket because all other bracket is reserved
*collection does not work with index
so we can use List instead collection which implements collection
we can also use set but set has different class which implements 
Set<Integer> numbers = new HashSet<>(); set is unordered
Set<Integer> numbers = new TreeSet<>(); it will give the sorted ordered 
Map<key,value> for every key there is a value
Map<Integer,String> map = new HashMap<>();//Map is an interface which is implemented by HashMap
											or we can use HashTable
collection was intruduced in 1.2 and generics in 1.5
*/
//dynamic array

import java.util.ArrayList;
import java.util.Collection;
import java.io.*;
public class CollectionGeneric{
	public static void main(String[] args) throws Exception{
		//int values[] = new int[4];
		//Object values1[] = new Object[4];
		//values1[0]="tan";
		//values1[1]=7;
		Collection<Integer> values = new ArrayList<>();
		values.add(3);
		values.add(77);
		values.add(5);
		//to fetch the values we have tow ways 1. Iterator 2.enhacned for loop
		/*Iterator i = values.iterator();
		while(i.hasNext()){
			System.out.println(i.next());
		}
		*/
		//or for each
		values.forEach(i->System.out.println(i));




	}
}
