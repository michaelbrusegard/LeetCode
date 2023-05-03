import java.math.BigInteger;

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        String num1 = "";
        while (l1 != null) {
            num1 += String.valueOf(l1.val);
            l1 = l1.next;
        }
        StringBuilder sb1 = new StringBuilder(num1);
        sb1.reverse();
        String reversedNum1 = sb1.toString();

        String num2 = "";
        while (l2 != null) {
            num2 += String.valueOf(l2.val);
            l2 = l2.next;
        }
        StringBuilder sb2 = new StringBuilder(num2);
        sb2.reverse();
        String reversedNum2 = sb2.toString();

        BigInteger sum = new BigInteger(reversedNum1).add(new BigInteger(reversedNum2));
        String sumStr = String.valueOf(sum);
        StringBuilder sb = new StringBuilder(sumStr);
        sb.reverse();
        String sumReversed = sb.toString();
        ListNode answer = null;
        ListNode current = null;
        for (int i = 0; i < sumReversed.length(); i++) {
            int digit = Character.getNumericValue(sumReversed.charAt(i));
            if (answer == null) {
                answer = new ListNode(digit);
                current = answer;
            } else {
                current.next = new ListNode(digit);
                current = current.next;
            }
        }
        return answer;
    }
}