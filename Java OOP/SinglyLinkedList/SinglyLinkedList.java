public class SinglyLinkedList {
    public Node head;
    public SinglyLinkedList() {
        this.head = null;
        // your code here
    }
    // SLL methods go here. As a starter, we will show you how to add a node to the list.
    public boolean isEmpty(){
        return this.head ==null;
    }
    public Integer remove(){
        int valToReturn;
        Node runner = head;

        if(isEmpty()){
            return null;
        }

        if(head.next ==null){
            valToReturn = head.value;
            head = null;
            return valToReturn;
        }
        while(runner.next.next != null) {
            runner = runner.next;
            }
        valToReturn = runner.next.value;
        runner.next = null;
        return valToReturn;
            
    }
    public Integer displayValues(){
        if(isEmpty()){
               System.out.println("List is empty");
                return null;
            
        }
        Node runner = this.head;
        while(runner.next !=null){
            System.out.println("The node value is : " + runner.value + " Next value is : " + runner.next.value );
            runner = runner.next;
        }
        System.out.println("The current value is  : " + runner.value);
        return null;

    }

    public void add(int value) {
        Node newNode = new Node(value);
        if(head == null) {
            head = newNode;
        } else {
            Node runner = head;
            while(runner.next != null) {
                runner = runner.next;
            }
            runner.next = newNode;
        }
    }    
}
