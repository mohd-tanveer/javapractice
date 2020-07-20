public class AbstractDemo{


public static void main(String[] args){

	MahesPhone  obj = new SureshPhone();
	obj.call();
	obj.move();
	obj.dance();
	obj.cook();

	}
}

abstract class MahesPhone{

	public void call(){
		System.out.println("callling...");

	}
	public abstract void move(); //future phones will have these features
	public abstract void dance();
	public abstract void cook();
}

abstract class RameshPhone extends MahesPhone{
	public void move(){
			System.out.println("mpving...");
		
	}


}
class SureshPhone extends RameshPhone{//CONCRRETE 
	public void dance(){
		System.out.println("dancing......");
	}
	public void cook(){
		System.out.println("cooking........");
	}


}