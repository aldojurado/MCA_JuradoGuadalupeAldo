/**
 *  Programa que muestra el uso de las clases
 *  Punto2D y OperacionesConPuntos2D
 *
 *  Actividad a realizar:
 *  1.- Pedir los datos en enorno gráfico
 *  2.- Probar los métodos de OperacionesConPuntos2D
 *
 *   @version 22/Sep/22
 */

package Funciones.Metricas1;
import javax.swing.JOptionPane;

public class UsaOperacionesConPuntos2D {

    public static void main(String... something){
        //pedir los datos
        int aX = Integer.parseInt(JOptionPane.showInputDialog("Introduce el valor de X en el punto a (x1)"));
        int aY = Integer.parseInt(JOptionPane.showInputDialog("Introduce el valor de Y en punto a (y1)"));
        int bX = Integer.parseInt(JOptionPane.showInputDialog("Introduce el valor de X en el punto b (x2)"));
        int bY = Integer.parseInt(JOptionPane.showInputDialog("Introduce el valor de Y en el punto b (y2)"));
        Punto2D a = new Punto2D(aX,aY);
        Punto2D b = new Punto2D(bX,bY);
        double norma = OperacionesConPuntos2D.norma(a);
        double metricaEuclidiana = OperacionesConPuntos2D.metricaEuclidiana(a,b);
        double metricaMht = OperacionesConPuntos2D.metricaTaxista(a,b);
        double product = OperacionesConPuntos2D.dotProduct(a,b);
        double areaRes = OperacionesConPuntos2D.area(a,b);
        double perimetro = metricaEuclidiana + metricaMht;
        //Norma
        System.out.println("\u001B[35mLa norma de \u001B[37m" + a + "\u001B[35m es : \u001B[37m" + norma);
        //Métrica euclidiana (hipotenusa)
        System.out.println("\n\u001B[35mLa distancia del punto \u001B[37m" + a +
                "\u001B[35m al punto \u001B[37m" + b + "\u001B[35m es \u001B[37m" + metricaEuclidiana);
        //Métrica del taxista (suma de catetos)
        System.out.println("\n\u001B[35mMétrica de Manhhattan de los puntos\u001B[37m" + a +
                "\u001B[35m y \u001B[37m" + b + "\u001B[35m = \u001B[37m" + metricaMht);
        //Dot Product
        System.out.println("\n\u001B[35mThe dot product of \u001B[37m" + a+ "\u001B[35m and \u001B[37m"
                + b + "\u001B[35m is \u001B[37m" + product);
        //Área
        System.out.println("\n\u001B[35mEl área inducida por los puntos \u001B[37m" + a +
                "\u001B[35m y \u001B[37m" + b + "\u001B[35m es \u001B[37m" + areaRes);
        //Perímetro
        System.out.println("\u001B[35m\nSu perímetro es \u001B[37m"+ perimetro);

    }
}
