package dip.modify;

/**
 * Higher level module does not depend on lower level module
 * also we can also add any other message service e.g. whatsup message service i below code
 */
public class NotificationService {

    private MessageService messageService;

    public NotificationService(MessageService messageService){
        this.messageService = messageService;
    }

    void sendNotification(String message){
        this.messageService.sendMessage(message);
    }
}
interface MessageService{
    void sendMessage(String message);
}
class EmailService implements MessageService{

    @Override
    public void sendMessage(String message) {
        System.out.println("Email sent");
    }
}
class SMSService implements MessageService{

    @Override
    public void sendMessage(String message) {
        System.out.println("Message sent");
    }
}
