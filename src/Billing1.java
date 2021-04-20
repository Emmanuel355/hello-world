import javax.swing.*;
import java.awt.*;

public class Billing1 extends JPanel {
   JButton Panel1Button = new JButton("Add");

   JLabel Heading = new JLabel("Please Select The products you wish To Buy");


   // Buttons
   JTextField item1 = new JTextField(15);
   JTextField item2 = new JTextField(15);
   JTextField item3 = new JTextField(15);
   JTextField item4 = new JTextField(15);
   JTextField item5 = new JTextField(15);

   //Labels
    JLabel item1La = new JLabel("Item 1");
    JLabel item2La = new JLabel("Item 2");
    JLabel item3La = new JLabel("Item 3");
    JLabel item4La = new JLabel("Item 4");
    JLabel item5La = new JLabel("Item 5");



    Billing1(){
        GridBagLayout layout = new GridBagLayout();
        setLayout(layout);

        GridBagConstraints Heading_constraints = new GridBagConstraints();
        Heading_constraints.gridx = 0;
        Heading_constraints.gridy = 0;
        Heading_constraints.insets = new Insets(4, 4, 4, 4);
        Heading_constraints.gridwidth = 2;
        add(Heading, Heading_constraints);


        //Item 1
        GridBagConstraints item1La_constraints = new GridBagConstraints();
        item1La_constraints.gridx = 0;
        item1La_constraints.gridy = 1;
        item1La_constraints.insets = new Insets(4, 4, 4, 4);
        add(item1La, item1La_constraints);

        GridBagConstraints item1_constraints = new GridBagConstraints();
        item1_constraints.gridx = 1;
        item1_constraints.gridy = 1;
        item1_constraints.insets = new Insets(4, 4, 4, 4);
        add(item1, item1_constraints);

        //Item 2

        GridBagConstraints item2La_constraints = new GridBagConstraints();
        item2La_constraints.gridx = 0;
        item2La_constraints.gridy = 2;
        item2La_constraints.insets = new Insets(4, 4, 4, 4);
        add(item2La, item2La_constraints);

        GridBagConstraints item2_constraints = new GridBagConstraints();
        item2_constraints.gridx = 1;
        item2_constraints.gridy = 2;
        item2_constraints.insets = new Insets(4, 4, 4, 4);
        add(item2, item2_constraints);


        // Item 3
        GridBagConstraints item3La_constraints = new GridBagConstraints();
        item3La_constraints.gridx = 0;
        item3La_constraints.gridy = 3;
        item3La_constraints.insets = new Insets(4, 4, 4, 4);
        add(item3La, item3La_constraints);

        GridBagConstraints item3_constraints = new GridBagConstraints();
        item3_constraints.gridx = 1;
        item3_constraints.gridy = 3;
        item3_constraints.insets = new Insets(4, 4, 4, 4);
        add(item3, item3_constraints);


        //Item 4
        GridBagConstraints item4La_constraints = new GridBagConstraints();
        item4La_constraints.gridx = 0;
        item4La_constraints.gridy = 4;
        item4La_constraints.insets = new Insets(4, 4, 4, 4);
        add(item4La, item4La_constraints);

        GridBagConstraints item4_constraints = new GridBagConstraints();
        item4_constraints.gridx = 1;
        item4_constraints.gridy = 4;
        item4_constraints.insets = new Insets(4, 4, 4, 4);
        add(item4, item4_constraints);

        //Item 5

        GridBagConstraints item5La_constraints = new GridBagConstraints();
        item5La_constraints.gridx = 0;
        item5La_constraints.gridy = 5;
        item5La_constraints.insets = new Insets(4, 4, 4, 4);
        add(item5La, item5La_constraints);

        GridBagConstraints item5_constraints = new GridBagConstraints();
        item5_constraints.gridx = 1;
        item5_constraints.gridy = 5;
        item5_constraints.insets = new Insets(4, 4, 4, 4);
        add(item5, item5_constraints);















    }






}
