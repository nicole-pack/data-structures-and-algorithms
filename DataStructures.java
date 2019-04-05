

public class DataStructures {
	
	public class DIYNode{
		DIYNode next = null;
		int key;
		String value;
		//Constructor for simple linked list
		public DIYNode(String v){
			this.key=0;
			this.value=value;
		}
		//Constructor for hash tables
		public DIYNode(int k, String v){
			this.key = k;
			this.value = v;
		}
		//Append to end of list
		public void appendToTail(int k, String v){
			Node end = new Node(k, v);
			Node n = this;
			while (n.next != null){
				n = n.next;
			}
			n.next = end;
		}
	}
	
	public class DIYLinkedList extends DIYNode{
		Node head = null;
		Node tail = null;
		//Constructor for empty list
		public DIYLinkedList(){
		}
		//Constructor to initialize list
		public DIYLinkedList(int key, String value){
			head = new Node(key, value);
			head.next = tail;
			tail = null;
		}
		//Adds node to beginning of list
		public void appendToHead(int key, String value){
			Node n = new Node(key, value);
			n.next = head;
			head = n;
		}
		//Adds node after specified 
	}
	
	public class DIYHashTable{
		private final int SIZE = 10;
		//Constructor
		public DIYHashTable(){
			DIYLinkedList[] hashTable = new DIYLinkedList()[SIZE];
		}
		//Adds element to hashtable
		public void add(int key, String value){
			
		}
		//Searches for and returns element
		public void retrieve(){
			
		}
		//Creates hash code
		private int hash(String val){
			int hashCode;
			hashCode = val%SIZE;
			return hashCode;
		}
	}
	
	public class DIYArrayList{
		int size = 1;
		int emptyIndices = 1;
		Object array[] = new Object[size];
		//Constructor
		public DIYArrayList(){
			this = array;
		}
		public DIYArrayList(Object init){
			this = array;
			array[0] = init;
		}
		public void add(Object elem){
			if(this.reachedCapacity()){
				int newSize = this.size * 2;
				Object newArray[] = new Object[newSize];
				array.
			}
		}
		public boolean reachedCapacity(){
			if(emptyIndices==0){
				return true;
			}
			return false;
		}
		
		
	}
	
	public class DIYStringBuilder{
		
		
		
		
		
	}
	
	public static void main(String args[]){
		
	}
}