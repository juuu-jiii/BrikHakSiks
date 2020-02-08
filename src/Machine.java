public abstract class Machine {
    protected boolean isWorking;
    protected boolean isAvailable;

    public Machine(boolean isWorking, boolean isAvailable){
        this.isWorking = isWorking;
        this.isAvailable = isAvailable;
    }

    public abstract boolean checkIfAvailable();

    public abstract boolean checkIfWorking();

    public abstract void editUsageStatus();

    public abstract void editWorkingStatus();
}
