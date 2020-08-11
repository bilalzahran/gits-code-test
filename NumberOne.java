class NumberOne {
    static int countOne(int[] arr) {
        int count = 0, total = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                count = 0;
            } else {
                count++;
                if (count > total) {
                    total = count;
                }
            }
        }
        return total;
    }

    public static void main(String[] args) {
        int[] array1 = new int[] { 1, 1, 0, 1, 1, 1 };
        System.out.println(countOne(array1));

        int[] array2 = new int[] { 1, 0, 0, 1, 0, 1, 1 };
        System.out.println(countOne(array2));
    }
}