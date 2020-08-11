public class NumberTwo {
    static void recursiveReverse(char[] arr, int i) {
        if (i < arr.length) {
            System.out.print(arr[arr.length - i - 1]);
            recursiveReverse(arr, i + 1);
        }
    }

    public static void main(String[] args) {
        char[] array = new char[] { 'h', 'e', 'l', 'l', 'o' };
        recursiveReverse(array, 0);
    }
}