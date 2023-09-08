public class Generator  {

    private List<Point> points;
    private double angle;
    private double delta;
    private int depth = 9;

    private Timer timer;

    public Generator(Point startPoint, double startAngle, double delta) {
        points = new ArrayList<>(25);
        points.add(startPoint);
        angle = startAngle;
        this.delta = delta;
    }

    public List<Point> getPoints() {
        return new ArrayList<Point>(points);
    }

    public boolean tick() {
        Point next = updateTree(points.get(points.size() - 1), angle);
        angle += delta;
        depth--;
        if (next != null) {
            points.add(next);
        }
        return next != null;
    }

    public Point updateTree(Point p, double angle) {

        if (depth == 6) {
            return null;
        }

        System.out.println("depth = " + depth + "; angle = " + angle);

        //embedded portion '(Math.toRadians(angle) * depth * 10.0)'represents angle...
        int x2 = p.x + (int) (Math.cos(Math.toRadians(angle)) * depth * 10.0);  //vertical shift calculated using the Sine...PARSED to int because method drawLine() accepts only ints as params
        int y2 = p.y + (int) (Math.sin(Math.toRadians(angle)) * depth * 10.0);  //hor. shift calculated using the Cos..PARSED to int

        return new Point(x2, y2);
    }

}