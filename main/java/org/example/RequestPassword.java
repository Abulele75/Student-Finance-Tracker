package org.example;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class RequestPassword extends JFrame {
    JPanel pnlNorth, pnlCenter;

    JTextField txtRequestUsername, txtRequestEmail;
    JButton btnRequestPassword;
    ImageIcon icon;
    JLabel logoLabel = new JLabel();


    public RequestPassword(){

        this.setTitle("Request Password");

        pnlNorth = new JPanel();
        pnlCenter = new JPanel();
        txtRequestUsername = new JTextField("Username");
        txtRequestUsername.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (txtRequestUsername.getText().equals("Enter Username")) {
                    txtRequestUsername.setText("");
                    txtRequestUsername.setForeground(Color.BLACK);
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (txtRequestUsername.getText().isEmpty()) {
                    txtRequestUsername.setText(" Enter Username");
                    txtRequestUsername.setForeground(Color.GRAY);
                }

            }
        });
        //txtRequestUsername.setForeground(Color.GRAY);
        txtRequestEmail = new JTextField();
        txtRequestEmail.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (txtRequestEmail.getText().equals("Enter Email Address")) {
                    txtRequestEmail.setText("");
                    txtRequestEmail.setForeground(Color.BLACK);
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (txtRequestEmail.getText().isEmpty()) {
                    txtRequestEmail.setText("Enter Email Address");
                    txtRequestEmail.setForeground(Color.GRAY);
                }

            }
        });


        btnRequestPassword = new JButton();
        btnRequestPassword.setForeground(Color.RED);
        btnRequestPassword = new JButton("<html><span style = 'color:White'>Request password</span></html>");
        btnRequestPassword.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(btnRequestPassword.isSelected()){
                    btnRequestPassword.getText().equals(txtRequestUsername.getText());
                    btnRequestPassword.getText().equals(txtRequestEmail.getText());
                    JOptionPane.showMessageDialog(null,"Please enter your username and password ");
                }
                else{
                    JOptionPane.showMessageDialog(null,"Please enter your username and email address");
                }
            }
        });



        icon = RoundedImageUtil.createRoundedImageIcon("/images/Nsfas.png",80);

        if(icon != null){
            logoLabel.setIcon(icon);
            logoLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
            logoLabel.setHorizontalAlignment(JLabel.CENTER);
            logoLabel.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 28));


        }
        setGUI();
    }

    public void setGUI(){

        pnlNorth.setLayout(new GridLayout(1,1));
        pnlCenter.setLayout(new GridLayout(3,1));


        pnlNorth.add(logoLabel);

       JPanel btn = new JPanel();
       btn.setLayout(new FlowLayout());
       btn.add(btnRequestPassword);

       pnlCenter.add(txtRequestUsername);
       pnlCenter.add(txtRequestEmail);
       pnlCenter.add(btn);

       this.add(pnlNorth,BorderLayout.NORTH);
       this.add(pnlCenter,BorderLayout.CENTER);


        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
       this.pack();
       this.setVisible(true);
      // this.setDefaultCloseOperation(EXIT_ON_CLOSE);

    }
/*
    public static void main(String[] args) {
        new RequestPassword().setGUI();
    }
*/

}
