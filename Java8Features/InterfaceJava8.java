interface Phone{
	void call();
	default void message(){
		System.out.println("message sent");
	}
	static void videoCall(){
		System.out.println("video callling...");
	}
}
class AndroidPhone implements Phone{
	public void call(){
		System.out.println("Calling");
	}
}
public class InterfaceJava8 {
	public static void main(String args[]){
		Phone p =new AndroidPhone();
		p.call();
		p.message();
		Phone.videoCall();
		
	}
}