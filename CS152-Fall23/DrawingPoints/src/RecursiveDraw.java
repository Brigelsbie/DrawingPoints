import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingWorker;



public class RecursiveDraw extends JFrame {

    private int x1A, y1A, x2A, y2A;
    private final int W = 700, H = 500;
    private Random random = new Random();
    private Color randomColor = Color.BLUE;
    private JPanel panel;

    public RecursiveDraw() {

        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        panel = new MyPanel();
        add(panel, BorderLayout.CENTER);
        pack();
        setVisible(true);
        new Task().run();
    }

    public void recursiveDraw(int x1A, int y1A, int depth){

        if(depth > 15) { return;}

        this.x1A = x1A; this.y1A = y1A;

        x2A = random.nextInt(W);
        y2A = random.nextInt(H);
        randomColor = new Color(random.nextInt(0xFFFFFF));
        panel.repaint();

        try {
            Thread.sleep(1000); //delay
        } catch (InterruptedException ex) { ex.printStackTrace();}

        recursiveDraw(x2A, y2A, ++depth );
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

    class Task extends SwingWorker<Void,Void> {

        @Override
        public Void doInBackground() {
            recursiveDraw(W/2, H/2, 0);
            return null;
        }
    }

    public static void main(String[] args) {

        new RecursiveDraw();
    }
}