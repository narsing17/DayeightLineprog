package Line;

public class ExtendsLegnthOfLine {
    public double distance1() {
        LengthOfLine L1 = new LengthOfLine();
        int[] coordinate1 = new int[4];
        coordinate1 = L1.coordinatescollection();
        double distance1 = L1.length(coordinate1);
        return distance1;
    }

    public double distance2() {
        LengthOfLine L2 = new LengthOfLine();
        int[] coordinate2 = new int[4];
        coordinate2 = L2.coordinatescollection();
        double distance2 = L2.length(coordinate2);
        return distance2;
    }

    public String equality() {
        if (distance1() == distance2())
            return "Equal";
        else
            return "Not Equal";
    }

    public static void main(String[] args) {
        ExtendsLegnthOfLine Line = new ExtendsLegnthOfLine();
        System.out.println("The two lines are " + Line.equality());
    }
}
