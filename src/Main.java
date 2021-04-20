import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame implements ActionListener {
    String[] ItemsAvailable = {"Bread", "Beans", "Oranges", "Apples", "Water Melons"};

    //External Panels
     Billing1 pane1 = new Billing1();
     Billing2 panel2 = new Billing2();





    Main(){
        super("Billing System");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        add(panel2);







        setVisible(true);



    }






    public static void main(String[] args) {


        new Main();
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {


        Object source = actionEvent.getSource();

    }
}
