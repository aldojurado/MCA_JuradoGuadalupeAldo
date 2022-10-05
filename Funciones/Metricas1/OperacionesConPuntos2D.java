/**
 *  Programa que permitirá realizar
 *  operaciones con puntos en la forma P = (x,y)
 *
 *  NOTA: DEBEN IMPLEMENTAR LOS MÉTODOS
 *
 *  Curso: Matemáticas para ciencias Aplicadas
 *
 *  Temas:  Función distancia, producto punto y
 *          su aplicación para obtener el área
 *
 *  @author Roberto Méndez Méndez
 *  @version  22-Septiembre-22
 */


package Funciones.Metricas1;

public class OperacionesConPuntos2D {


    public static double norma(Punto2D p) {
        double norma = metricaEuclidiana(new Punto2D(), p);
        return norma;


    }


    public static double metricaEuclidiana(Punto2D a, Punto2D b) {
        double metrica =
                Math.sqrt(Math.pow(a.getX() - b.getX(), 2) +
                        Math.pow(a.getY() - b.getY(), 2)); //raíz de la suma de los catetos al cuaddrado (hip)
        return metrica;
    }

    public static double metricaTaxista(Punto2D a, Punto2D b) {
        double metricaMht =
                Math.abs(a.getX() - b.getX()) + Math.abs(a.getY() - b.getY()); //suma de los catetos
        return metricaMht;
    }


    public static double dotProduct(Punto2D a, Punto2D b) {
        double productoPuntos = a.getX()*b.getX() + a.getY()*b.getY(); //x1*x2 + y1*y2
        return productoPuntos;
    }


    public static double area(Punto2D a, Punto2D b) {
        double areaP2D = (Math.abs(a.getX() - b.getX())*Math.abs(a.getY() - b.getY()))/2; //área del triángulo rectangulo formado por las dos métricas
        return areaP2D;
    }

}
