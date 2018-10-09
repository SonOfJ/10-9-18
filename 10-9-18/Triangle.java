public class Triangle{
	private Point a;
	private Point b;
	private Point c;
	public Triangle(Point a, Point b, Point c) {
		this.a = a;
		this.b = b;
		this.c = c;
		}
	public String returnPoints() {
		return "(" + a.getX() + ", " + a.getY() + ") (" + b.getX() + ", " + b.getY() + ") (" + c.getX() + ", " + c.getY() + ")";
		}
	public double distance(Point a, Point b) {
		return Math.sqrt((a.getX() - b.getX()) * (a.getX() - b.getX()) + (a.getY() - b.getY()) * (a.getY() - b.getY()));
		}
	public double perimeter() {
		 return distance(a, b) + distance(b, c) + distance(c, a);
		 }
}