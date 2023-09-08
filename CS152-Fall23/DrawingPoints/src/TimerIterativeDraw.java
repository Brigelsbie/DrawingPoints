import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class TimerIterativeDraw extends JFrame {

    private final static int W = 700, H = 500;
    private final static int DELAY= 1000;
    private final static int NUMBER_OF_DRAWS_LIMIT = 50;
    private int x2A = W/2, y2A = H/2, x1A, y1A, numberOfDraws;
    private Random random = new Random();
    private Color randomColor = Color.BLUE;
    private JPanel panel;
    private Timer timer;

    public TimerIterativeDraw() {

        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        panel = new MyPanel();
        add(panel, BorderLayout.CENTER);
        pack();
        setVisible(true);

        timer = new Timer(DELAY,new Task());
        timer.start();
    }

    public void upDateGui(){

        if(numberOfDraws++ >= NUMBER_OF_DRAWS_LIMIT){
            timer.stop();
        }
        x1A = x2A; y1A = y2A;
        x2A = random.nextInt(W);
        y2A = random.nextInt(H);
        randomColor = new Color(random.nextInt(0xFFFFFF));

        //for better implementation store all points in an array list
        //so they can be redrawn

        panel.repaint();
    }

    class MyPanel extends JPanel{

        public MyPanel() {
            setPreferredSize(new Dimension(W,H));
        }

        @Override
        public void paintComponent(Graphics g) {
            //super.paintComponent(g);  //requires storing all points calculated
            //so they can be redrawn. recommended
            g.setColor(randomColor);
            g.drawLine(x1A, y1A, x2A, y2A);
        }
    }

    class Task implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent arg0) {
            upDateGui();
        }
    }

    public static void main(String[] args) {

        new TimerIterativeDraw();
    }
}