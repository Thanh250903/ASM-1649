 package implementations;
public class Message {
    public String messageContent;
    public Message messageNext;

    public Message(){
    }

    public Message(String messageContent){
        this.messageContent = messageContent;
        this.messageNext = null;
    }

    // create new value
    public String getMessageContent(){
        return messageContent;
    }

    // set a new value function that mean add
//    public void setMessageContent(String messageContent){
//        this.messageContent = messageContent;
//    }
    // move a node if the value is null
    public Message getMessageNext(){
        return messageNext;
    }
    // set a move node function
    public void setMessageNext(Message messageNext){
        this.messageNext = messageNext;
    }
}
