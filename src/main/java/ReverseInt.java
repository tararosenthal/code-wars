public class ReverseInt {
    public static int reverse(int x) {
        // while integer is not equal to zero
        // store last digit of integer
        // move one digit over (divide by 10)
        // check if answer would be greater than maxInt after adding stored digit
        // if so, return 0
        // put stored digit into reversed answer making sure to make room (multiply by 10)
        // return reversed value

        int rev = 0;

        while (x != 0) {
            int pop = x % 10;
            x /= 10;

            if (rev > Integer.MAX_VALUE / 10 || rev == Integer.MAX_VALUE / 10 && pop > 7) {
                return 0;
            }

            if (rev < Integer.MIN_VALUE / 10 || rev == Integer.MIN_VALUE / 10 && pop < -8) {
                return 0;
            }

            rev = rev * 10 + pop;
        }
        return rev;
    }
}
