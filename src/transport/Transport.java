package transport;

public abstract class Transport {
    protected final String brand;
    protected final String model;
    protected final int year;
    protected final String country;
    protected String color;
    protected int maxSpeed;
    protected float fuelPercentage;

    Transport(String brand, String model, int year, String country, String color, int maxSpeed){
        if(brand != null || !brand.isEmpty() || !brand.isBlank()){
            this.brand = brand;
        } else {
            this.brand = "unknown";
        }
        if(model != null || !model.isEmpty() || !model.isBlank()){
            this.model = model;
        } else {
            this.model = "unknown";
        }
        if(country != null || !country.isEmpty() || !country.isBlank()){
            this.country = country;
        } else {
            this.country = "unknown";
        }
        if(year > 0){
            this.year = year;
        }else{
            this.year = 2000;
        }
        setColor(color);
        setMaxSpeed(maxSpeed);
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public String getColor() {
        return color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setColor(String color) {
        if(color != null || !color.isEmpty() || !color.isBlank()){
            this.color = color;
        } else {
            this.color = "white";
        }
    }

    public void setMaxSpeed(int maxSpeed) {
        if(maxSpeed > 0){
            this.maxSpeed = maxSpeed;
        } else {
            this.maxSpeed = 0;
        }
    }

    public abstract void refill();
}
