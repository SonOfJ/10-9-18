public class demo{
  public static void main(String[]args){
    Point P1 = new Point(1,1);
    Point P2 = new Point(1,7);
    Point P3 = new Point(7,1);
    Triangle Bobby = new Triangle(P1, P2, P3);
    System.out.println(Bobby.returnPoints());
    System.out.println(Bobby.perimeter());
  }
}