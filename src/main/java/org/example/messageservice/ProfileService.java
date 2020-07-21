package org.example.messageservice;

import org.example.messagedatabase.DatabaseClass;
import org.example.messagemodel.ProfileModel;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ProfileService {
    private Map<String, ProfileModel> profile= DatabaseClass.getLongProfileModelMap();

    public ProfileService(){
        profile.put("Prateek",new ProfileModel(1L,"Prateek","Prateek","Saxena"));
    }
    public List<ProfileModel> getAllProfiles(){
        return new ArrayList<ProfileModel>(profile.values());
    }
    public ProfileModel getProfile(String profileName){
        return profile.get(profileName);
    }
    public ProfileModel addProfile(ProfileModel profileModel){
        profileModel.setId(profile.size()+1);
        profile.put(profileModel.getProfileName(),profileModel);
        return  profileModel;
    }
    public ProfileModel updateProfile(ProfileModel profileModel){
        if(profileModel.getProfileName().isEmpty()){
            return null;
        }
        profileModel.setId(profileModel.getId());
        profile.put(profileModel.getProfileName(),profileModel);
        return profileModel;
    }
    public ProfileModel removeProfile(String profileName){
        return profile.remove(profileName);
    }
}
