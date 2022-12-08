package transport;

public class Train extends Transport{
    private int price;
    private int time;
    private String startStation;
    private String finishStation;
    private int wagonNumber;

    public Train(String brand, String model, int year, String country, String color, int maxSpeed,
          int price, int time, String startStation, String finishStation, int wagonNumber){
        super(brand, model, year, country, color, maxSpeed);
        this.price = price;
        this.time = time;
        this.startStation = startStation;
        this.finishStation = finishStation;
        this.wagonNumber = wagonNumber;
    }

    @Override
    public void refill() {
        System.out.println("Виды топлива: дизель");
        fuelPercentage = 100.00f;
    }
}
