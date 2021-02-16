package kodluyoruz.client;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ConnectScreen extends JFrame implements ActionListener {
    Container container = getContentPane();
    JLabel ipLabel = new JLabel("IP Adress");
    JLabel portLabel = new JLabel("Port");
    JTextField ipTextField = new JTextField();
    JTextField portField = new JTextField();
    JButton joinServerButton = new JButton("Join Server");
    JButton resetButton = new JButton("RESET");

    ConnectScreen() {
        this.setTitle("Connection to Server");
        this.setVisible(true);
        this.setBounds(100, 100, 400, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        setLayoutManager();
        setLocationAndSize();
        addComponentsToContainer();

        addActionEvent();
    }
    public void setLayoutManager() {
        container.setLayout(null);
    }
    public void setLocationAndSize() {
        ipLabel.setBounds(50, 150, 100, 30);
        portLabel.setBounds(50, 220, 100, 30);
        ipTextField.setBounds(150, 150, 150, 30);
        portField.setBounds(150, 220, 150, 30);
        joinServerButton.setBounds(50, 300, 100, 30);
        resetButton.setBounds(200, 300, 100, 30);

    }
    public void addComponentsToContainer() {
        container.add(ipLabel);
        container.add(portLabel);
        container.add(ipTextField);
        container.add(portField);
        container.add(joinServerButton);
        container.add(resetButton);
    }
    public void addActionEvent() {
        joinServerButton.addActionListener(this);
        resetButton.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == joinServerButton) {
            String ipText;
            String portText;
            ipText = ipTextField.getText();
            portText = portField.getText();
            System.out.println(ipText + "\n" + portText);
        }
        //Coding Part of RESET button
        if (e.getSource() == resetButton) {
            ipTextField.setText("");
            portField.setText("");
        }
    }
}
