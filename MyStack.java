package implementations;
public class MyStack {
    private int size;
    private Message top;

    public MyStack() {
        this.top = null;
        size = 0;
    }
    public int size(){
        return size;
    }

    //check is empty or not
    public boolean isEmpty() {
        return this.top == null;
    }

    // insert message at the top of stack
    public void pushMessage(String Content) {
        Message newMess = new Message();
        newMess.messageContent = Content;
        newMess.messageNext = top;
        top = newMess;
        size++;
    }

    public void Display() {
        if (top == null) {
            System.out.println("Stack is empty, you can't display");
        } else {
            Message m1 = top;
            while (m1 != null) {
                System.out.println(m1.getMessageContent());
                m1 = m1.getMessageNext();
            }
        }
    }

    public String popMessage() {
        if (isEmpty()) {
            System.out.println("The stack is empty");
            System.out.println("Stack is empty, " + "you can't delete message is this stack");
            return null;
        } else {
            String popM = this.top.messageContent;
            top = top.messageNext;
            this.size--;
            return popM;
        }
    }
}










