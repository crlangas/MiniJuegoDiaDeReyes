package minijuegodiadereyes;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * ¡Feliz mañana de Reyes! Nada más despertar, vas al salón y encuentras 10
 * regalos. ¿Te habrás portado bien, o los Reyes Magos habrán premiado tu penoso
 * comportamiento con carbón? Escribe un programa que vaya realizando la
 * apertura de los 10 regalos. Cada vez que se abre un nuevo regalo se calculará
 * un número aleatorio que permita determinar si el regalo es algo bonito o es
 * carbón (se deja a elección del programador las posibilidades de cada opción).
 *
 * Ejemplo de salida: "Se abre el regalo 1... ¡es carbón! :( Se abre el regalo
 * 2... ¡es carbón! :( Se abre el regalo 3... ¡es un bonito detalle! [...] Se
 * abre el regalo 10... ¡es un bonito detalle!".
 *
 * BONUS: al final añade contador para que al final del programa se diga cuántos
 * de los 10 regalos eran algo bonito, y cuántos carbón.
 *
 * @author Carlos
 */
public class MiniJuegoDiaDeReyes {

    public static void main(String[] args) {
        // Variables
        Scanner reader = new Scanner(System.in);
        int randoNumber = 0;
        String regalo = "";
        try {
            while (true) { //bucle para que el programe nunca acabe amenos que quiera el usuario
                randoNumber = (int) Math.floor(Math.random() * 10 + 1);
                System.out.println(randoNumber);
                System.out.println("Escribe cualquiercosa y pulsa intro para saber que regalo te toca o para salir introduce \"salgo\"");
                //Esto es simplemente para que se salga con un 0:
                String salgo = reader.next();
                salgo = salgo.toLowerCase();
                if (salgo.equals("salgo")) {
                    System.out.println("Adios y felices reyes :)");
                    break;
                }
                System.out.println("--------------------------------");
                System.out.print("Y tu regalo es: ");
                //swich para todos los casos del número random generado anteriormente
                //5
                switch (randoNumber) {
                    case 1:
                        System.out.println(" te has portado muy bien este año pero los reyes han sido un poco basicos te a tocado un pijama con unos calcetines");
                        break;
                    case 2:
                        System.out.println("este año has sido un pillo solo tienes carbon :(");
                        break;
                    case 3:
                        System.out.println(" este año has sido un fenomeno los reyes te han traido la play 5");
                        break;
                    case 4:
                        System.out.println(" este año te portaste medio bien entonces los reyes te traen un solo hot weels sigue mejorando ");
                        break;
                    case 5:
                        System.out.println(" este año los reyes te han traido un terreneitor con 2 turbo motores flipas");
                        break;
                    case 6:
                        System.out.println("  este año los reyes te han traido una bici, buen regalo");
                        break;
                    case 7:
                        System.out.println("  este año los reyes te han traido un tractor de jugete como mola!");
                        break;
                    case 8:
                        System.out.println("  este año los reyes te han traido una cuna con un nenuco");
                        break;
                    case 9:
                        System.out.println("  este año los reyes te han traido un radio casete, no molaria tanto como  un terreneitor con 2 turbo motores pero esta guapo ");
                        break;
                    case 10:
                        System.out.println("este año has sido un pillo solo tienes carbon :(");
                        break;
                    default:
                        throw new AssertionError();
                }
            }
        } catch (AssertionError e) {
            System.out.println("Error el la generacion del regalo :( (los reyes se han perdido por el camino este año)");
        } catch (InputMismatchException e) {
            System.out.println("ERROR!! Introduciste algo que no sea false o un intro... Lee atentamente las intrucciones...");
        } catch (Exception e) {
            System.out.println(e);
        }
        
        

    }

}
