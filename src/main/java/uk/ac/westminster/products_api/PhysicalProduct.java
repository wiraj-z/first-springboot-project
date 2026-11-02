package uk.ac.westminster.products_api;

public class PhysicalProduct extends Product implements Discountable{
    private String dimensions;
    private double weightKg;
    private double discountedPrice;

    public PhysicalProduct(){}
    public PhysicalProduct(Long id, String name, Double price, String dimensions, double weightKg){
        super(id,name,price);
        this.dimensions = dimensions;
        this.weightKg = weightKg;
    }

    public String getDimensions(){
        return dimensions;
    }
    public double getWeightKg(){
        return weightKg;
    }

    @Override
    public String getSummary(){
        return "Physical: " + getName()+ " | Weight in Kg: " + getWeightKg();
    }


    @Override
    public void applyDiscount(double rate) {
        double capped  = Math.min(rate,0.20);
        discountedPrice = getPrice() * capped;
    }

    @Override
    public double getDiscountedPrice() {
        return discountedPrice;
    }
}
