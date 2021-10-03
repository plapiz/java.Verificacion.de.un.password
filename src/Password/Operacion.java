package Password;
import java.util.Scanner;
import java.io.IOException;

public class Operacion {                                                    //creacion de la clase
    String pass;
    char exa;
    int len, i;
    boolean desicion = false;                                               //el boolean es el encargado de que todos lo metodos sean exitosos
    Scanner pause = new Scanner(System.in);

    public void guardado(){                                                 //metodo donde se guarda el password
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el password: ");
        pass = sc.nextLine();
    }


    public void longitud(){                                                 //metodo donde se comprueba la longitud del password
        len = pass.length();
        if (len == 5){
            desicion = true;
        }
    }


    public void numero(){                                                   //metodo donde se comprueba que haya al menos un numero
        if (desicion == true){                                              //y que el primer caracter no sea un numero
            desicion = false;
            for (i=1;i<len;i++){
                if ("123456789".indexOf(pass.charAt(i))>=0){
                    desicion = true;
                }
            }
            if ("123456789".indexOf(pass.charAt(0))>=0){
                desicion = false;
            }
        }
    }


    public void mayuscula(){                                               //metodo donde se comprueba si el primer caracter es una mayuscula
        if (desicion == true){
            exa = Character.toUpperCase(pass.charAt(0));
            if(pass.charAt(0) != exa){
                desicion = false;
            }
        }
    }
}
