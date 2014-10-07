import java.util.Scanner;

/**
 * Created by Admin on 06.10.14.
 */
public class Geometry {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double s=0;
        System.out.println("Введите количество углов в фигуре");
        int j = in.nextInt();
        Point [] k = new Point [j];
        System.out.println("Вводите координаты углов по порядку (соседние)");
        for (int i=0;i<j;i++){
            System.out.println("Введите координаты "+(i+1)+" угла");
            System.out.println("Введите координату x");
            double x=in.nextDouble();
            System.out.println("Введите координату y");
            double y=in.nextDouble();
            k[i] = new Point(x, y);
        }
        for (int i=0;i<j;i++){
            if (i==(j-1)){s=s+distance(k[i], k[0]);}
            else s=s+distance(k[i], k[i+1]);
        }
        System.out.println("Периметр равен: " +s);
    }
    public static double distance (Point p1, Point p2){
        return Math.sqrt((p1.x-p2.x)*(p1.x-p2.x))+Math.sqrt((p1.y-p2.y)*(p1.y-p2.y));

    }
}
