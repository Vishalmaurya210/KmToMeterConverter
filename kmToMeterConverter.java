package SwingBuilder;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class kmToMeterConverter extends JFrame  implements ActionListener {
    JButton b1, b2 , b3;
    JLabel l1, l2;
    JTextField t1, t2;
    

    public kmToMeterConverter() {
        initComponents();

    }
    public void initComponents() {
        setTitle("Unit converter");
        setSize(400,400);
        setLocationRelativeTo(null);
        setLayout(null);

        b1 = new JButton("Converter");
        b2 = new JButton("Clear");
        b3 = new JButton("Quit");

        l1 = new JLabel("Enter km: ");
        l2 = new JLabel("Meter : ");

        t1 = new JTextField();
        t2 = new JTextField();
        t2.setEditable(false);

        l1.setBounds(50, 50, 120, 30);
        t1.setBounds(200, 50, 150, 30);

        l2.setBounds(50, 100, 120, 30);
        t2.setBounds(200, 100, 150, 30);

        b1.setBounds(40,140,90,30);
        b2.setBounds(160,140,90,30);
        b3.setBounds(260,140,90,30);

        add(l1); add(l2);
        add(b1); add(b2);
        add(b3);
        add(t1); add(t2);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent ae){
    if(ae.getSource()==b1){
        try{
        double km = Double.parseDouble(t1.getText());
        double meter = km*1000;
        t2.setText(String.valueOf(meter));
        }
        catch(NumberFormatException nfe){
        JOptionPane.showMessageDialog(null, "Please enter digit only!", "Error!", JOptionPane.ERROR_MESSAGE);

        }
    }
    if(ae.getSource()==b2){
        t1.setText(" ");
        t2.setText(" ");
        t1.requestFocus();
    }
    if(ae.getSource()==b3){
        int reps;
        reps = JOptionPane.showConfirmDialog(null,"Are you sure you want to quit ?","Quiting",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
    if(reps==JOptionPane.YES_OPTION){
        System.exit(0);
    }
    }

    }

    public static void main(String[] args) {
        new kmToMeterConverter();
    }



}




