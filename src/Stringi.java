public class Stringi {
    public static void main(String[] args) {
        String name = "Mateusz";
        int dlugosc = name.length();

        char inicjal = name.charAt(0);
        System.out.println("Długośc: " + dlugosc +
                " inicjał: " + inicjal);

        String duzeName, male;

        duzeName = name.toUpperCase();
        male = name.toLowerCase();

        System.out.println(duzeName + " " + male);

    }
}
