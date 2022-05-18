public class Taxi {

    private int defaultFee;
    private static int serialNum = 1000;
    private int carNum;
    private int oil;
    private int speed;
    private String destination;
    private static int meter = 100;
    private int meterFee;
    private boolean canDrive;


    public Taxi(int oil){
        serialNum++;
        this.carNum = serialNum;
        this.canDrive = true;
        this.oil = oil;

    }

    public void startDrive(){
        if(this.oil >= 10){
            System.out.println("운행을 시작합니다.");
            canDrive = false;
        }else {
            System.out.println("주유량을 확인해 주세요");
        }

    }
    public void passengerOn(int meter){
        if(canDrive){
            this.startDrive();
            this.feeCheck(meter);
        }else {
            System.out.println("탑승 불가");
        }
    }

    public void change_speed(int speed){
        if(this.oil >= 10){
            this.speed += speed;
        }else {
            System.out.println("주유량을 확인해 주세요");
        }
    }

    public void feeCheck(int meter){
        if(this.meter < meter){
            paymentFar(meter);
        }else{
            payment(meter);
        }
    }

    public void payment(int meter){
        this.meterFee = meter *500;
    }
    public void paymentFar(int meter){
        this.meterFee = meter *1000;
    }
    public void oilCheck(){

        if(this.oil == 0){
            System.out.println("현재 기름이 0입니다.");
        } else if (this.oil < 10) {
            System.out.println("주유가 필요합니다.");
        }else {
            System.out.println("기름이 충분합니다. : "+this.oil);
        }
    }

    public int getDefaultFee() {
        return defaultFee;
    }

    public void setDefaultFee(int defaultFee) {
        this.defaultFee = defaultFee;
    }

    public int getCarNum() {
        return carNum;
    }

    public void setCarNum(int carNum) {
        this.carNum = carNum;
    }

    public int getOil() {
        return oil;
    }

    public void setOil(int oil) {
        this.oil = oil;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getMeter() {
        return meter;
    }

    public void setMeter(int meter) {
        this.meter = meter;
    }

    public int getMeterFee() {
        return meterFee;
    }

    public void setMeterFee(int meterFee) {
        this.meterFee = meterFee;
    }

    public boolean isCanDrive() {
        return canDrive;
    }

    public void setCanDrive(boolean canDrive) {
        this.canDrive = canDrive;
    }

    @Override
    public String toString() {
        return "Taxi{" +
                "defaultFee=" + defaultFee +
                ", carNum=" + carNum +
                ", oil=" + oil +
                ", speed=" + speed +
                ", destination='" + destination + '\'' +
                ", meter=" + meter +
                ", meterFee=" + meterFee +
                ", drive=" + canDrive +
                '}';
    }
}
