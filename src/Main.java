public class Main {
    private final static int NUM_WASHERS = 20;
    private final static int NUM_DRYERS = 20;

    public static void main(String[] args){
        Machine[] washerArray = new Machine[NUM_WASHERS];
        for(int i = 0; i < NUM_WASHERS; i++){
            washerArray[i] = new Washer(true, true);
        }
        Machine[] dryerArray = new Machine[NUM_DRYERS];
        for(int j = 0; j < NUM_DRYERS; j++){
            dryerArray[j] = new Dryer(true,true);
        }
    }
}