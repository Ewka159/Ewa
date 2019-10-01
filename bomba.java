package samouczek;

import java.util.Scanner;

public class bomba {
	public static void main(String[] args)
	{
	  Scanner odczyt = new Scanner(System.in);
	  int zegar;

	  System.out.println("Podaj czas bomby: ");
	  zegar = odczyt.nextInt();

	  //wersja z while
	  while(zegar>0){
		  System.out.println("Bomba wybuchnie za "+zegar);
		  zegar--;
	  }
	  System.out.println("BUM!");
}
}
/*import java.util.Scanner;

public class Odczyt{
  public static void main(String[] args){
	  Scanner odczyt = new Scanner(System.in);
	  int zegar;

	  System.out.println("Podaj czas bomby: ");
	  zegar = odczyt.nextInt();

	  //wersja z do...while
	  do{
		  System.out.println("Bomba wybuchnie za "+zegar);
		  zegar--;
	  }
	  while(zegar>0);
	  System.out.println("BUM!");
  }
}
import java.util.Scanner;

public class Odczyt{
  public static void main(String[] args){
	  Scanner odczyt = new Scanner(System.in);
	  int zegar;

	  System.out.println("Podaj czas bomby: ");

	  for(zegar=odczyt.nextInt(); zegar>0; zegar--)
		  System.out.println("Bomba wybuchnie za "+zegar);
	  System.out.println("BUM!");
  }
}*/
