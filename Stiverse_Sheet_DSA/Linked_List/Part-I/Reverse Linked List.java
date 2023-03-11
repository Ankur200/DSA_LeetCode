class Solution{
  public ListNode(ListNode head){
    ListNode prev=null;
    ListNode curr=head;
    while(curr!=null){
    ListNode temp=curr.next;
    curr.next=prev;
    prev=curr;
    curr=temp;
    }
    }
}
