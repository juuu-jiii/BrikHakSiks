public abstract class Machine {
    protected boolean isWorking;
    protected boolean isAvailable;
    protected int timeLeft;
    protected String type;

    public Machine(String type){
        isWorking = true;
        isAvailable = true;
        timeLeft = 0;
        this.type = type;
    }

    // Checks if selected machine is taken up
    public boolean checkIfAvailable() {
        if (checkIfWorking() == false) {
            return false;
        }
        else return isAvailable;
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
