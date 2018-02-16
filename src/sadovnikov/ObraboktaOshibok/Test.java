package sadovnikov.ObraboktaOshibok;

public class Test {
    public static void main(String[] args) {
        System.out.println(getCallerClassAndMethodName());
        anotherMethod();
    }

    private static void anotherMethod() {
        System.out.println(getCallerClassAndMethodName());
        anotherMethod1();
    }

    private static void anotherMethod1() {
        System.out.println(getCallerClassAndMethodName());
    }

    static String getCallerClassAndMethodName() {
        StackTraceElement[] arr = new Throwable().getStackTrace();
        if (arr.length >= 3) {
            StackTraceElement element = arr[2];
            String className = element.getClassName();
            String methodName = element.getMethodName();
            return className + "#" + methodName;
        }
        return null;
    }
}