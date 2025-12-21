package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;


public class Main extends JFrame{
    JPanel pnlNorth, pnlCenter, pnlSouth;
    JLabel lblHeader, lbllogin,lblsubheader,lblOr;
    JTextField txtUsername, txtPassword;
    JButton btnLogin, btnForgotPassword,btnCreateProfile;


    ImageIcon icon;


    public Main() {
        super("Login");
        pnlNorth = new JPanel();
        pnlCenter = new JPanel();
        pnlSouth = new JPanel();

        lblHeader = new JLabel(
                "<html><b><span style = 'font-size: 13px'> Welcome to NSFAS </span></b><br>" +
                        "<span style = 'font-size :6px; '>All current NSFAS beneficiaries are required to create an account </span></html> "
        );

        lbllogin = new JLabel("<html><u><span style = 'color:red; font-weight:bold; font-size: 11px;'>Login</span></u></html>");
        lblOr = new JLabel("――――――――Or――――――――");


        //Creating placeholders in substitute of Jlabels
        txtUsername = new JTextField("Username");
        txtUsername.setForeground(Color.GRAY);
        txtUsername.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (txtUsername.getText().equals("Username")) {
                    txtUsername.setText("");
                    txtUsername.setForeground(Color.BLACK);
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (txtUsername.getText().isEmpty()) {
                    txtUsername.setText("Username");
                    txtUsername.setForeground(Color.GRAY);
                }

            }
        });
        txtPassword = new JTextField("Password");
        txtPassword.setForeground(Color.GRAY);
        txtPassword.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (txtPassword.getText().equals("Password")) {
                    txtPassword.setText("");
                    txtPassword.setForeground(Color.BLACK);
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (txtPassword.getText().isEmpty()) {
                    txtPassword.setText("Password");
                    txtPassword.setForeground(Color.GRAY);
                }

            }
        });

        btnLogin = new JButton("<html><span style = 'color:White'>Login</span></html>");
        btnLogin.setBackground(Color.RED);
        btnForgotPassword = new JButton("<html><span style = 'color:White'>Forgot Password</span></html>");
        btnForgotPassword.setBackground(Color.RED);
        btnCreateProfile = new JButton("<html><span style = ' color:Black; font-size: 10px'>Create Account</span></html>");
        btnCreateProfile.setBackground(Color.WHITE);


        lblsubheader = new JLabel("<html>" +
                "<b><span style ='color: Black; font-size:12px;'> Don't have profile</b></span><br>" +
                " <span style ='font-size : 7px;'>Get started by creating a profile</span>" + "</html>");

    }
public void setGUI(){
pnlNorth.setLayout(new BoxLayout(pnlNorth, BoxLayout.Y_AXIS));
pnlCenter.setLayout(new BoxLayout(pnlCenter, BoxLayout.Y_AXIS));

pnlSouth.setLayout(new BoxLayout(pnlSouth, BoxLayout.Y_AXIS));

//Setting the size of the panel north components to be able to center it
lblHeader.setMaximumSize(new Dimension(300,lblHeader.getPreferredSize().height));
lblHeader.setAlignmentX(Component.CENTER_ALIGNMENT);
lblHeader.setBorder(BorderFactory.createEmptyBorder(0, 40, 0, 0));
pnlNorth.add(lblHeader);
pnlNorth.add(Box.createVerticalStrut(10));
lbllogin.setMaximumSize(new Dimension(300,lbllogin.getPreferredSize().height));
lbllogin.setAlignmentX(Component.CENTER_ALIGNMENT);
lbllogin.setBorder(BorderFactory.createEmptyBorder(0, 110, 0, 0));

pnlNorth.add(lbllogin);
pnlNorth.add(Box.createVerticalStrut(10));


JPanel txtFields = new JPanel(new GridLayout(0,1));



txtFields.add(txtUsername);
txtFields.add(Box.createVerticalStrut(2));
txtFields.add(txtPassword);


JPanel btns = new JPanel(new FlowLayout(FlowLayout.CENTER,40,10));
btns.add(btnLogin);
btns.add(Box.createHorizontalStrut(5));
btns.add(btnForgotPassword);

pnlCenter.add(txtFields);
pnlCenter.add(Box.createVerticalStrut(10));
pnlCenter.add(btns);
pnlCenter.add(Box.createVerticalStrut(13));
pnlCenter.add(lblOr);
lblOr.setBorder(BorderFactory.createEmptyBorder(0, 0, 45, 30));
lblOr.setAlignmentX(Component.CENTER_ALIGNMENT);

lblsubheader.setMaximumSize(new Dimension(300,btnCreateProfile.getPreferredSize().height));
lblsubheader.setAlignmentX(Component.CENTER_ALIGNMENT);
lblsubheader.setBorder(BorderFactory.createEmptyBorder(0, 80, 6, 0));
pnlSouth.add(lblsubheader);

pnlSouth.add(Box.createVerticalStrut(15));
pnlSouth.add(btnCreateProfile);
btnCreateProfile.setMaximumSize(new Dimension(btnCreateProfile.getPreferredSize().width, btnCreateProfile.getPreferredSize().height));
btnCreateProfile.setAlignmentX(Component.CENTER_ALIGNMENT);
btnCreateProfile.setBorder(BorderFactory.createEmptyBorder(0, 10, 0, 10));


this.setLayout(new BorderLayout());
this.add(pnlNorth, BorderLayout.NORTH);
this.add(pnlCenter,BorderLayout.CENTER);
this.add(pnlSouth,BorderLayout.SOUTH);

//this.setSize(300,300);

this.pack();
this.setVisible(true);
this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        }




    public static void main(String[] args) {

new Main().setGUI();
        }
    }
