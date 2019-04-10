class A{ //same name with different parameter,method overloading,early binding,static binding,compile time polymorphism

	public void show(){
		System.out.println("HEllo ");
	}
	public void show(int i){
		System.out.println("hello "+i);
	}
	public void show(double d){//the different data type
		System.out.print("this is doublemethod    " +d );
	}
}

class MethodOverloading{
public static void main(String args[]){
	A obj = new A();
	obj.show();
	obj.show(4);
	obj.show(5.5);
}
}


