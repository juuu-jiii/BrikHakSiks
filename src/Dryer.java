public class Dryer extends Machine{

    public Dryer(String type) {
        super(type);
    }

    @Override
    public void operate() {
        // Set internal timer to remind in 43 minutes
        // Set internal timer to notify in 45 minutes
        isAvailable = false;
        System.out.println("Timer set!");
    }

    @Override
    public void report() {
        // Send message to RIT Housing
        isWorking = false;
        System.out.println("Report sent!");
    }
}
