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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode result;
        ListNode head;
        if(list1 == null) return list2;
        if(list2 == null) return list1;
        if(list1.val < list2.val){
            result=list1;
            head=list1;
            list1=list1.next;
            head.next=null;
            
        }
        else{
            result=list2;
            head=list2;
            list2=list2.next;
            head.next=null;
        }
        while(list1!=null && list2!=null){
            if(list1.val < list2.val){
                head.next=list1;
                head=list1;
                list1=list1.next;
            }
            else{
                head.next=list2;
                head=list2;
                list2=list2.next;
            }
        }
        while(list1!=null){
            head.next=list1;
            head=list1;
            list1=list1.next;
        }
        while(list2!=null){
            head.next=list2;
            head=list2;
            list2=list2.next;
        }
        head.next=null;
        return result;
        
        
    }
}