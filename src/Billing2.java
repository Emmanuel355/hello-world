import javax.swing.*;
import java.awt.*;
import java.util.concurrent.Flow;

public class Billing2 extends JPanel {
    JLabel displayItems;
    String[] ItemsAvailable = {"Bread", "Beans", "Oranges", "Apples", "Water Melons"};


    Billing2(){
        GridBagLayout grid  = new GridBagLayout();
        GridBagConstraints constraints = new GridBagConstraints();


        for (int i = 0; i < ItemsAvailable.length; i++){
            displayItems = new JLabel(i + " " + ItemsAvailable[i]);


            add(displayItems);
        }




    }
}
