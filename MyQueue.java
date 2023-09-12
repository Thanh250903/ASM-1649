package implementations;

public class MyQueue {

    private String messageContent;
    private Message front,rear;
    private int size;
    public MyQueue(String mes){
        this.messageContent = mes;
        size = 0;
    }
    public MyQueue(){

    }
    // check queue is empty
    public boolean isEmpty(){
        return front == null && rear == null;
    }

    // check size
    public int size(){
        return size;
    }
    // insert the message
    public void enQueue(String Message){
        Message newMess = new Message(Message);
        if (this.rear == null) {
            this.front = this.rear = newMess;
            return;
        }
        this.rear.setMessageNext(newMess);
        this.rear = newMess;
        size++;

    }
    // delete at the front of message
    public String deQueue(){
        if (front == null) {
            return null;
        }
        Message M1 = front;
        front = front.getMessageNext();
        if(front == null) {
            rear = null;
        }
        size--;
        return M1.getMessageContent();
    }
    public void Display() {
        if (isEmpty()) {
            System.out.print("Queue is empty, you can't display\n");
            return;
        }
        Message m1 = front;
        int i = 1;
        while (m1 != rear.getMessageNext()) {
            System.out.println(i + ". " + m1.getMessageContent());
            m1 = m1.getMessageNext();
            i++;
        }
        System.out.println("\n");
    }
}
