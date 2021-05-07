
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//SADASDASDASDSADASD
/**
 *
 * @author Cesar
 */
public class Main {

    public static void main(String[] args) throws InterruptedException{
        
        Scanner entrada = new Scanner(System.in);
        
        int sumatoria, cantHilos;
        
        System.out.println("\nEscriba la sumatoria: ");
        sumatoria = entrada.nextInt();
        
        System.out.println("Escriba la cantidad de hilos: ");
        cantHilos = entrada.nextInt();
        entrada.close();
        
        int[] array = new int[sumatoria];
        
        for(int i=0; i<sumatoria; i++)
        {
            array[i]=i+1;
        }
        
        int numeros = array.length/cantHilos+1;
        
        //System.out.println("\nSegmentar de cuanto en cuanto: "+numeros);
        
        Hilo hilos[] = new Hilo[cantHilos];
        
        for(int i=0; i<cantHilos; i++)
        {   
            //System.out.println("Iteración: "+i);
            
            int inicio = i*numeros + 1;
            int fin = (i+1)*numeros;
            
            if(fin<=sumatoria)
            {
                //System.out.println("Inicio: "+inicio);
                //System.out.println("Fin: "+fin);
            
                if(fin%numeros==0)
                {
                    //System.out.println("Si");
                    hilos[i] = new Hilo(inicio, fin);
                    hilos[i].run();
                }
            }
            else
            {
                fin = sumatoria;
                
                //System.out.println("Inicio: "+inicio);
                //System.out.println("Fin: "+sumatoria);
            
                //System.out.println("Si");
                hilos[i] = new Hilo(inicio, sumatoria);
                hilos[i].run();
            }
            
            
        }
        
        System.out.println("Suma por hilos");
        for(int i=0;i<cantHilos;i++)
        {
            System.out.println("Hilo "+i+" : "+hilos[i].getSum());
        }
        
        int sumTotal=0;
        
        for(int i=0;i<cantHilos;i++)
        {
            sumTotal = sumTotal + (int)hilos[i].getSum();
        }
        
        System.out.println("La suma total es: "+sumTotal);
        
    }
}
