package sadovnikov.ObraboktaOshibok;

public class TryCatch {
    public static void main(String[] args) {
        String s = method();
        System.out.println(s);
    }

    private static String method() {
        try {
            System.exit(0);
        } catch (Exception e){
            System.out.println("ex");
        } finally {
            System.out.println("final");
        }
        return "finish";
    }
}
