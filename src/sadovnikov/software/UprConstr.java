package sadovnikov.software;

public class UprConstr
{
    public static void main(String[] args) {
        System.out.println(weather(Boolean.TRUE));

    }
    private static String weather(Boolean weatherGood){
        return ("Weather is " + (weatherGood? "good" : "bad"  ));
    }
}
