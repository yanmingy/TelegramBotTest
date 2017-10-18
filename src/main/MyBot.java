package main;

import org.telegram.telegrambots.api.methods.send.SendMessage;
import org.telegram.telegrambots.api.methods.updatingmessages.DeleteMessage;
import org.telegram.telegrambots.api.objects.Update;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.exceptions.TelegramApiException;
import org.telegram.telegrambots.updateshandlers.SentCallback;


public class MyBot extends TelegramLongPollingBot{


	@Override
	public String getBotUsername() {
		return "YmBot";
	}
	
	@SuppressWarnings("deprecation")
	@Override
	public void onUpdateReceived(Update update) {
		   if (update.hasMessage() && update.getMessage().hasText()) {
		        
			   // Set variables
		        String message_text = update.getMessage().getText();
		        long chat_id = update.getMessage().getChatId();
		        String name = update.getMessage().getFrom().getUserName();

		        SendMessage message = new SendMessage() // Create a message object object
		                .setChatId(chat_id)
		                .setText(name+":"+message_text);
		        
		        DeleteMessage dmessage = new DeleteMessage(); // Create the message object to delete
		        dmessage.setMessageId(update.getMessage().getMessageId());
		        dmessage.setChatId(chat_id+"");
		        
		        
		        try {
		            sendMessage(message); // Sending our message object to user. Why is this deprecated?
		            deleteMessage(dmessage, new sb()); // Why is deleteMessage also deprecated?
		            
		        } catch (TelegramApiException e) {
		            e.printStackTrace();
		            System.out.println(e.toString());
		        }
		    }

		   
		System.out.println(update); // Debug
		
	}

	@Override
	public String getBotToken() {
		return ""; // ymbot
	}

	
}
