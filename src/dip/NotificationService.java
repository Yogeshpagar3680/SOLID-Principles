package dip;

/**
 * NotificationService() depends on emailService & smsService
 * i.e. violating dependency inversion principles
 * i.e. tight coupling
 */

//high level module
public class NotificationService {
    //This sends notification either by email or sms

    //low level modules
    EmailService emailService;
    SMSService smsService;

    public NotificationService(){
        this.emailService = new EmailService();
        this.smsService = new SMSService();
    }

    void sendNotification(String messsage){
        emailService.sendEmail(messsage);
        smsService.sendSMS(messsage);
    }

}
class EmailService{
    void sendEmail(String message){
        System.out.println("Email sent " + message);
    }
}
class SMSService{
    void sendSMS(String message){
        System.out.println("SMS sent " + message);
    }
}