package carEngine;

public class Car {
	private String brand;
	private String model;
	private String carNo;
	private String price;
	private Engine engine;
//	public String getBrand() {
//		return brand;
//	}
//	public void setBrand(String brand) {
//		this.brand = brand;
//	}
//	public String getModel() {
//		return model;
//	}
//	public void setModel(String model) {
//		this.model = model;
//	}
//	public String getCarNo() {
//		return carNo;
//	}
//	public void setCarNo(String carNo) {
//		this.carNo = carNo;
//	}
//	public String getPrice() {
//		return price;
//	}
//	public void setPrice(String price) {
//		this.price = price;
//	}
//	public Engine getEngine() {
//		return engine;
//	}
//	public void setEngine(Engine engine) {
//		this.engine = engine;
//	}
	
	public Car(String brand, String model, String carNo, String price, Engine engine) {
		super();
		this.brand = brand;
		this.model = model;
		this.carNo = carNo;
		this.price = price;
		this.engine = engine;
	}
	
	@Override
	public String toString() {
		return "Car [brand=" + brand + ", model=" + model + ", carNo=" + carNo + ", price=" + price + ", engine="
				+ engine + "]";
	}

	
	
}
