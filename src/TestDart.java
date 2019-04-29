import java.util.* ;

public class TestDart {
    public static void main(String[] args) {

        float x, y ;
        int points;
        Circle circle = new Circle();

        Scanner inp = new Scanner(System.in);
        System.out.println("Enter x and y");
        x = inp.nextFloat();
        y = inp.nextFloat();

        System.out.println("Value of x is  " + x + " Y is " + y);

        points = circle.calculatePoints(x,y);

        System.out.println("Earned points for this dart throw is " + points);

    }

}
