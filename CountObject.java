public class CountObject{
	
	public static void main(String args[]){
		Abc obj1 = new Abc();
		Abc obj2 = new Abc();
		Abc obj3 = new Abc();
		Abc obj4 = new Abc();
		Abc obj5 = new Abc();
		Abc obj6 = new Abc();
		Abc obj7 = new Abc();
		System.out.println("total number of object created is   " +Abc.i+" ");


	}

}

class Abc{

	static int i;
	public Abc(){

		i++;
	}
}