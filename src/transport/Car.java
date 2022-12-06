package transport;

public class Car {
    public static class Key{
        private boolean remoteIgnition;
        private boolean keyless;

        public Key(boolean remoteIgnition, boolean keyless){
            this.remoteIgnition = remoteIgnition;
            this.keyless = keyless;
        }
    }

    public static class Insurance{

    }

    private final String brand;
    private final String model;
    private float engineVolume;
    private String color;
    private final int year;
    private final String country;
    private String transmission;
    private final String bodyType;
    private String regNumber;
    private final int seatNumber;
    private boolean isSummerRubber;

    public Car(String brand, String model, float engineVolume, String color, int year, String country,
               String transmission, String bodyType, String regNumber, int seatNumber, boolean isSummerRubber){
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

        if(transmission == null || transmission.isEmpty()){
            this.transmission = "неизвестно";
        }else{
            this.transmission = country;
        }

        if(bodyType == null || bodyType.isEmpty()){
            this.bodyType = "неизвестно";
        }else{
            this.bodyType = country;
        }

        if(regNumber == null || regNumber.isEmpty()){
            this.regNumber = "неизвестно";
        }else{
            this.regNumber = country;
        }

        if(seatNumber <= 0){
            this.seatNumber = 1;
        }else{
            this.seatNumber = seatNumber;
        }

        this.isSummerRubber = isSummerRubber;
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

    public void changeRubber(){
        isSummerRubber = !isSummerRubber;
    }
}
