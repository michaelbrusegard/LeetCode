class Solution {
    public String convertToBase7(int num) {
        if (num == 0) {
            return "0";
        }

        boolean isNegative = num < 0;

        if (isNegative) {
            num = -num;
        }
        
        String sum = "";
        while (num > 0) {
            int remainder = num % 7;
            num /= 7;
            sum = String.valueOf(remainder) + sum;
        }

        if (isNegative) {
            sum = "-" + sum;
        }

        return sum;
    }
}