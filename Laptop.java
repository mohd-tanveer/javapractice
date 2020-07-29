///comparable vs comparator
//so comparators does not require any other method

public class Laptop implements Comparable<Laptop>{
	private String brand;
	private int ram;
	private int price;

	public Laptop(String brand,int ram, int price){
		super();
		this.brand=brand;
		this.ram=ram;
		this.price=price;
	}

	public void setBrand(String brand){
		this.brand=brand;
	}
	public void setRam(int ram){
		this.ram=ram;
	}
	public void setPrice(int price){
		this.price=price;
	}
	public String getBrand(){
		return(brand);
	}
	public int getPrice(){
		return(price);
	}
	public int getRam(){
		return(ram);
	}
	public String toString(){
		return "Laptop[ brand = " +brand +",ram=" + ram +  ", price= "+ price +"]";
}

	public int compareTo(Laptop lap2){

		if(this.getRam()>lap2.getRam()){
			return 1;
		}
		else {
			return -1;
		}
	}
}















