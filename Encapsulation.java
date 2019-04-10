class A{

	 private int i;
	 private String ename;
	public void setI(int j, String ename){
		this.i=j;
		this.ename=ename;  //we can also create another method setting the name which is commanly used
	}

	public int getI(){return i;}
	public String getEname(){return ename;}
}

class Encapsulation{

	public static void main(String args[]){

		A obj = new A();
		obj.setI(5,"Tanveer");
		
		System.out.println("the value of i is " + obj.getI()+"\n" + "the Ename is " +obj.getEname());
	}
}
