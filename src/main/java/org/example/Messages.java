package org.example;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import org.example.messagemodel.MessageModel;
import org.example.messageservice.MessageService;

import java.util.List;

@Path("messages")
public class Messages {
    MessageService messageService=new MessageService();
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<MessageModel> getMessages(@QueryParam("year") int year,@QueryParam("start") int start,@QueryParam("size") int size)
    {
        if(year>0)
            return messageService.getAllMessagesForYear(year);
        if(start>=0 && size>0)
            return messageService.getAllMessagesPaginated(start,size);

        return messageService.getAllMessages();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public MessageModel  addMessage(MessageModel messageModel){
        return messageService.addMessage(messageModel);
    }

    @PUT
    @Path("/{messageid}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public  MessageModel updateMessage(@PathParam("{messageid}") long id, MessageModel messageModel){
        messageModel.setId(id);
        return messageService.updateMessage(messageModel);
    }

    @DELETE
    @Path("/{messageid}")
    @Produces(MediaType.APPLICATION_JSON)
    public  void deleteMessage(@PathParam("{messageid}") long id){
        messageService.removeMessage(id);
    }


    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/{messageid}")
    public MessageModel getMessage(@PathParam("messageid") long messageid){
        return messageService.getMessage(messageid);
    }
}
