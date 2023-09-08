public class TestPane extends JPanel {

    private Generator left;
    private Generator right;

    public TestPane() {
        Point startPoint = new Point(200, 400);
        left = new Generator(startPoint, -90, -20);
        right = new Generator(startPoint, -90, 20);

        Timer timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                boolean shouldContinue = left.tick() && right.tick();
                if (!shouldContinue) {
                    ((Timer)(e.getSource())).stop();
                }
                repaint();
            }
        });
        timer.start();
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(400, 400);
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g.create();
        g2d.setColor(Color.RED);
        render(g2d, left.getPoints());
        g2d.setColor(Color.BLUE);
        render(g2d, right.getPoints());
        g2d.dispose();
    }

    protected void render(Graphics2D g2d, List<Point> points) {
        Point start = points.remove(0);
        while (points.size() > 0) {
            Point end = points.remove(0);
            g2d.draw(new Line2D.Double(start, end));
            start = end;
        }
    }
}