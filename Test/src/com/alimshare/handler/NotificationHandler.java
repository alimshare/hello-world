package com.alimshare.handler;

import com.alimshare.entity.Email;
import com.alimshare.entity.PushNotification;
import com.alimshare.entity.SMS;

public class NotificationHandler {

	public void sendSMS(SMS object){
		// send sms
		System.out.println("Send SMS");
	}
	
	public void sendEmail(Email object){
		// send email
		System.out.println("Send Email");
	}
	
	public void sendPushNotification(PushNotification object){
		// send push notification
		System.out.println("Send Push Notification");
	}
	
}
