import java.util.*;

public class Customer{
	private String custID;
	private String name;
	private String address;
	private String city;
	private String state;
	private String zip;
	private String phone;
	
	public Customer(){
		custID = "none";
		name = "none";
		address = "none";
		city = "none";
		state = "none";
		zip = "none";
		phone = "none";
	}
	public Customer(String n, String a, String c, String s, String z, String p){
		name = n;
		address = a;
		city = c;
		state = s;
		zip = z;
		phone = p;
		
		Random r = new Random();
		custID += name.substring(0,3)+r.nextInt((8)+1)+r.nextInt((8)+1)+r.nextInt((8)+1)+r.nextInt((8)+1);
	}
	
	public boolean equals(Customer another){
		if(custID.equals(another.custID))
			return true;
		else
			return false;
	}
	
	public String toString(){
		return ("Customer ID: "+custID+
				"\n"+name+
				"\n"+address+","+
				"\n"+city+", "+state+" "+zip+
				"\n"+phone);
	}
}