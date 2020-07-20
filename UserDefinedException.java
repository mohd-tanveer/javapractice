
public class UserDefinedException{
	public static void main(String[] args){
		int i=5;
		try{
			if(i<10){
				throw new MyException("Error");
			}	
		}
		catch(Exception e){System.out.println(e);}
	}
}

class MyException extends Exception{
	public MyException(String msg){
		super(msg);//super key word is used to used call immediate parent class it can call any method ir constructir
	}

}