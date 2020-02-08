public abstract class Machine {
    protected boolean isWorking;
    protected boolean isInUse;

    public Machine(boolean isWorking, boolean isInUse){
        this.isWorking = true;
        this.isInUse = true;
    }

    public abstract boolean checkIfInUse();

    public abstract boolean checkIfWorking();
}
