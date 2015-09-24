/*
 * idea : 1. copy next value then delete next node. 
*/

public class Solution {
    public void deleteNode(ListNode node) {
        
        node.val= node.next.val;
        node.next= node.next.next; 
    }
}