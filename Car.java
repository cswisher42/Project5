public Car{
	private String vin;
	private String make;
	private String model;
	private year int;
	
	public Car(){
		vin = "none";
		make = "none";
		model = "none";
		year = 0;
	}
	public Car(String v, String ma, String mo, int y){
		vin = v;
		make = ma;
		model = mo;
		year = y;
	}
	
	public boolean equals(Car another){
		if(vin.equals(another.vin))
			return true;
		else
			return false;
	}
}