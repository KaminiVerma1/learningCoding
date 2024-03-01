
import java.util.Scanner;

public class splitPr {
    public static void main(String[] args) {
        String sc = "kamini verma belongs from Gorakhpur";
        // String sc=   "geekss@for@geekss";
//        Scanner sct =new Scanner(System.in);
//        System.out.println("Give string");
//       String giveneString= sct.nextLine();
//        System.out.println("Give string" +sct );
//        System.out.println("enter desired string with space");
//        String arr[] = sc.split("\\s");
//        for (String s : arr) {
//            System.out.println("String is" + s);
//        }
//        System.out.println("\\n");
//
        String arr1[] = sc.split("\\s", 7);
        for (String s1 : arr1) {
            System.out.println("String is " + s1);
        }
//        System.out.println("\n");
//
//        String arr2[] = sc.split("\\s", 2);
//        for (String s2 : arr2) {
//            System.out.println("String is " + s2);
//        }
//        System.out.println("\n");
//        String s = "Javatpointtt";
//
//        String arr4[] = s.split("t", 7);
//        for (String s4 : arr4) {
//            System.out.println("String is " + s4);
//        }
    }
}
