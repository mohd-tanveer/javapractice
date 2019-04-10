class A{

	 private int i;
	public void setI(int j){
		i=j;
	}

	public int getI(){return i;}
}

class Encapsulation{

	public static void main(String args[]){

		A obj = new A();
		obj.setI(5);
		
		System.out.println("the value of i is " + obj.getI());
	}
}
