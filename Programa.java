import java.util.Scanner;

public class Programa {
	
	void iniciar(){
    System.out.println("Bienvenido al programa!!");
    System.out.println("A continuacion...");
		String or1, or2;
		
		or1=cargarString();
		or2=cargarString();
		menu(or1,or2);
	}
	
	//carga de teclado dos String
	String cargarString(){
    Scanner sc = new Scanner(System.in);
		//completar aquí
    System.out.println("Ingrese la primera  oracion");
    String a = sc.nextLine();
    return a;
  }
  String cargarString1(){
    Scanner sc = new Scanner(System.in);
    System.out.println("");
    System.out.println("Ingrese la segunda oracion");
    String b = sc.nextLine();
    return b;
  }

  //despliega menu
	void menu(String a, String b){
    int menu;
    do{
        Scanner sc=new Scanner(System.in);
		       System.out.println("");  
		       System.out.println("1. Imprimir ambas cadenas y su largo."); 
		       System.out.println("2. Comparar igualdad y quien es menor.");
		       System.out.println("3. Cambiar una cadena a todo mayúsculas y otra a minúsculas.");
		       System.out.println("4. Cargar nuevamente ambas cadenas de texto");
		       System.out.println("5. Exit");
		       System.out.println("");
		       System.out.println("Ingrese una opcion!");
		       menu = sc.nextInt(); 

           switch(menu)
           {
             case 1:
             System.out.println("");
		        System.out.println("La primera cadena es: " +a);
		        System.out.println("La segunda cadena es: " +b);
		        System.out.println("El largo de la cadena '" + a + "' es de " + a.length() + " caracteres");
		        System.out.println("El largo de la cadena '" + b + "' es de " + b.length() + " caracteres");
		        break;

            case 2:
		        if (a == b)
		        {
		          System.out.println("Las cadenas son iguales");

		        }else
		        {
		          System.out.println("");
		          System.out.println("Las cadenas no son iguales");
		          if (a.length() > b.length())
		          {
		            System.out.println("La cadena menor es '" + b + "'");
		          }else
		          {
		            System.out.println("La cadena menor es '" + a + "'");
		          }
		        }
		        break;

            case 3:
            System.out.println("");
		        System.out.println("1. Cambiar primera cadena a mayúsculas o minusculas."); 
		        System.out.println("2. Cambiar segunda cadena a mayúsculas o minusculas."); 
		        System.out.println("");
		        System.out.println("Ingrese una opcion");
		        int submenu = sc.nextInt();
		        switch(submenu)
		        {
		          case 1:
		          System.out.println("1. Pasar cadena a Minusculas");
		          System.out.println("2. Pasar cadena a Mayusculas");
		          System.out.println("");
		          System.out.println("Ingrese una opcion");
		          int submenu1 = sc.nextInt();
		          switch(submenu1)
		          {
		            case 1:
		            System.out.println(a.toLowerCase());
		            break;
		            case 2:
		            System.out.println(a.toUpperCase());
		            break;
		          }
		          break;
		          case 2:
		          System.out.println("1. Pasar cadena a  Minusculas");
		          System.out.println("2. Pasar cadena a  Mayusculas");
		          System.out.println("");
		          System.out.println("Ingrese una opcion");
		          int submenu2 = sc.nextInt();
		          switch(submenu2)
		          {
		            case 1:
		            System.out.println(b.toLowerCase());
		            break;
		            case 2:
		            System.out.println(b.toUpperCase());
		            break;
		          }
		          break;
		        }
            case 4:
            a = cargarString();
            b = cargarString1();
            break;

            case 5:
            System.out.println("Gracias por utilizar el programa, espero que te haya servido!");
            System.exit(0);
           }
           }while (menu !=5);
		  }
}

            

		


	