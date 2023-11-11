
package examen1p1_alejandrareyes;
import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author aleja
 */
public class Examen1P1_AlejandraReyes {
    static Scanner leer = new Scanner (System.in);
    static Random ran = new Random();//inicia random
    public static void main(String[] args) {
        
        System.out.println(" * * * * * M E N U * * * * *");
        System.out.println("1. Fight or Flight");
        System.out.println("2. Tri-fuerza");
        System.out.println("3. Salir del programa");
        System.out.print("Ingrese una opcion: ");
        int opcion = leer.nextInt();
        
        while (opcion>0 && opcion<3){//valida que la opcion sea mayor a 0 y menor a 3
            switch (opcion){
                case 1: 
                    System.out.println();
                    System.out.println("Ingrese maestria: ");
                    System.out.println("1. Principiante (0% de hit extra + extra damage)");
                    System.out.println("2. Intermedio (5% de hit extra + extra damage)");
                    System.out.println("3. Experto (15% de hit extra + extra damage)");
                    int mast = leer.nextInt();
                    
                    // los comentarios del fight or flight aplican para todos los casos
                    if (mast>0 && mast<4){//valida que el numero de maestria sea valido
                      switch (mast){
                            case 1: 
                                int num = ran.nextInt(16) +15;//numero aleatorio de 15 a 30
                                int diszom=num;
                                int balas=25;
                                int vidzom = 25;
                                char resp ='s';

                                while (resp=='s' || resp=='S'){

                                    System.out.println();
                                    System.out.println("El zombie se encuentra a: " + diszom + " metros!");
                                    System.out.println("El jugador cuenta con: " + balas + " balas");
                                    System.out.println();
                                    System.out.println();
                                    int dano = ran.nextInt(7)+1 ;//da un numero aleatorio entre 1 y 7 y lo guarda en dano
                                    int prob = ran.nextInt(100) + 1;// da un numero aleatorio entre 100 y 1 y lo guarda en prob

                                    if (prob<=65){
                                        System.out.println("Hit! El tiro ha reducido el HP del zombie por un total de " + dano);
                                        vidzom=vidzom-dano;//se reduce la vida del zombie con el numero de dano
                                        if (vidzom<0){//si la vida de el zombi es negativa se le asigna 0
                                                vidzom=0;
                                        }
                                        System.out.println("Vida restante del zombie: "+ vidzom);
                                        System.out.println();
                                        System.out.println("El zombie se encuentra a: " + diszom + " metros");
                                        if (vidzom==0){//la vida del zombie llego a 0, se gana el juego
                                                System.out.println("YOU WIN, has logrado vencer al zombie ");
                                                break;// evita que se imprima la opcion de listo para otra ronda
                                        }
                                    }
                                     else{
                                        int dist = ran.nextInt(3)+3;
                                        diszom=diszom-dist;
                                        if (diszom<0){//si la distancia de el zombi es negativa se le asigna 0
                                            diszom=0;
                                        }
                                        System.out.println("Has fallado! El zombie se encuentra a: " + diszom + " metros");

                                        if (diszom==0){
                                            System.out.println("GAME OVER, la distancia se redujo a 0");
                                            break;// evita que se imprima la opcion de listo para otra ronda
                                        }
                                    }


                                    System.out.println("");
                                    balas = balas - 1; // quita el numero de balas del jugador
                                    if (balas==0){
                                        System.out.println("GAME OVER! Te has quedado sin balas");
                                        break;// evita que se imprima la opcion de listo para otra ronda
                                    }


                                    System.out.print("Listo para la otra ronda? [S/N]: ");
                                    resp =leer.next().charAt(0);

                                }
                           break;


                            case 2:
                                 num = ran.nextInt(16) +15;
                                 diszom=num;
                                 balas=25;
                                 vidzom = 25;
                                 resp ='s';

                                while (resp=='s' || resp=='S'){
                                    System.out.println(resp);

                                    System.out.println();
                                    System.out.println("El zombie se encuentra a: " + diszom + " metros!");
                                    System.out.println("El jugador cuenta con: " + balas + " balas");
                                    System.out.println();
                                    System.out.println();
                                    int dano = ran.nextInt(7)+1 ;
                                    int prob = ran.nextInt(100) + 1;

                                    if (prob<=70){
                                        System.out.println("Hit! El tiro ha reducido el HP del zombie por un total de " + dano);
                                        vidzom=vidzom-dano;
                                        if (vidzom<0){
                                                vidzom=0;
                                        }
                                        System.out.println("Vida restante del zombie: "+ vidzom);
                                        System.out.println();
                                        System.out.println("El zombie se encuentra a: " + diszom + " metros");
                                        if (vidzom==0){
                                                System.out.println("YOU WIN, has logrado vencer al zombie ");
                                                break;
                                        }
                                    }
                                    else{
                                        int dist = ran.nextInt(3)+3;
                                        diszom=diszom-dist;
                                        if (diszom<0){
                                            diszom=0;
                                        }
                                        System.out.println("Has fallado! El zombie se encuentra a: " + diszom + " metros");

                                        if (diszom==0){
                                            System.out.println("GAME OVER, la distancia se redujo a 0");
                                            break;
                                        }
                                    }

                                    leer.nextLine();
                                    System.out.println("");
                                    balas = balas - 1;
                                    if (balas==0){
                                        System.out.println("GAME OVER! Te has quedado sin balas");
                                        break;
                                    }


                                    System.out.print("Listo para la otra ronda? [S/N]: ");
                                    resp =leer.next().charAt(0);
                                    System.out.println(resp);
                                }

                                break;

                            case 3:
                                num = ran.nextInt(16) +15;
                                diszom=num;
                                balas=25;
                                vidzom = 25;
                                resp ='s';

                                while (resp=='s' || resp=='S'){

                                    System.out.println();
                                    System.out.println("El zombie se encuentra a: " + diszom + " metros!");
                                    System.out.println("El jugador cuenta con: " + balas + " balas");
                                    System.out.println();
                                    System.out.println();
                                    int dano = ran.nextInt(7)+1 ;
                                    int prob = ran.nextInt(100) + 1;

                                    if (prob<=80){
                                        System.out.println("Hit! El tiro ha reducido el HP del zombie por un total de " + dano);
                                        vidzom=vidzom-dano;
                                        if (vidzom<0){
                                                vidzom=0;
                                        }
                                        System.out.println("Vida restante del zombie: "+ vidzom);
                                        System.out.println();
                                        System.out.println("El zombie se encuentra a: " + diszom + " metros");
                                        if (vidzom==0){
                                                System.out.println("YOU WIN, has logrado vencer al zombie ");
                                                break;
                                        }
                                    }
                                    else{
                                        int dist = ran.nextInt(3)+3;
                                        diszom=diszom-dist;
                                        if (diszom<0){
                                            diszom=0;
                                        }
                                        System.out.println("Has fallado! El zombie se encuentra a: " + diszom + " metros");

                                        if (diszom==0){
                                            System.out.println("GAME OVER, la distancia se redujo a 0");
                                            break;
                                        }
                                    }


                                    System.out.println("");
                                    balas = balas - 1;
                                    if (balas==0){//valida que cuando el jugador se quede sin balas para tirar el 
                                        System.out.println("GAME OVER! Te has quedado sin balas");
                                        break;
                                    }


                                    System.out.print("Listo para la otra ronda? [S/N]: ");
                                    resp =leer.next().charAt(0);

                                }
                       }
                    }
                            
                break; 
                            
                    
                    
                          
                    
             case 2: 
                    trifuerza();// llama a el metodo de la trifuerza
                    
                    break;
            }
            System.out.println();
            System.out.println(" * * * * * M E N U * * * * *");
            System.out.println("1. Fight or Flight");
            System.out.println("2. Tri-fuerza");
            System.out.println("3. Salir del programa");
            System.out.print("Ingrese una opcion: ");
            opcion = leer.nextInt(); 
    
       
        }
 
}
     public static void trifuerza(){
        System.out.println("Trifuerza");
         System.out.println();
         System.out.println("Ingrese un tamaño: ");
         int tam=leer.nextInt();
         
         while (tam<20 && (tam/2)%2==0){//ciclo que se va a repetir hasta que el usuario ingrese un numero valido
             System.out.println("El tamano debe ser par, mayor que 20 y que su mitad sea impar.");
             System.out.println("Ingrese su tamano nuevamente: ");
             tam=leer.nextInt();
         }//fin while
         for (int i=1;i<=(tam/2);i++){//imprime las filas para la piramide
             for (int j=1; j<=tam;j++){//imprime las columnas de la piramide
                 if ((j<=((tam/2)+1)-i) || j>=((tam/2)+1)+i || i==j || i+j==tam+2 || ((j==tam/2+1) && i==tam/2) || (i==((tam/2)/2) +2) && j==(tam/2)/2){/* todas lavalidaciones que incluyen los espacios 
                     en blanco a la izquierda de la piramide, las diagonales y el espacio en blanco en la ultima fila*/
                  System.out.print(" ");
              }
                 else{
                 System.out.print("*");
                 }
                
                 
             }
             System.out.println();
             
         }
        
    }
}

   

