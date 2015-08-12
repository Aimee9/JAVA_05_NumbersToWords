import java.io.Console;
import java.util.Arrays;
import java.util.List;
import static spark.Spark.*;
import java.util.Map;
import java.util.HashMap;
import spark.ModelAndView;

public class NumbersToWords {
    public static void main(String[] args) {}


    public static String finalWord(String number) {


        HashMap<String, String> ones = new HashMap<String, String>();

        ones.put("1","one");
        ones.put("2","two");
        ones.put("3","three");
        ones.put("4","four");
        ones.put("5","five");
        ones.put("6","six");
        ones.put("7","seven");
        ones.put("8","eight");
        ones.put("9","nine");

        //String numberAsString = Integer.toString(number);
        return ones.get(number);



    }
}
