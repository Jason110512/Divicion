import java.util.Scanner;
public class MainDivision{ 
    public static void main(String[] args){
        Scanner op = new Scanner(System.in);
        int y,x;

         System.out.println("ingresa un numero entero");

         x=op.nextInt();

         System.out.println("ingresa otro numero entero");

         y=op.nextInt();

         Division evaluar = new Division();
         evaluar.setX(x);
         evaluar.setY(y);
           System.out.println(evaluar.mostrarResultado());
           System.out.println();
}

}