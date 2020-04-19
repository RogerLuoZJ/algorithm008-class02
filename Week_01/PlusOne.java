public class PlusOne {

    public int[] plusOne(int[] digits) {
        for ( int i = digits.length - 1 ; i >= 0 ; i--) {
            int temp = digits[i] + 1;
            if (temp < 10) {
                digits[i] = temp;
                break;
            } else {
                digits[i] = 0;
            }
        }
        if (digits[0] == 0) {
            int[] arr = new int[digits.length + 1];
            arr[0] = 1;
            for (int i = 0 ; i < digits.length; i++) {
                arr[i+1] = digits[i];
            }
            return arr;
        } else {
            return digits;
        }

    }
}
