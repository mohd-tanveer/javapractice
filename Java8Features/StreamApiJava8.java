//Stream API
//parallelStream--it will create thread automatically depend upon the codes
//Stream api has lost of method to process the data like hadoop and big data.
/*
List <Integer> values = new ArrayList<>();
for(int i=1;i<=100;i++){
	values.add(i);
}
values.stream().filter(i->{
	System.out.println("Hi");
	return true
}.findFirst().orElse(0));//or we can use Optional<>

//stream will process all data however once the stream is used you can not reuse stream because stream is made to process data
*/

import java.util.Arrays;
import java.util.List;

public class StreamApiJava8{
	public static void main (String[] args){
		List<Integer> val= Arrays.asList(1,2,3,4,5,6);
		List<Integer> values= Arrays.asList(2,5,6,10,20,25,30,85,65,26,64,32,75);

		/*int result=0;
		for (int i:val){
			result = result +i*2;
		
	System.out.println(result);
	}*/
	System.out.println(val.stream().map(i->i*2).reduce(0,(c,e)->c+e));
	/*explain 
		Stream s= val.stream();//object of stream 
		s.map(i=i*2)//map is a function which takes two parameter one takes other return 
		reduce is taking two parameter one is initial value and other is object of binary parameter
		reduce retruns an integer
		*/
	System.out.println(val.stream().map(i->i*2).reduce(0,(c,e)->Integer.sum(c,e)));
	//we have also filter method
	System.out.println(values.stream().filter(i->i%5==0).reduce(0,(c,e)->Integer.sum(c,e)));
	//suppose i want to use map also
	//best way to write 
	System.out.println(values.stream()
		.filter(i->i%5==0)
		.map(i->i*2)
		.reduce(0,(c,e)->Integer.sum(c,e)));
	//find first 
	System.out.println(values.stream()
		.filter(i->i%5==0)
		.map(i->i*2)
		.findFirst());
	//in case there is no value in list
	System.out.println(values.stream()
		.filter(i->i%5==0)
		.map(i->i*2)
		.findFirst()
		.orElse(0));
	//find function is termianl function and map,filter is Lazy Evaluation
	System.out.println(values.stream()
		.filter(StreamApiJava8::isDivisible)
		.map(StreamApiJava8::mapDouble)
		.findFirst()
		.orElse(0));
}
	public static boolean isDivisible(int i){
		System.out.println("in is div"+ i);
		return (i%5==0);
	}
	public static int mapDouble(int i){
		System.out.println("in mapping "+i);
		return(i*2);
	
	}
}