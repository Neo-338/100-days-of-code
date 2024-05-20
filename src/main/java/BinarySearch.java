public class BinarySearch {
    
    public static void main(String[] args) {

        int guessNumber = 666;
        int[] list = new int[987654];
        for (int i = 0; i < list.length; i++) {
            list[i] = i;
        }
        int result = binarySearch(guessNumber, list);
        System.out.println
                ("Result: " + (result == -1 ? "Element not found" : "Found: " + result));
    }

    public static int binarySearch(int itemToFind, int[] searchList) {

        int lowest = 0, middle = 0, highest = searchList.length - 1;
        int currentGuess = 0;
        while (lowest <= highest) {
            middle = (lowest + highest) / 2;
            currentGuess = searchList[middle];
            if (itemToFind == currentGuess) {
                return middle;
            } else if (itemToFind < currentGuess) {
                highest = middle - 1;
            } else {
                lowest = middle + 1;
            }
        }
        return -1;
    }
}
