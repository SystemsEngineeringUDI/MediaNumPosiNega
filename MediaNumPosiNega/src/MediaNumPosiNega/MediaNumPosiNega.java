/* 
@autor:
 * Cesar Villalobos
 * Estudiante: Ing.Sistemas UDI
*/

package ejemplo1;
import javax.swing.*;
public class MediaNumPosiNega {
    public static void main(String[] args) {
        int i,acup=0,acun=0,p=0,ne=0;
        int n[]=new int[10];//Vector de 10 posiciones
        for(i=0;i<10;i++){
            n[i]=Integer.parseInt(JOptionPane.showInputDialog("Digite un numero")); //Se llena el vector
        }
        for(i=0;i<10;i++){
            if (n[i]<0){ //Se recorre el vector comparando para saber si es negativo o positivo
                acun+=n[i];
                ne+=1;
            }
            if(n[i]>0){
                acup+=n[i];
                p+=1;
            }
        }
        acun/=ne; //Se saca el promedio de numeros tanto negativos como positivos
        acup/=p;
        JOptionPane.showMessageDialog(null, "La media de los numeros negativos es: "+acun+"\nLa media de los numeros positivos es: "+acup);//Se imprimen los promedios
        // TODO code application logic here
    }
    
}
