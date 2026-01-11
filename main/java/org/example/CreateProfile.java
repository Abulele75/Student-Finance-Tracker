package org.example;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class CreateProfile extends JFrame {

    JPanel pnlNorth, pnlCenter, pnlSouth;
    JLabel lblheader,lblSubHeader,lblRobot,lblInfo,lblStar1, lblStar2, lblStar3, lblStar4, lblStar5, lblStar6, lblStar7,  lblStar8, lblStar9, lblStar10, lblStar11,lblstar12,
            lblMarried, lblDisabled;
    JTextField txtFirstName, txtLastName, txtIDNumber, txtHomeTown, txtemail, txtContactNumber,txtPassword,txtConfirmPassword;

    JRadioButton rdbnMarriedYes, rdbnMarriedNo, rdbnDisabledYes, RdbnDisabledNo;
    JComboBox cbRace, cbProvince;
    JTextArea txtArea;
    JCheckBox cbox,chkRobot;
    JButton btnDone;
    ButtonGroup group1,group2;

    public CreateProfile() {
        super("New Profile");

        pnlNorth = new JPanel();
        pnlCenter = new JPanel();
        pnlSouth = new JPanel();

        lblStar1 = new JLabel(
                "<html><b><span style = 'color:red'> *</span></b></html> ");
        lblStar2 = new JLabel("<html><b><span style = 'color:red'> *</span></b></html> ");
        lblStar3 = new JLabel("<html><b><span style = 'color:red'> *</span></b></html> ");
        lblStar4 = new JLabel("<html><b><span style = 'color:red'> *</span></b></html> ");
        lblStar5 = new JLabel("<html><b><span style = 'color:red'> *</span></b></html> ");
        lblStar6 = new JLabel("<html><b><span style = 'color:red'> *</span></b></html> ");
        lblStar7 = new JLabel("<html><b><span style = 'color:red'> *</span></b></html> ");
        lblStar8 = new JLabel("<html><b><span style = 'color:red'> *</span></b></html> ");
        lblStar9 = new JLabel("<html><b><span style = 'color:red'> *</span></b></html> ");
        lblStar10 = new JLabel("<html><b><span style = 'color:red'> *</span></b></html> ");
        lblStar11 = new JLabel("<html><b><span style = 'color:red'> *</span></b></html> ");
        lblstar12 = new JLabel("<html><b><span style = 'color:red'> *</span></b></html> ");

        lblheader = new JLabel("<html>" +
                "<b><span style ='color: Black; font-size:12px;'> Create profile</b></span><br>" +
                " <span style ='font-size : 7px;'>Get started by creating a new profile</span>" + "</html>");
        lblSubHeader= new JLabel("<html>" +
                "<b><span style ='color: Black; font-size:12px;'> Password</b></span><br>" +
                " <span style ='font-size : 8px;'>Protect your profile</span>" + "</html>");

        lblRobot = new JLabel("<html>reCAPTCHA is changing its terms of service<br><u>Take action</u></html>");

        lblInfo = new JLabel("<html><span style = 'color: red; font-size: 6px'> Please ensure that you complete all fields (blocks) which are compulsory. " +
                "These compulsory fields (blocks) are indicated by an asterisk(*))</span></html>");

        txtFirstName = new JTextField();
        txtFirstName.setText("First name(s) as seen on your ID document");
        txtFirstName.setForeground(Color.GRAY);
        txtFirstName.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (txtFirstName.getText().equals("First name(s) as seen on your ID document")) {
                    txtFirstName.setText("");
                    txtFirstName.setForeground(Color.GRAY);
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (txtFirstName.getText().isEmpty()) {
                    txtFirstName.setText("First name(s) as seen on your ID document");
                    txtFirstName.setForeground(Color.GRAY);
                }

            }
        });

        txtLastName = new JTextField();
        txtLastName.setText("last name as seen on your ID document");
        txtLastName.setForeground(Color.GRAY);
        txtLastName.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (txtLastName.getText().equals("last name as seen on your ID document")) {
                    txtLastName.setText("");
                    txtLastName.setForeground(Color.GRAY);
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (txtLastName.getText().isEmpty()) {
                    txtLastName.setText("last name as seen on your ID document");
                    txtLastName.setForeground(Color.GRAY);
                }

            }


        });


        txtIDNumber = new JTextField();
        txtIDNumber.setText("ID number as seen on your ID document");
        txtIDNumber.setForeground(Color.GRAY);
        txtIDNumber.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (txtIDNumber.getText().equals("ID number as seen on your ID document")) {
                    txtIDNumber.setText("");
                    txtIDNumber.setForeground(Color.GRAY);
                }

            }

            @Override
            public void focusLost(FocusEvent e) {
                if (txtIDNumber.getText().isEmpty()) {
                    txtIDNumber.setText("ID number as seen on your ID document");
                    txtIDNumber.setForeground(Color.GRAY);
                }

            }
        });

        txtHomeTown = new JTextField();
        txtHomeTown.setText("Home Town");
        txtHomeTown.setForeground(Color.GRAY);
        txtHomeTown.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (txtHomeTown.getText().equals("Home Town")) {
                    txtHomeTown.setText("");
                    txtHomeTown.setForeground(Color.GRAY);
                }

            }

            @Override
            public void focusLost(FocusEvent e) {
                if (txtHomeTown.getText().isEmpty()) {
                    txtHomeTown.setText("Home Town");
                    txtHomeTown.setForeground(Color.GRAY);
                }

            }
        });
        txtemail = new JTextField();
        txtemail.setText("Applicant's email");
        txtemail.setForeground(Color.GRAY);
        txtemail.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (txtemail.getText().equals("Applicant's email")) {
                    txtemail.setText("");
                    txtemail.setForeground(Color.GRAY);
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (txtemail.getText().isEmpty()) {
                    txtemail.setText("Applicant's email");
                    txtemail.setForeground(Color.GRAY);
                }

            }
        });

        txtContactNumber = new JTextField();
        txtContactNumber.setText("applicant's contact Number");
        txtContactNumber.setForeground(Color.GRAY);
        txtContactNumber.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (txtContactNumber.getText().equals("applicant's contact Number")) {
                    txtContactNumber.setText("");
                    txtContactNumber.setForeground(Color.GRAY);
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (txtContactNumber.getText().isEmpty()) {
                    txtContactNumber.setText("applicant's contact Number");
                    txtContactNumber.setForeground(Color.GRAY);
                }

            }
        });
        txtPassword = new JPasswordField();
        txtPassword.setText("Password");
        txtPassword.setForeground(Color.GRAY);
        txtPassword.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (txtPassword.getText().equals("Password")) {
                    txtPassword.setText("");
                    txtPassword.setForeground(Color.GRAY);
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

        txtConfirmPassword = new JPasswordField();
        txtConfirmPassword.setText("Confirm Password");
        txtConfirmPassword.setForeground(Color.GRAY);
        txtConfirmPassword.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if(txtConfirmPassword.getText().equals("Confirm Password")){
                    txtConfirmPassword.setText("");
                    txtConfirmPassword.setForeground(Color.GRAY);
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if(txtConfirmPassword.getText().isEmpty()){
                    txtConfirmPassword.setText("Confirm Password");
                    txtConfirmPassword.setForeground(Color.GRAY);
                }

            }
        });

        lblMarried = new JLabel("Are you married?");
        lblDisabled = new JLabel("Are you disabled?");

        rdbnMarriedNo = new JRadioButton("No");
        rdbnMarriedYes = new JRadioButton("Yes");
        RdbnDisabledNo = new JRadioButton("No");
        rdbnDisabledYes = new JRadioButton("Yes");

        group1 = new ButtonGroup();
        group1.add(rdbnMarriedNo);
        group1.add(rdbnMarriedYes);
        
        group2 = new ButtonGroup();
        group2.add(rdbnDisabledYes);
        group2.add(RdbnDisabledNo);

        String[] race = {"Black", "White", "Colored", "Indian", "Other"};
        cbRace = new JComboBox(race);
        cbRace.setSelectedIndex(0);

        String[] province = {"Eastern Cape", "Western Cape", "Northern Cape", "Mpumalanga", "Kwazulu-Natal", "North West", "Gauteng", "Limpopo", "Free State"};
        cbProvince = new JComboBox(province);
        cbProvince.setSelectedIndex(0);

        txtArea = new JTextArea("Please note, all forms of communication from NSFAS will be sent to the registered contact number and email address");
        txtArea.setEditable(false);
        txtArea.setLineWrap(true);
        txtArea.setWrapStyleWord(true);
        txtArea.setRows(3);

        cbox = new JCheckBox("<html> Read and understood T&C's <u><span style = 'font-weight : 10px;'>View T's & C's <br> Download Terms and Conditions</span style></u></html>");

        chkRobot = new JCheckBox("I'm not a robot");
        JPanel robotPanel1 = new JPanel();
        robotPanel1.setLayout(new BoxLayout(robotPanel1, BoxLayout.Y_AXIS));
        robotPanel1.add(chkRobot);
        robotPanel1.add(lblRobot);
       /* if(!chkRobot.isSelected()){
            JOptionPane.showMessageDialog(null, "Please confirm you're not a robot");
            return;
        }*/

        btnDone = new JButton("Done");
        btnDone.setForeground(Color.red);
        btnDone.addActionListener(new ActionListener() {
            @Override
            public  void actionPerformed(ActionEvent e ){
                if(txtFirstName.getText().isEmpty() || txtLastName.getText().isEmpty()|| txtIDNumber.getText().isEmpty()||
                rdbnMarriedYes.getText().isEmpty() || rdbnMarriedNo.getText().isEmpty()||rdbnDisabledYes.getText().isEmpty()|| RdbnDisabledNo.getText().isEmpty()||
                        cbRace.getSelectedItem().toString().isEmpty()|| cbProvince.getSelectedItem().toString().isEmpty()||txtHomeTown.getText().isEmpty()|| txtemail.getText().isEmpty()||
                        txtContactNumber.getText().isEmpty()||cbox.getText().isEmpty()|| txtPassword.getText().isEmpty()||txtConfirmPassword.getText().isEmpty()){
                    JOptionPane.showMessageDialog(null, "Please fill out all the missing fields");
                }
                else{
                    JOptionPane.showMessageDialog(null, "Profile has been created successfully");
                }
            }
        });



setGUI();



    }
    public void setGUI() {
        pnlNorth.setLayout(new FlowLayout());
        pnlCenter.setLayout(new GridLayout(14, 2,8,8));
        pnlSouth.setLayout(new GridLayout(6, 2,8,8));

        pnlNorth.add(lblheader);

        pnlCenter.add(lblStar1);
        pnlCenter.add(txtFirstName);
        pnlCenter.add(lblStar2);
        pnlCenter.add(txtLastName);
        pnlCenter.add(lblStar3);
        pnlCenter.add(txtIDNumber);
        pnlCenter.add(lblStar4);
        pnlCenter.add(lblMarried);
        pnlCenter.add(rdbnMarriedNo);
        pnlCenter.add(rdbnMarriedYes);
        pnlCenter.add(lblDisabled);
        pnlCenter.add(RdbnDisabledNo);
        pnlCenter.add(rdbnDisabledYes);
        pnlCenter.add(lblStar5);
        pnlCenter.add(cbRace);
        pnlCenter.add(lblStar6);
        pnlCenter.add(cbProvince);
        pnlCenter.add(lblStar7);
        pnlCenter.add(txtHomeTown);
        pnlCenter.add(lblStar8);
        pnlCenter.add(txtemail);
        pnlCenter.add(lblStar9);
        pnlCenter.add(txtContactNumber);
        pnlCenter.add(txtArea);
        pnlCenter.add(lblStar10);
        pnlCenter.add(chkRobot);

        pnlSouth.add(lblSubHeader);
        pnlSouth.add(lblStar11);
        pnlSouth.add(txtPassword);
        pnlSouth.add(lblstar12);
        pnlSouth.add(txtConfirmPassword);
        pnlSouth.add(chkRobot);
        pnlSouth.add(lblInfo);
        pnlCenter.add(btnDone);

        this.setLayout(new BorderLayout());
        this.add(pnlNorth, BorderLayout.NORTH);
        this.add(pnlCenter, BorderLayout.CENTER);
        this.add(pnlSouth, BorderLayout.SOUTH);

        this.pack();
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);


    }

    }



