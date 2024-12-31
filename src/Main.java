public class Main {
    public static void main(String[] args) {
        ExceptionGenerator generator = new ExceptionGenerator();

        try {
            generator.generateNullPointerException();
        } catch (NullPointerException e) {
            System.out.println("An exception occurred: " + e);
            e.printStackTrace();
            System.out.println("Exception details: " + e.toString());
        }
    }
}