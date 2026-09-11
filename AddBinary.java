public class AddBinary {
      public static String addBinary(String a, String b) {
      StringBuilder result = new StringBuilder();

        int i = a.length() - 1;
        int j = b.length() - 1;

        int carry = 0;

        while (i >= 0 || j >= 0 || carry > 0) {

            int sum = carry;

            // Take digit from a
            if (i >= 0) {
                sum += a.charAt(i) - '0';
                i--;
            }

            // Take digit from b
            if (j >= 0) {
                sum += b.charAt(j) - '0';
                j--;
            }

            // Binary digit
            result.append(sum % 2);

            // Carry
            carry = sum / 2;
        }

        // We calculated from right to left
        return result.reverse().toString();
}
  

    public static void main(String[] args) {

        String a = "1010";
        String b = "1011";

        System.out.println(addBinary(a, b));
    }
}