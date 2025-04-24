import java.util.Scanner;
public class hello{ 
  public static void main(String[] args){
    String hello, world; //só pode criar variável dentro do main
    Scanner saida = new Scanner(System.in);
hello = "hello ";
world = "world!";
System.out.println(hello+world);
saida.close();


  }
}