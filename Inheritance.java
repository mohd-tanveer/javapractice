class Add{

	int num1,num2,result;
	public void sum(){
		result=num1+num2;

	}
}

class AddSub extends Add{ //single level inheritances
public void sub(){
	result=num1-num2;
}
}

class AddSubMul extends AddSub{ //multilevel inheritance
	public void multi(){
		result = num1*num2;
	}
}

  class Inheritance{//we can also write Public but the given is by default 
	public static void main(String args[]){

		AddSubMul obj = new AddSubMul();
		obj.num1=5;
		obj.num2=4;
		obj.sum();
		System.out.println("the summation is\t"+ obj.result);
		obj.sub();
		System.out.println("the difference is\t"+ obj.result);
		obj.multi();
		System.out.println("the difference is\t"+ obj.result);

	}
}