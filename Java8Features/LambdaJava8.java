interface A{
	void show();
}
/*class Xyz implements A{
	public void show()
	{
		System.out.println();
	}
}*/
public class LambdaJava8{
	public static void main(String[] args){
		/*A obj;
		obj = new Xyz();
		obj.shoe();
		*/
		A obj;
		/*obj = new A(){
			public void show(){//boiler plate code also this is a anonymms class
				System.out.println();
			}
		};*/
		/*
		obj = () ->{
			System.out.println("Hello");
		};
		*/
		obj = () -> System.out.println("Hello this is a lambda");//Consumer Iinterface
		obj.show();
		//above code will not generate any extra class
		// instead of () if there is only one variable then we can directly use it
		// obj = i->System.out.println();
		//
		
}
}