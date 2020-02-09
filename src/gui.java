import java.awt.*;
import java.awt.event.*;


public class gui {

    private static final int button_count = 12;
    private static final int pop_up_button_count = 4;
    public static int washTime;

    // Declare a Frame type variable
    Frame frame;
    Frame popUpFrame;

    // Create an array of Button type Objects
    Button[] button = new Button[button_count];
    Button[] popUpButton = new Button[pop_up_button_count];

    // Create an array of values to hold the amount of time for each different wash cycle
    int[] washTimeArray = {23, 25, 27, 29};

    public gui() {
        // Create Frame Object and pass in the Frame Name / title
        frame = new Frame("Laundry Room");
        popUpFrame = new Frame("Mode Select");

        // Use for loop to instantiate every button object
        for(int i = 0; i < button_count; ++i){
            button[i] = new Button("Washing Machine: " + (i + 1) );
        }

        for (int i = 0; i < pop_up_button_count; i += 1)
        {
            popUpButton[i] = new Button((2 * i + 23) + " minutes");
        }
    }


    public static void main(String[] args) {

        // Create an instance of SimpleAwtGui
        gui window = new gui();

        // call the showFrame() function to display the window
        window.showFrame();

    }

    // Not necessary but good practice all codes inside this can be written inside main
    public void showFrame() {
        // set the size of the window
        frame.setSize(850, 850);
        popUpFrame.setSize(500, 500);

        // set the layout for the window
        frame.setLayout(new FlowLayout());
        popUpFrame.setLayout((new FlowLayout()));

        // Add all of the buttons to the layout
        for(int i = 0; i < button_count; ++i) {
            int finalI = i;
            button[i].addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {
                    popUpFrame.setVisible(true);
                    for (int i = 0; i < pop_up_button_count; i++)
                    {
                        int finalI1 = i;
                        popUpButton[i].addActionListener((new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                washTime = washTimeArray[finalI1];
                            }
                        }));
                        popUpButton[i].setPreferredSize(new Dimension(150, 70));
                        popUpFrame.add(popUpButton[i]);
                    }

                    // button[finalI].setBackground(Color.RED);
                    //frame.add(new TextField("Button pressed"));
                    //frame.setVisible(true);
                }
            });
            button[i].setBackground(Color.GREEN);
            button[i].setPreferredSize(new Dimension(200, 200));
            frame.add(button[i]);
        }

        // Register window listener event to the frame without implementing WindowListener
        frame.addWindowListener(
                new WindowAdapter() {
                    public void windowClosing(WindowEvent e)
                    {
                        System.exit(0);
                    }
                }
        );

        // set the frame visible otherwise nothing will be shown
        frame.setVisible(true);
    }
}