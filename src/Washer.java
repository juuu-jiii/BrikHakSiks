public class Washer extends Machine {

    public Washer(boolean isWorking, boolean isInUse){
        super(isWorking, isInUse);
    }

    @Override
    public boolean checkIfInUse(){
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
}
