//the logic is to use DFS, when the count ==k, and process the resverse ListNode
class solution{
	public ListNode reverseKGroup(ListNode Head, int K){
		ListNode curr = head;
		int count = 0;
		while(curr != null && count != k){
			curr = curr.next;
			count++;
		}
		//if need reverse
		if(count == k){
			//perform DFS
			curr = reverseKGroup(curr, k);
			//process reverse ListNode
			while(count-->0){
				//remember that C pointer, here the head, tmp, curr are all pointer, if you did not understand, plead
				//check c/c++ pointer
				//use a tmp node to save the head.next, then we can manipulate the head
				ListNode tmp = head.next;
				//after save head.next, head.next pointer to curr.next which is the last header,
				head.next = curr;
				//and after we pointer to curr, we can use the curr pointer point it to the head, so we free the head
				//and curr move forward a step
				curr = head;
				head = tmp;
			}
			head = curr;
		}
		return head;
	}
}