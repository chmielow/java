public class Auto {
    public String brand;
    public String model;
    public int productionDate;
    public int mileage;

    public Auto(String brand, String model, int productionDate, int mileage){
        this.brand = brand;
        this.model = model;
        this.productionDate = productionDate;
        this.mileage = mileage;
    }

    public void go(){
        System.out.println("jadę");
    }

    public void stop(){
        System.out.println("hamuje");
    }
    public void information(){
        System.out.println(brand + "\n" + model + "\n" + productionDate + "\n" +  mileage);
    }

}
