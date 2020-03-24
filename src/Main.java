import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.print("Input a,b,c : ");
        float a = scn.nextFloat();
        float b = scn.nextFloat();
        float c = scn.nextFloat();
        QuadraticEquation quadraticEquation=new QuadraticEquation(a,b,c);
        if(quadraticEquation.getDiscriminant()<0){
            System.out.println("The equation has no real roots");
        }else if(quadraticEquation.getDiscriminant()==0){
            System.out.println("The equation has 1 roots : " +quadraticEquation.getRoot1());
        }else{
            System.out.println("The equation has two roots : " +quadraticEquation.getRoot1()
                    +" and " + quadraticEquation.getRoot2());
        }
    }
}
