package LeecodeEasyQ;

/**
 * Created by yifanfan on 6/08/15.
 */
public class DeleteNode {
    public void deleteNode(ListNode node) {
        node.val=node.next.val;
        node.next=node.next.next;

    }

    public ListNode removeElements(ListNode head, int val) {
         if(head==null){
             return null;
         }
         if(head.val==val){
             if(head.next==null){
                 head=null;
                 
             }else{
                 head.val=head.next.val;
                 head.next=head.next.next;
                 removeElements(head,val);
             }

         }else{
             removeElements(head.next,val);
         }

         return head;
    }
}
