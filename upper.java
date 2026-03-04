import java.util.*;

public class upper {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Input a String: ");
        String sen = s.nextLine();

        sen = sen.toUpperCase();

        System.out.println(sen);

        s.close();
    }
}