

public class Base10Convert {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage: java Base10Convert <number> <base>");
            System.exit(1);
        }

        Integer number = Integer.parseInt(args[0]);
        int base = Integer.parseInt(args[1]);

        System.out.println("Binary: " + Integer.toBinaryString(number));
        System.out.println("Octal: " + Integer.toOctalString(number));
        System.out.println("Hexadecimal: " + Integer.toHexString(number));

        System.out.println("To base 2: " + convertToBase2(number, base));
    }

    public static String convertToBase2(int number, int base) {
        StringBuilder result = new StringBuilder();
        do {
            int remainder = number % base;
            result.append(remainder);
            number = number / base;
        } while (number > 0);
        return result.reverse().toString();
    }
}
