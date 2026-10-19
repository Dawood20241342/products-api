package uk.ac.westminster.products_api;

//DigitalProduct is a product that has to be downloaded
//


public class PhysicalProduct extends Product {

    private double weightKg;
    private String dimensions;

    public PhysicalProduct() {
    }

    public  PhysicalProduct(Long id, String name, double price, double weightKg, String dimensions){
        super(id, name, price);   // MUST be the first statement
        this.weightKg = weightKg;
        this.dimensions = dimensions;
    }

    public double getWeightKg() {
        return weightKg;
    }

    public String getDimensions() {
        return dimensions;
    }
}