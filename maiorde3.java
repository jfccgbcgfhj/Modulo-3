package maiorde3;
import java.util.Scanner;
public class maiorde3 {
	static int maiorde3 (int X, int Y, int Z)
	{if (X<Y)
	X=Y;
	if (X<Z)
	X=Z;
	return X;}
	public static void main(String[] args) throws Exception
	{int X,Y,Z;
	Scanner LerS = new Scanner(System.in);
	System.out.print("Digite o primeiro valor");
	X = LerS.nextInt();
	System.out.print("Digite o segundo valor");
	Y= LerS.nextInt();
	System.out.print("DigiTe o terceiro valor");
	Z= LerS.nextInt();
	System.out.println("Maior="+maiorde3(X,Y,Z));			
	}

}
