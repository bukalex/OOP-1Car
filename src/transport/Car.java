package transport;

public class Car extends Transport {
    public class Key{
        private boolean remoteIgnition;
        private boolean keylessPermission;

        public Key(boolean remoteIgnition, boolean keylessPermission){
            this.remoteIgnition = remoteIgnition;
            this.keylessPermission = keylessPermission;
        }
    }

    public class Insurance{
        private int duration;
        private int price;
        private int number;

        public Insurance(int duration, int price, int number){
            this.duration = duration;
            this.price = price;
            this.number = number;
        }
    }

    private float engineVolume;
    private String transmissionType;
    private final String bodyType;
    private String regNumber;
    private final int seatNumber;
    private boolean isSummer;

    public Car(String brand, String model, int year, String country, String color, int maxSpeed, float engineVolume,
               String transmissionType, String bodyType, String regNumber, int seatNumber, boolean isSummer){
        super(brand, model, year, country, color, maxSpeed);
        setEngineVolume(engineVolume);
        setTransmissionType(transmissionType);
        if(bodyType != null || !bodyType.isEmpty() || !bodyType.isBlank()){
            this.bodyType = bodyType;
        } else {
            this.bodyType = "unknown";
        }
        setRegNumber(regNumber);
        if(seatNumber > 0){
            this.seatNumber = seatNumber;
        }else{
            this.seatNumber = 1;
        }
        this.isSummer = isSummer;
    }

    public float getEngineVolume() {
        return engineVolume;
    }

    public String getTransmissionType() {
        return transmissionType;
    }

    public String getBodyType() {
        return bodyType;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public boolean getRubberType(){
        return isSummer;
    }

    public void setEngineVolume(float engineVolume) {
        if(engineVolume > 0){
            this.engineVolume = engineVolume;
        }else{
            this.engineVolume = 1.5f;
        }
    }

    public void setTransmissionType(String transmissionType) {
        if(transmissionType != null || !transmissionType.isEmpty() || !transmissionType.isBlank()){
            this.transmissionType = transmissionType;
        } else {
            this.transmissionType = "unknown";
        }
    }

    public void setRegNumber(String regNumber) {
        if(regNumber != null || !regNumber.isEmpty() || !regNumber.isBlank() || checkNumber(regNumber)){
            this.regNumber = regNumber;
        } else {
            this.regNumber = "unknown";
        }
    }

    public boolean checkNumber(String regNumber){
        boolean flag = true;
        for (int i = 0; i < regNumber.length(); i++){
            if(i == 0 || i == 4 || i == 5){
                flag = flag && Character.isLetter(regNumber.charAt(i));
            }else{
                flag = flag && Character.isDigit(regNumber.charAt(i));
            }
        }
        return flag;
    }

    public void changeRubber(){
        isSummer = !isSummer;
    }

    @Override
    public void refill() {
        System.out.println("Виды топлива: дизель, бензин, электричество");
        fuelPercentage = 100.00f;
    }

    public String toString() {
        return "=========================" + "\n" +
                "марка: " + brand + "\n" +
                "модель: " + model + "\n" +
                "год выпуска: " + year + "\n" +
                "страна-производитель: " + country + "\n" +
                "цвет: " + color + "\n" +
                "максимальная скорость: " + maxSpeed + "\n" +
                "вместимость двигателя: " + engineVolume + "\n" +
                "коробка передач: " + transmissionType + "\n" +
                "тип кузова: " + bodyType + "\n" +
                "регистрационный номер: " + regNumber + "\n" +
                "вместимость: " + seatNumber + "\n" +
                "=========================";
    }
}
