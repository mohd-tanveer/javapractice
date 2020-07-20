
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Exceptions{
	public static void main(String[] args){
		int i,j,k=0;
		int a[] =new int[4];
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


		i=8;
		
		try{
			j=Integer.parseInt(br.readLine());
		k=i/j;
		for(int c =0;c<=4;c++){
			a[c]=c+1;
		}

		for(int value:a){
			System.out.println(value);
		}
		}

		catch(NumberFormatException e){
			System.out.println("input is not given please provide the input");

		}
		catch(ArithmeticException e){
			System.out.println("can not devide by zero" +e);
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Maximum number of values if 4");
		}
		catch(Exception e){
			System.out.println("default Exception" +e);
		}
		System.out.println(k);

		finally{
			br.close();
			System.out.println("finally this block will be rxecuted ");
		}
	}
}