public class Constructor1{


	public static void main (String args[]){

		Abc obj = new Abc();
		Abc obj1 = new Abc(5);
		Abc obj2 = new Abc(1,33232);
	}
}

class Abc{

	public Abc(){   //Constructor overloading also we can have as many as constructor we require

		System.out.println("in abc by default it is called after creating the obj in main file");
	}

	public Abc(int i){

		System.out.println("this is the paramaterized constructor " + i);
	}

	public Abc(int i, double d){

		System.out.println("this is the paramaterized constructor  with 2 para meeter\t" + i + "  "+ d);
	}

}




