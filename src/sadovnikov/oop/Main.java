package sadovnikov.oop;

public class Main {
    public static void main(String[] args) {
        byte[] massiv = {97,104,113,115,116,117,118,119};
        AsciiCharSequence asciiCharSequence = new AsciiCharSequence(massiv);
        System.out.println(asciiCharSequence.length());
        System.out.println(asciiCharSequence.charAt(0));
        System.out.println(asciiCharSequence.subSequence(0,3));
        System.out.println(asciiCharSequence);

        System.out.println(asciiCharSequence.toString());//Hello!
        massiv[0] = 74;
        System.out.println(asciiCharSequence.toString());//Hello!
        int a = 1;
        int b = a;
        a = 2;
        System.out.println(b);
    }
}
