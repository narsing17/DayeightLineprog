package Line;
import java.util.Scanner;

public class LengthOfLine {
    public double length(int array[]) {
        int x1 = array[0];                   //x value of 1st coordinate
        int x2 = array[1];                   //x value of 2nd coordinate
        int y1 = array[2];                   //y value of 1st coordinate
        int y2 = array[3];                   //y value of 2nd coordinate
        return Math.sqrt(((x2 - x1) * (x2 - x1)) + ((y2 - y1) * (y2 - y1)));
    }

    //To get the coordinates from user
    public int[] coordinatescollection() {
        System.out.println("Enter the coordinates of Line:");
        Scanner value = new Scanner(System.in);
        int[] point = new int[4];
        for (int i = 0; i < 4; i++) {
            point[i] = value.nextInt();
        }
        return point;
    }

    public static void main(String[] args) {
        LengthOfLine L1= new LengthOfLine();
        int[] coordinates = new int[4];
        coordinates = L1.coordinatescollection();
        System.out.println("The length of line= " + L1.length(coordinates));
    }
}
