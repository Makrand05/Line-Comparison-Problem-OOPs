import java.util.Scanner;

public class LineComparison {
static int x1,y1,x2,y2;
    public static void main(String[] args) {

        getInput();
        calculatedLength();
    }

    private static void calculatedLength() {
        double x=Math.pow((x2-x1), 2);
        double y=Math.pow((y2-y1), 2);
        double length = Math.floor(Math.sqrt(x+y));
        System.out.println("Lenth of line : "+length);
    }


    private static void getInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Line Coordinate for first point");
        x1=sc.nextInt();
        y1=sc.nextInt();
        System.out.println("Enter Line Coordinate for Second point");
        x2=sc.nextInt();
        y2=sc.nextInt();

    }
}
