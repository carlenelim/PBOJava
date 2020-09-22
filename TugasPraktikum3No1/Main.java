package TugasPraktikum3No1;
import java.util.Scanner; 

public class Main {
    public static void main(String[] args) {
        float w, l;
        Scanner scan = new Scanner(System.in);

        System.out.println("Input Width: ");
        w = scan.nextFloat();

        System.out.println("Input Length: ");
        l = scan.nextFloat();
        
        scan.close();
        
        Rectangle r = new Rectangle(w, l);
        r.countPerimeter();
        r.countArea();
        
        System.out.println("Area : " + r.area);
        System.out.println("Perimeter : " + r.perimeter);
        System.out.println(r.toString());
    }   

}

