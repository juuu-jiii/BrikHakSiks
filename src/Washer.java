public class Washer extends Machine {

    public Washer(boolean isWorking, boolean isInUse){
        super(isWorking, isInUse);
    }

    @Override
    public boolean checkIfInUse(){
        if(checkIfWorking() == false){
            return false;
        }
        if(isInUse == false){
           return false;
        }
        else{
            return true;
        }
    }

    @Override
    public boolean checkIfWorking(){
        if(isWorking == false){
            return false;
        }
        else{
            return true;
        }

    }

    @Override
    public void editUsageStatus(){
        if(isInUse == false){
            isInUse = true;
        }
        else{
            isInUse = false;
        }
    }

    @Override
    public void editWorkingStatus(){
        if(isWorking == false){
            isWorking = true;
        }
        else{
            isWorking = false;
        }
    }
}
