package main;

import java.io.Serializable;

import org.telegram.telegrambots.api.methods.BotApiMethod;
import org.telegram.telegrambots.exceptions.TelegramApiRequestException;
import org.telegram.telegrambots.updateshandlers.SentCallback;


//SentCallBack interface
public class sb implements SentCallback{

	@Override
	public void onError(BotApiMethod arg0, TelegramApiRequestException arg1) {
		// TODO Auto-generated method stub
		System.out.println(arg1);
	}

	@Override
	public void onException(BotApiMethod arg0, Exception arg1) {
		// TODO Auto-generated method stub
		System.out.println(arg1);
	}

	@Override
	public void onResult(BotApiMethod arg0, Serializable arg1) {
		// TODO Auto-generated method stub
		System.out.println(arg0);
		
	}

}
