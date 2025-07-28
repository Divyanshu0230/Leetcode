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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null || k==0){
            return head;
        }
        int count=1;
        ListNode curr1=head;
        while(curr1.next!=null){
            curr1=curr1.next;
            count++;

        }
        k=k%count;
        if(k==0){
            return head;
        }
        ListNode curr2=head;
        for(int i=1;i<count-k;i++){
            curr2=curr2.next;
        }
        ListNode curr3=curr2.next;
        curr2.next=null;
        curr1.next=head;
        return curr3;
    }
}