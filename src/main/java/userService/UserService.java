package userService;

import java.util.Map;

import com.sun.tools.internal.xjc.reader.xmlschema.bindinfo.BIConversion;
import userModel.UserModel;
import userDatabase.DatabaseClass;

public class UserService {
    private Map<String,UserModel> userModelMap=DatabaseClass.getUserModelMap();

    public UserModel addUser(String name){
//        userModelMap.containsKey(name)?userModelMap.get(name):
        UserModel userModel=new UserModel(name,"User",0);
        userModelMap.put(name,userModel);
        return userModel;
    }

}
