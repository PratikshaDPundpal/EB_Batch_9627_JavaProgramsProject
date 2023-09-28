package programsproject;

	interface Vehicle {
	    void start();
	    void stop();
	}

	
	interface FuelEfficient {
	    double calculateFuelEfficiency();
	}

	
	class Car implements Vehicle, FuelEfficient {
	    @Override
	    public void start() {
	        System.out.println("Car starting...");
	    }

	    @Override
	    public void stop() {
	        System.out.println("Car stopping...");
	    }

	    @Override
	    public double calculateFuelEfficiency() {
	       
	        return 25.0; 
	    }
	}

	
	class Bike implements Vehicle {
	    @Override
	    public void start() {
	        System.out.println("Bike starting...");
	    }

	    @Override
	    public void stop() {
	        System.out.println("Bike stopping...");
	    }
	}

	public class HybridInheritance {
	    public static void main(String[] args) {
	        Car car = new Car();
	        Bike bike = new Bike();
	        
	        car.start();
	        System.out.println("Car's fuel efficiency: " + car.calculateFuelEfficiency() + " mpg");
	        car.stop();
	        
	        System.out.println();
	        
	        bike.start();
	        bike.stop();
	    }
	}
