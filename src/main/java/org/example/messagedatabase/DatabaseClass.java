package org.example.messagedatabase;

import org.example.messagemodel.MessageModel;
import org.example.messagemodel.ProfileModel;

import java.util.HashMap;
import java.util.Map;

public class DatabaseClass {


    private static Map<Long, MessageModel> messageModelMap=new HashMap<>();
    private static Map<String, ProfileModel> longProfileModelMap=new HashMap<>();


    public static Map<Long, MessageModel> getMessageModelMap() {
        return messageModelMap;
    }
    public static Map<String, ProfileModel> getLongProfileModelMap() {
        return longProfileModelMap;
    }
}
