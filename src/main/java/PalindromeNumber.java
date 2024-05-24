public class PalindromeNumber {
    public static void main(String[] args) {
        int Number = 13031;
        System.out.println(isPalindrome(Number));

    }

    public static boolean isPalindrome(int originalNumber) {

        int tempResult = originalNumber;
        int reversedNumber = 0;

        if (originalNumber < 0) {
            return false;
        } else {
            while (tempResult > 0) {
                int remainder = tempResult % 10;
                reversedNumber = reversedNumber * 10 + remainder;
                tempResult = tempResult / 10;
            }
            return originalNumber == reversedNumber;
        }
    }
}