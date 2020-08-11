class NumberThree {

    // Helper function for the stack implementation
    private static int top = 0;

    static void push_stack(char[] arr, char item) {
        top++;
        arr[top] = item;
    }

    static void pop_stack(char[] arr) {
        arr[top] = ' ';
        top--;
    }

    static boolean isEmpty() {
        return top == 0;
    }

    static boolean isMatch(char a, char b) {
        if (a == '{' && b == '}')
            return true;

        if (a == '(' && b == ')')
            return true;

        if (a == '[' && b == ']')
            return true;

        return false;
    }

    // The function to solve the problem
    static String balanceBrackets(char[] arr) {
        char[] stack = new char[arr.length + 1];

        for (int i = 0; i < arr.length; i++) {

            if (isEmpty()) {
                push_stack(stack, arr[i]);
            } else {
                if (isMatch(stack[top], arr[i])) {
                    pop_stack(stack);
                } else {
                    push_stack(stack, arr[i]);
                }
            }
        }

        if (isEmpty()) {
            top = 0;
            return "YES";
        } else {
            top = 0;
            return "NO";
        }
    }

    public static void main(String[] args) {
        char[] testcase1 = new char[] { '{', '[', '(', ')', ']', '}' };
        System.out.println(balanceBrackets(testcase1)); // YES

        char[] testcase2 = new char[] { '{', '[', '(', ']', ')', '}' };
        System.out.println(balanceBrackets(testcase2)); // NO

        char[] testcase3 = new char[] { '{', '(', '(', '[', ']', ')', '[', ']', ')', '[', ']', '}' };
        System.out.println(balanceBrackets(testcase3)); // YES

    }
}