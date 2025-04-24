import java.util.Scanner;
public class hello{ 
  public static void main(String[] args){
    String h,w; //só pode criar variável dentro do main
    Scanner saida = new Scanner(System.in);
    System.out.println("Escreva seu nome aqui: ");
 String nome = saida.next();
 h="Hello ";
 w="World!";
System.out.println(h+w);
System.out.println("E um oi pra voce, "+ nome+"!");
saida.close();


  }
}