package kodluyoruz.server;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class ServerScreen extends JPanel implements ActionListener, KeyListener {
    JLabel jLabel;
    Timer timer = new Timer(20, this);
    private int x = 80, y = 80;
    private String clientTitle = "regtangle";
    private final int maxWidthSize = 200;
    private final int maxHeightSize = 200;

    public ServerScreen() {
        JFrame jFrame = new JFrame();
        timer.start();
        addKeyListener(this);
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);
        jFrame.add(this);
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setSize(300,300);
        jFrame.setTitle(clientTitle);
    }

    public void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);
        graphics.drawRect(5,5, maxWidthSize, maxHeightSize);
        graphics.fillRect(x,y,50,50);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    public void down() {
        if (y+50 >= maxHeightSize +5);
        else y += 3;
    }

    public void up() {
        if (y-5 <= 0);
        else y -= 3;
    }

    public void left() {
        if (x-5 <= 0);
        else x -= 3;
    }

    public void right() {
        if (x+50 >= maxWidthSize +5);
        else x += 3;
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int code = e.getKeyCode();
        switch (code) {
            case KeyEvent.VK_UP: up();
            case KeyEvent.VK_DOWN: down();
            case KeyEvent.VK_LEFT: left();
            case KeyEvent.VK_RIGHT: right();
        }
        repaint();
//        MulticastPublisher multicastPublisher = new MulticastPublisher();
//        try {
//            multicastPublisher.multicast(Integer.toString(getX()) + "," + Integer.toString(getY()));
//        } catch (IOException ioException) {
//            ioException.printStackTrace();
//        }
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
    @Override
    public int getX() {
        return x;
    }

    @Override
    public int getY() {
        return y;
    }
}
