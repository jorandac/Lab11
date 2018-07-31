/**Step #1: Create the Car class as defined in Lab 11(pt 1). Test it: Create class CarApp with a main.
*In CarApp.main, make one instance of Car, println it. (Have Tim or me check it before moving on.)
*
*Step #2: Create the UsedCar class as defined in Lab 11(pt 2). Test it: Back in CarApp.main add this: 
make one instance of UsedCar and println it. Now your CarApp will make one Car and one UsedCar.
*/

package Lab11;

public class Car {

	private String make; 
	private String model;
	private int year; 
	private double price; 
	
    public Car() {
		   this.make = "";
		   this.model ="";
		   this.year = 0;
		   this.price = 0;	   
		}
	
	public Car (String make, String model, int year, double price) {
		this.make = make;
		this.model = model;
		this.year = year;
		this.price = price;
        
	    }

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
        return String.format("%-10s %-10s %d\t$%,10.2f", make, model, year, price);
    }
	
}