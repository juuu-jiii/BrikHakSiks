public abstract class Machine {
    protected boolean isWorking;
    protected boolean isAvailable;

    public Machine(boolean isWorking, boolean isAvailable){
        this.isWorking = isWorking;
        this.isAvailable = isAvailable;
    }

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

    public boolean checkIfWorking(){
        if(isWorking == false){
            return false;
        }
        else{
            return true;
        }
    }

    public void editUsageStatus(){
        if(isAvailable == false){
            isAvailable = true;
        }
        else{
            isAvailable = false;
        }
    }

    public void editWorkingStatus(){
        if(isWorking == false){
            isWorking = true;
        }
        else{
            isWorking = false;
        }
    }
}
