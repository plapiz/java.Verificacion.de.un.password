package Password;

public class Main {
    public static void main(String[] args) {                                                  //psvm shortcut

        Operacion op = new Operacion();                                                       //creacion del objeto
        while (op.desicion == false){
            op.guardado();                                                                    //llamada a los metodos
            op.longitud();
            op.numero();
            op.mayuscula();
            if (op.desicion == false){                                                        //if que muestra si hay error
                System.out.println("Error, intentarlo de nuevo.\n");
            }
        }
        System.out.println("Password guardado con exito");
        op.pause.nextLine();
    }
}
