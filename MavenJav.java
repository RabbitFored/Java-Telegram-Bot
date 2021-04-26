package com.MavenJav;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public class MavenJav extends TelegramLongPollingBot {
   public void onUpdateReceived (Update update){
    // System.out.println(update.getMessage().getText())
       // System.out.println(update.getMessage().getFrom().getFirstName());
   String command  = update.getMessage().getText();

      SendMessage message = new SendMessage();
            if(command.equals("/myfirstname")){
       System.out.println(update.getMessage().getFrom().getFirstName());
message.setText(update.getMessage().getFrom().getFirstName());

   }
         if (command.equals("/mylastname"))  {
       
       System.out.println(update.getMessage().getFrom().getLastName());

       message.setText(update.getMessage().getFrom().getLastName());

    }

         if(command.equals("/myid"))        {
         
           System.out.println(update.getMessage().getFrom().getId());
         
           message.setText(String.valueOf(update.getMessage().getFrom().getId()));
         
         }


       if(command.equals("/myname"))        {
         
         System.out.println(update.getMessage().getFrom().getFirstName()+" "+update.getMessage().getFrom().getLastName());
         
         message.setText(update.getMessage().getFrom().getFirstName()+" "+update.getMessage().getFrom().getLastName());

         }
       
       message.setChatId(String.valueOf(update.getMessage().getChatId()));
       
       try {
           execute(message);
       } catch (TelegramApiException e) {
           e.printStackTrace();
       }
       
   }




    public String getBotUsername() {


        return "MavenJav";
    }

    public String getBotToken() {
        return "";                //Enter Your Bot Token Here
    }


}
