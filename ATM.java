package com.kasra;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class ATM extends JFrame implements ActionListener {
    JFrame frame;
    JPanel panel1, panel2, panel3, panel4, panel5, panel6, panel7, panel8, panel9, panel10, panel11, panel12,backPanel;
    JButton enButton, faButton, enterButton;
    JButton backButton1,backButton2 ,backButton3,backButton4,backButton5;
    JButton changePassButton, inventoryButton, cashWithdrawalButton, transferButton;
    JButton submitButton, cashButton1, cashButton2, cashButton3, cashButton4, enterButton2;
    Color color = new Color(0xFF95F61E, true);


    ATM() {
        // Create the main frame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.getContentPane().setBackground(color);
        this.setTitle("ATM");
        mainPanel();
        this.setResizable(false);
        this.setLayout(null);

        // Set frame size and make it visible
        this.setVisible(true);

    }

    public void mainPanel() {
        //Create page1:

        // Create buttons
        enButton = new JButton("English");
        enButton.setSize(100, 50);
        enButton.setFocusable(false);
        faButton = new JButton("فارسی");
        faButton.setSize(100, 50);
        faButton.addActionListener(this);
        faButton.setFocusable(false);

        // Create labels
        JLabel englishLabel = new JLabel("Choose Language");
        JLabel persianLabel = new JLabel("زبان خود را انتخاب کنید");


        panel1 = new JPanel();
        panel1.setLayout(new GridLayout(1, 4, 20, 0));
        panel1.setBounds(0, 225, 500, 50);
        panel1.setBackground(color);

        panel1.add(enButton);
        panel1.add(englishLabel);
        panel1.add(persianLabel);
        panel1.add(faButton);

        this.add(panel1);
    }

    public void page2() {
        //Create page2:
        JLabel passwordLabel = new JLabel("رمز خود را وارد کنید");
        JPasswordField passwordField = new JPasswordField();
        enterButton = new JButton("ثبت");
        enterButton.setFocusable(false);
        enterButton.addActionListener(this);

        panel2 = new JPanel(new GridLayout(2, 1, 0, 40));
        panel2.setBounds(200, 215, 100, 70);
        panel2.setBackground(color);

        panel3 = new JPanel(new GridLayout(1, 1));
        panel3.setBounds(200, 400, 100, 50);

        backPanel = new JPanel(new GridLayout(1,1));
        backPanel.setBounds(10,400,70,20);
        backButton1 = new JButton("برگشت");
        backButton1.setFont(new Font("Time",Font.BOLD,8));
        backButton1.setFocusable(false);
        backButton1.addActionListener(this);
        backPanel.add(backButton1);


        panel2.add(passwordLabel);
        panel2.add(passwordField);
        panel3.add(enterButton);
        this.remove(panel1);
        this.add(panel2);
        this.add(panel3);
        this.add(backPanel);
        this.revalidate();
        this.repaint();

    }

    public void page3() {
        //Create page3:

        //Create Buttons:
        cashWithdrawalButton = new JButton("برداشت وجه");
        cashWithdrawalButton.setFocusable(false);
        cashWithdrawalButton.addActionListener(this);
        changePassButton = new JButton("تغییر رمز");
        changePassButton.setFocusable(false);
        changePassButton.addActionListener(this);
        transferButton = new JButton("کارت به کارت");
        transferButton.setFocusable(false);
        transferButton.addActionListener(this);
        inventoryButton = new JButton("اعلام موجودی");
        inventoryButton.setFocusable(false);
        inventoryButton.addActionListener(this);

        //Create panel:
        panel4 = new JPanel(new GridLayout(2, 2, 290, 100));
        panel4.setBounds(0, 150, 490, 200);
        panel4.setBackground(color);

        //Add components
        panel4.add(cashWithdrawalButton);
        panel4.add(changePassButton);
        panel4.add(transferButton);
        panel4.add(inventoryButton);

        this.getContentPane().removeAll();
        this.add(panel4);
        this.revalidate();
        this.repaint();


    }

    public void page4() {
        //Create page4:
        //Create Label and Button
        JLabel newPasswordLabel = new JLabel("رمز جدید را وارد کنید:");
        JPasswordField newPasswordField = new JPasswordField();
        submitButton = new JButton("تایید");
        submitButton.setFocusable(false);
        submitButton.addActionListener(this);

        //Create panels
        panel5 = new JPanel(new GridLayout(2, 1, 0, 40));
        panel5.setBounds(200, 215, 100, 70);
        panel5.setBackground(color);

        panel6 = new JPanel(new GridLayout(1, 1));
        panel6.setBounds(200, 400, 100, 50);

        backPanel = new JPanel(new GridLayout(1,1));
        backPanel.setBounds(10,400,70,20);
        backButton2 = new JButton("برگشت");
        backButton2.setFont(new Font("Time",Font.BOLD,8));
        backButton2.setFocusable(false);
        backButton2.addActionListener(this);
        backPanel.add(backButton2);

        //Add components
        panel5.add(newPasswordLabel);
        panel5.add(newPasswordField);
        panel6.add(submitButton);

        this.getContentPane().removeAll();
        this.add(panel5);
        this.add(panel6);
        this.add(backPanel);
        this.revalidate();
        this.repaint();
    }

    public void page5() {
        //Create page5:
        //Create Labels
        JLabel inventoryLabel = new JLabel();
        inventoryLabel.setText("موجودی حساب شما: 5410021410 ریال");

        //Create panels
        panel7 = new JPanel();
        panel7.setBounds(140, 200, 220, 50);
        panel7.setBackground(color);

        backPanel = new JPanel(new GridLayout(1,1));
        backPanel.setBounds(10,400,70,20);
        backButton2 = new JButton("برگشت");
        backButton2.setFont(new Font("Time",Font.BOLD,8));
        backButton2.setFocusable(false);
        backButton2.addActionListener(this);
        backPanel.add(backButton2);

        //Add components
        panel7.add(inventoryLabel);

        this.getContentPane().removeAll();
        this.add(panel7);
        this.add(backPanel);
        this.revalidate();
        this.repaint();
    }

    public void page6() {
        //Create page6:
        //Create buttons
        cashButton1 = new JButton("500000");
        cashButton1.setFocusable(false);
        cashButton1.addActionListener(this);
        cashButton2 = new JButton("1500000");
        cashButton2.setFocusable(false);
        cashButton2.addActionListener(this);
        cashButton3 = new JButton("1000000");
        cashButton3.setFocusable(false);
        cashButton3.addActionListener(this);
        cashButton4 = new JButton("2000000");
        cashButton4.setFocusable(false);
        cashButton4.addActionListener(this);

        //Create panel:
        panel8 = new JPanel(new GridLayout(2, 2, 290, 100));
        panel8.setBounds(0, 150, 490, 200);
        panel8.setBackground(color);

        //Add components
        panel8.add(cashButton1);
        panel8.add(cashButton2);
        panel8.add(cashButton3);
        panel8.add(cashButton4);

        backPanel = new JPanel(new GridLayout(1,1));
        backPanel.setBounds(10,400,70,20);
        backButton2 = new JButton("برگشت");
        backButton2.setFont(new Font("Time",Font.BOLD,8));
        backButton2.setFocusable(false);
        backButton2.addActionListener(this);
        backPanel.add(backButton2);

        this.getContentPane().removeAll();
        this.add(panel8);
        this.add(backPanel);
        this.revalidate();
        this.repaint();
    }

    public void page7() {
        //Create page7:
        //Create labels
        JLabel moneyLabel = new JLabel("مبلغ مورد نظر را وارد کنید:");
        JTextField moneyTextField = new JTextField();
        JLabel cardLabel = new JLabel("شماره کارت مقصد را وارد کنید:");
        JTextField cardTextField = new JTextField();
        enterButton2 = new JButton("ثبت");
        enterButton2.addActionListener(this);
        enterButton2.setFocusable(false);

        //Create panel
        panel9 = new JPanel(new GridLayout(2, 1, 0, 5));
        panel9.setBounds(150, 50, 200, 50);
        panel9.setBackground(color);

        panel10 = new JPanel(new GridLayout(2, 1, 0, 5));
        panel10.setBounds(150, 200, 200, 50);
        panel10.setBackground(color);

        panel11 = new JPanel(new GridLayout(1, 1, 0, 0));
        panel11.setBounds(200, 400, 100, 50);
        panel11.setBackground(color);

        //Add components
        panel9.add(moneyLabel);
        panel9.add(moneyTextField);
        panel10.add(cardLabel);
        panel10.add(cardTextField);
        panel11.add(enterButton2);

        backPanel = new JPanel(new GridLayout(1,1));
        backPanel.setBounds(10,400,70,20);
        backButton2 = new JButton("برگشت");
        backButton2.setFont(new Font("Time",Font.BOLD,8));
        backButton2.setFocusable(false);
        backButton2.addActionListener(this);
        backPanel.add(backButton2);

        this.getContentPane().removeAll();
        this.add(panel9);
        this.add(panel10);
        this.add(panel11);
        this.add(backPanel);
        this.revalidate();
        this.repaint();


    }

    public void page8() {
        //Create page8:
        JLabel endLabel = new JLabel("عملیات با موفقیت انجام شد!");

        //Create panel
        panel12 = new JPanel();
        panel12.setBounds(150, 200, 200, 50);
        panel12.setBackground(color);

        //Add component
        panel12.add(endLabel);

        backPanel = new JPanel(new GridLayout(1,1));
        backPanel.setBounds(10,400,70,20);
        backButton2 = new JButton("برگشت");
        backButton2.setFont(new Font("Time",Font.BOLD,8));
        backButton2.setFocusable(false);
        backButton2.addActionListener(this);
        backPanel.add(backButton2);

        this.getContentPane().removeAll();
        this.add(panel12);
        this.add(backPanel);
        this.revalidate();
        this.repaint();
    }

    public static void main(String[] args) {
        new ATM();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == faButton) {
            page2();
        }
        if (e.getSource() == enterButton) {
            page3();
        }
        if (e.getSource() == changePassButton) {
            page4();
        }
        if (e.getSource() == inventoryButton) {
            page5();
        }
        if (e.getSource() == cashWithdrawalButton) {
            page6();
        }
        if (e.getSource() == transferButton) {
            page7();
        }
        if (e.getSource() == submitButton) {
            page8();
        }
        if (e.getSource() == cashButton1 || e.getSource() == cashButton2 || e.getSource() == cashButton3 || e.getSource() == cashButton4) {
            page8();

        }
        if (e.getSource() == enterButton2) {
            page8();

        } else if (e.getSource() == backButton1) {
            this.getContentPane().removeAll();
            this.mainPanel();
            this.revalidate();
            this.repaint();
        }else if (e.getSource() == backButton2) {
            this.getContentPane().removeAll();
            this.page3();
            this.revalidate();
            this.repaint();
        }

    }
}
