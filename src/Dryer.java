public class Dryer extends Machine{

    public Dryer(boolean isWorking, boolean isAvailable) {
        super(isWorking, isAvailable);
    }

    @Override
    public boolean checkIfAvailable(){
        if(checkIfWorking() == false){
            return false;
        }
        if(isAvailable == false){
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
        if(isAvailable == false){
            isAvailable = true;
        }
        else{
            isAvailable = false;
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
