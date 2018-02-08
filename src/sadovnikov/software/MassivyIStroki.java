package sadovnikov.software;

public class MassivyIStroki {
    public static void main(String[] args) {
        /*System.out.println('A' + '1' + "2");
        System.out.println("A" + ('\t' + '\u0003'));
        System.out.println("A" + ('\t'));
        System.out.println("A" + ('\u0003'));
        System.out.println('\t' + '\u0003');*/

        String text = "qadam, I'm Adam!";
        StringBuilder sb = new StringBuilder(text.toLowerCase().replaceAll("[^a-zA-Z0-9]", ""));
        String sb1 = sb.toString();
        System.out.println(sb1);
        System.out.println(sb1);
        System.out.print(sb.toString().equals(sb.reverse().toString()));

    }
}
