import java.text.SimpleDateFormat;
import java.util.Date;

public class BoxingUnboxing {
    public static void main(String[] args) {
        Integer x = 5; // boxes int to an Integer object
        x = x + 10;   // unboxes the Integer to a int
        System.out.println(x);

        StringBuffer sBuffer = new StringBuffer("test");
        sBuffer.append(" String Buffer");
        System.out.println(sBuffer);

        double[] myList = {1.9, 2.9, 3.4, 3.5};

        // Print all the array elements using foreach
        for (double element: myList) {
            System.out.println(element);

        }
        //date format
        Date dNow = new Date( );
        SimpleDateFormat ft = new SimpleDateFormat ("E yyyy.MM.dd 'at' hh:mm:ss a zzz");

        System.out.println("Current Date: " + ft.format(dNow));

    }
}
