package Line;

public class ComparisonExtends {
    public void compare() {
        int d1= 1;
        int d2= 2;
        if (d1==d2){
            System.out.println("The 2 lines are Equal");}
        else if (d1 > d2){
            System.out.println("1st line is greater than 2nd line");}
        else
            System.out.println("2nd line is greater than 1st line");
    }
    public static void main(String[] args) {
        ComparisonExtends Comp=new ComparisonExtends();
        Comp.compare();
    }
}
