// YuShu

public Node reverseLinkList( Node head){
    if( head ==null || head.next==null ){
        return;
    }

    Node pre= null;
    Node current= head; 
    while( current !=null ){
        Node next= current.next; 
        current.next=pre;
        pre= current; 
        current= next;
    }
    return pre;
} 

/* 
check at least 2 nodes
setup pre and current nodes
use next node to keep the safe place 
when we moving nodes to next place. 
*/

public void reverseLinkList( Node head){
	if( head ==null || head.next==null ){
		return;
	}

	Node pre= null;
	Node current= head; 
	while( current !=null ){
		Node next= current.next; 
		current.next=pre;
		pre= current; 
		current= next;
	}
	head= pre;
}	

//  http://www.programmerinterview.com/index.php/data-structures/reverse-a-linked-list/
 
public void reverseLinkList(Node current){
	
	// for empty list
	if(current ==null){ return; }

	// stop case
	if(current.next == null ){
		Node head= current;
		return;
	}
	reverseLinkList(current.next);
	current.next.next= current; 
	current.next=null;
}

