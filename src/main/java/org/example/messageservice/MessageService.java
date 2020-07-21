package org.example.messageservice;
import org.example.messagedatabase.DatabaseClass;
import  org.example.messagemodel.MessageModel;
import org.example.messagemodel.ProfileModel;

import java.util.*;

public class MessageService {
    private Map<Long,MessageModel> message= DatabaseClass.getMessageModelMap();
    private Map<String, ProfileModel> profile=DatabaseClass.getLongProfileModelMap();

    public MessageService(){
        message.put(1L,new MessageModel(1,"Hello World!","Prateek"));
        message.put(2L,new MessageModel(2,"Hello Jersey","Prateek"));
    }

    public List<MessageModel> getAllMessages(){
        return  new ArrayList<>(message.values());
    }

    public  List<MessageModel> getAllMessagesForYear(int year){
        List<MessageModel> messageModelListyear=new ArrayList<>();
        Calendar cal=Calendar.getInstance();
        for(MessageModel messageModel:message.values()){
            cal.setTime(messageModel.getCreated());
            if(cal.get(Calendar.YEAR)==year){
                messageModelListyear.add(messageModel);
            }
        }
       return  messageModelListyear;
    }

    public List<MessageModel> getAllMessagesPaginated(int start,int size){
        List<MessageModel> list=new ArrayList<>(message.values());
        if(start+size>list.size())return new ArrayList<>();
        return list.subList(start,start+size);
    }


    public MessageModel getMessage(long id){
        return message.get(id);
    }

    public MessageModel addMessage(MessageModel messageModel){
        messageModel.setId(message.size()+1);
        message.put(messageModel.getId(),messageModel);
        return messageModel;
    }
    public MessageModel updateMessage(MessageModel messageModel){
        if(messageModel.getId()<=0){
            return  null;
        }
        message.put(messageModel.getId(),messageModel);
        return  messageModel;
    }
    public MessageModel removeMessage(long id)
    {
        return message.remove(id);
    }


}
