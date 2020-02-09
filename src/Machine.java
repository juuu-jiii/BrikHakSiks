public abstract class Machine {
    protected boolean isWorking;
    protected boolean isAvailable;
    protected int timeLeft;
    protected String type;

    public Machine(boolean isWorking, boolean isAvailable, int timeLeft, String type){
        this.isWorking = isWorking;
        this.isAvailable = isAvailable;
        this.timeLeft = timeLeft;
        this.type = type;
    }

    // Checks if selected machine is taken up
    public boolean checkIfAvailable() {
        if (checkIfWorking() == false) {
            return false;
        }
        if (isAvailable == false) {
            return false;
        } else {
            return true;
        }
    }

    // Checks if selected machine is in working order
    public boolean checkIfWorking(){
        if(isWorking == false){
            return false;
        }
        else{
            return true;
        }
    }

    // Switches usage status from AVAILABLE to UNAVAILABLE and vice versa
    public void editUsageStatus(){
        if(isAvailable == false){
            isAvailable = true;
        }
        else{
            isAvailable = false;
        }
    }

    // Switches working status from FUNCTIONING to OUT OF ORDER and vice versa
    public void editWorkingStatus(){
        if(isWorking == false){
            isWorking = true;
        }
        else{
            isWorking = false;
        }
    }


    public abstract void operate();

    public abstract void report();
}
