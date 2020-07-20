
interface Abc {
	void show();
}
/*class AbcImpl implements Abc{
	public void show(){
		System.out.println("In Interface show");
	}
}*/

public class Interface{

	public static void main(String[] args){
		//Abc obj = new AbcImpl();
	/*	Abc obj =//this part is an extra code ..new Abc()// {//lets implemetnd it if we don't want  to create the class
			public void show(){
				System.out.println("In a implements show");
			}
		//obj.show();
	}*/

	Abc obj = () -> System.out.println("in show");
	obj.show();
}
}


/*

//default method in interface
interface Demo{
	void abc();
	default void show(){
		sop('print default mehtod is allowd in java 8 ')
		//since implementation is not allowed in inter face so it will throw an error if we don't use Default keyword
	}
}*/
