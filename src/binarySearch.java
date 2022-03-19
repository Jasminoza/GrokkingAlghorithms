public class binarySearch {
    public static void main(String[] args) {
        int[] sortedArray = {1, 3, 5, 7, 9};
        int target = 3;
        System.out.println(findInt(sortedArray, target));
        target = -1;
        System.out.println(findInt(sortedArray, target));
    }


    public static int findInt(int[] sortedArray, int target) {
        int low = 0;
        int high = sortedArray.length - 1;
        int mid, guess;
        int counts = 0;
        while (low <= high) {
            mid = (low + high) / 2;
            guess = sortedArray[mid];

            if (guess == target) {
                counts++;
                System.out.println("Вы угадали за " + counts + " попыток!");
                return mid;
            }

            if (guess > target) {
                high = mid - 1;
                System.out.println("Указанное число меньше загаданного");
                counts++;
            } else {
                low = mid + 1;
                System.out.println("Указанное число больше загаданного");
                counts++;
            }
        }
        System.out.print("Число отсутствует в массиве, ошибка ");
        return -999;
    }
}
