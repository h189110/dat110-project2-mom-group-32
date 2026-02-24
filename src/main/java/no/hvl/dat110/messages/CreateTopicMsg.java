package no.hvl.dat110.messages;

public class CreateTopicMsg extends Message {
	
	private String topic;

    public CreateTopicMsg(String user, String topic) {
        super(MessageType.CREATETOPIC, user);
        this.topic = topic;
    }


    public String getTopic() {
        return topic;
    }
    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String toString() {
        return super.toString() + ", topic=" + topic;
    }
	// TODO: 
	// Implement object variables - a topic is required X
	
	// Complete the constructor, get/set-methods, and toString method X
    // as described in the project text	
}
