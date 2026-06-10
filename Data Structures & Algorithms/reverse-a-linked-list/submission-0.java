/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode atual = head;
        ListNode anterior = null;

        while(atual != null) {
            ListNode proximo = atual.next;
            atual.next = anterior;
            anterior = atual;
            atual = proximo;
        }

        return anterior;
    }
}
