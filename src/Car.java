public class Car {
    private String brand;
    private String model;
    private float engineVolume;
    private String color;
    private int year;
    private String country;

    Car(String brand, String model, float engineVolume, String color, int year, String country){
        if(brand == null || brand.isEmpty()){
            this.brand = "неизвестно";
        }else{
            this.brand = brand;
        }

        if(model == null || model.isEmpty()){
            this.model = "неизвестно";
        }else{
            this.model = model;
        }

        if(engineVolume <= 0){
            this.engineVolume = 1.5f;
        }else{
            this.engineVolume = engineVolume;
        }

        if(color == null || color.isEmpty()){
            this.color = "белый";
        }else{
            this.color = color;
        }

        if(year <= 0){
            this.year = 2000;
        }else{
            this.year = year;
        }

        if(country == null || country.isEmpty()){
            this.country = "неизвестно";
        }else{
            this.country = country;
        }
    }

    public String toString() {
        return "====================" + "\n" +
                "марка: " + brand + "\n" +
                "модель: " + model + "\n" +
                "вместимость двигателя (л): " + engineVolume + "\n" +
                "цвет: " + color + "\n" +
                "год производства: " + year + "\n" +
                "страна производства: " + country + "\n" +
                "====================";
    }
}
