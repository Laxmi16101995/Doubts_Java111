package com.question3;

public class Car {
	
	private String model;
	private String companyName; 
	private String Color; 
	private Engine engine;
	
	public Car() {
	}

	public Car(String model, String companyName, String color, Engine engine) {
		super();
		this.model = model;
		this.companyName = companyName;
		Color = color;
		this.engine = engine;
		
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getColor() {
		return Color;
	}

	public void setColor(String color) {
		Color = color;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	
	

	



	class Engine{
		
		private int rmp; 
		private int Power;
		private String manufacturer; 
		private Boolean hasTurbo;
		
		void enableTurbo() {
			
		}

		public int getRmp() {
			return rmp;
		}

		public void setRmp(int rmp) {
			this.rmp = rmp;
		}

		public int getPower() {
			return Power;
		}

		public void setPower(int power) {
			Power = power;
		}

		public String getManufacturer() {
			return manufacturer;
		}

		public void setManufacturer(String manufacturer) {
			this.manufacturer = manufacturer;
		}

		public Boolean getHasTurbo() {
			return hasTurbo;
		}

		public void setHasTurbo(Boolean hasTurbo) {
			this.hasTurbo = hasTurbo;
		}
		
	}
	
	@Override
	public String toString() {
		return "Car model=" + model +"\n"+ "car companyName=" + companyName +"\n"+  "Car Color=" + Color +"\n"+  "Car power=" + engine.getPower() +"\n"+ "Car RPM=" + engine.getRmp()+"\n"+ "Car Engine Manufacturer=" + engine.manufacturer+"\n"+"Car Has Turbo=" + engine.hasTurbo;
	}

}
