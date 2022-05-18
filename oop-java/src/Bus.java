public class Bus {
    private int max_passenger;
    private int now_passenger;
    private int fee;
    private static int serialNum = 1000;
    private int carNum;
    private int oil;
    private int speed;
    private boolean drive;


    public Bus(int oil, int max_passenger){
        serialNum++;
        this.carNum = serialNum;
        this.drive = true;
        this.oil = oil;
        this.max_passenger = max_passenger;
    }

    public void endDrive(){
        drive = false;
    }

    public void startDrive(){
        if(oilCheck()){
            System.out.println("운행을 시작합니다.");
            drive = true;
        }else {
            System.out.println("주유량을 확인해 주세요");
        }

    }
    public void passenger_on(int now_passenger){
        if (this.drive == false){
            System.out.println("운행 상태를 확인해 주세요");

        }else {
            if (this.max_passenger < now_passenger) {
                System.out.println("자리가 부족합니다.");
            } else {
                this.now_passenger = now_passenger;
            }
        }
    }
    public void change_speed(int speed){
       if (oilCheck()){
           this.speed += speed;
       }
    }

    public boolean oilCheck(){

        if(this.oil == 0){
            System.out.println("현재 기름이 0입니다.");
            return false;
        } else if (this.oil < 10) {
            System.out.println("주유가 필요합니다.");
            return false;
        }else {
            System.out.println("기름이 충분합니다. : "+this.oil);
            return true;
        }
    }

    public int getMax_passenger() {
        return max_passenger;
    }

    public void setMax_passenger(int max_passenger) {
        this.max_passenger = max_passenger;
    }

    public int getNow_passenger() {
        return now_passenger;
    }

    public void setNow_passenger(int now_passenger) {
        this.now_passenger = now_passenger;
    }

    public int getFee() {
        return fee;
    }

    public void setFee(int fee) {
        this.fee = fee;
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

    public boolean isDrive() {
        return drive;
    }

    public void setDrive(boolean drive) {
        this.drive = drive;
    }

    @Override
    public String toString() {
        return "Bus{" +
                "max_passenger=" + max_passenger +
                ", now_passenger=" + now_passenger +
                ", fee=" + fee +
                ", carNum=" + carNum +
                ", oil=" + oil +
                ", speed=" + speed +
                ", drive=" + drive +
                '}';
    }
}
