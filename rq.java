package rq;
import java.util.Scanner;
public class rq {
static void raizqua (int Linf , int Lsup)
{
    Scanner dados = new Scanner(System.in);
    System.out.println("Qual o limite superior?");
    Lsup = dados.nextInt();
    System.out.println("Qual o limite inferior?");
    Linf = dados.nextInt();  
    for(int I=Linf ; I<Lsup ; I++)
        System.out.println(String.format("%5.1f",Math.sqrt(I)));
}
    public static void main(String[] args) {
        {raizqua(0,0);
        }
    }
    
}

