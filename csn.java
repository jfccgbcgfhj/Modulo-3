import java.util.Scanner;

public class csn {
	
	public static void main (String[] args) {  
		Scanner dados = new Scanner (System.in);
		int menu;
		do {
		System.out.print("..:Converter entre Sistemas Numéricos:..\n"
				+ "\n    (1) Binário para Decimal \n"
				+ "    (2) Octal para Decimal \n"
				+ "    (3) Hexadecimal para Decimal \n"
				+ "    (4) Decimal para Binário \n"
				+ "    (5) Decimal para Octal \n"
				+ "    (6) Decimal pra Hexadecimal \n"
				+ "    (0) Sair do programa\n "
				+ "\n Insira a opção que deseja: ");
		menu = dados.nextInt();
		switch (menu) {
			case 1:
					long num;
				System.out.print("\n Insira o nº Binário: ");
					num = dados.nextInt();
			    	int decimal = cbtd(num);
		        System.out.println("O nº Decimal correspondente é: " + decimal + "\n");
			break;
			case 2:
			break;
			case 3:
			break;
			case 4:
			break;
			case 5:
			break;
			case 6:
			break;
			case 0:
				System.out.print("Adeus! :(");
				System.exit(0);
			break;
			
		}
		} while (menu!=7);
    }

    public static int cbtd(long num) // Inicio função binario para decimal
    {
        int decimalNumber = 0, i = 0;
        long remainder;
        while (num != 0)
        {
            remainder = num % 10;
            num /= 10;
            decimalNumber += remainder * Math.pow(2, i);
            ++i;
        }
        return decimalNumber;
    } // Fim função binario para decimal
}
