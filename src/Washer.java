import java.util.Scanner;

public class Washer extends Machine {
    private Scanner in;
    public Washer(String type){
        super(type);
    }

    @Override
    public void operate(){
        while(true){
            System.out.print("Enter the duration of the wash cycle: ");
            String time = in.nextLine();
            if(time.equals("23")){
                //set timer for 23 minutes
            }
            else if(time.equals("25")){
                //set timer for 25 minutes
            }
            else if(time.equals("27")){
                //set timer for 27 minutes
            }
            else if(time.equals("29")){
                //set timer for 29 minutes
            }
            else{
                System.out.println("invalid input!");
            }
        }


    }

    @Override
    public void report(){
        isWorking = false;
    }
}
