class listNode{
	private String data;
	public listNode link;
	
	public listNode() {
		this.data = null;
		this.link = null;
	}
	public listNode(String data) {
		this.data = data;
		this.link = null;
	}
	public listNode(String data, listNode link) {
		this.data=data;
		this.link=link;
	}
	public String getData() {
		return this.data;
	}
}


public class LinkedList {
	
	private listNode head;
	public LinkedList() {
		head = null;
	}
	
	public void insertNode(listNode prNode, String data) {
		listNode newNode = new listNode(data);
		listNode preNode;
		newNode.link = preNode.link;
		preNode.link = newNode;
	}
	
	public void insertNode(String data) {
		listNode newNode = new listNode(data);
		
		if(head==null) {
			this.head = newNode;
		}else {
			listNode tempNode = head;
			while(tempNode.link!=null) {
				tempNode = tempNode.link;
			}
			tempNode.link = newNode;
		}
	}
	public void deleteNode(String data) {
		listNode preNode = head;
		listNode tempNode = head.link;
		
		if(data.equals(preNode.getData())) {
			head = preNode.link;
			preNode.link = null;
		}
		else {
			while(tempNode!=null) {
				if(data.equals(tempNode.getData())) {
					if(tempNode.link == null) {
						preNode.link = null;
					}
					else {
						preNode.link = tempNode.link;
						tempNode.link = null;
					}
					break;
				}
				else {
					preNode = tempNode;
					tempNode = tempNode.link;
				}
			}
		}
	}
	public void deleteNode() {
		listNode preNode;
		listNode tempNode;
		if(head==null) {
			return;
		}
		
		if(head.link == null) {
			head = null;
		}
		else {
			preNode = head;
			tempNode = head.link;
			
			while(tempNode.link!=null) {
				preNode = tempNode;
				tempNode = tempNode.link;
			}
			preNode.link = null;
		}
	
	}
	
	public listNode searchNode(String data) {
		listNode tempNode = this.head;
		
		while(tempNode!=null) {
			if(data.equals(tempNode.getData())){
				return tempNode;
			}
			else {
				tempNode = tempNode.link;
			}
		}
		return tempNode;
	}
	
	public void reverseList() {
		listNode nextNode = head;
		listNode currentNode =null;
		listNode preNode = null;
		
		while(nextNode!=null) {
			preNode = currentNode;
			currentNode = nextNode;
			nextNode = nextNode.link;
			currentNode.link = preNode;
		}
		head= currentNode;
	}
	
	public void printList() {
		listNode tempNode = this.head;
		while(tempNode!=null) {
			System.out.println(tempNode.getData()+" ");
			tempNode = tempNode.link;
		}
		System.out.println();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList linkedlist = new LinkedList();
		String str = "asd";
		
		linkedlist.insertNode("a");
		
		linkedlist.deleteNode(linkedlist.searchNode(str).getData());
	}

}
