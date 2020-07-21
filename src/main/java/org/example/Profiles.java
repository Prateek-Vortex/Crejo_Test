package org.example;

import org.example.messagemodel.ProfileModel;
import org.example.messageservice.ProfileService;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("profiles")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class Profiles {
    ProfileService profileService=new ProfileService();
    @GET
    public List<ProfileModel> getProfiles(){

        return profileService.getAllProfiles();
    }
    @GET
    @Path("/{profileName}")
    public ProfileModel getProfile(@PathParam("profileName") String profileName){
        return profileService.getProfile(profileName);
    }

    @POST
    public ProfileModel addProfile(ProfileModel profileModel){
        return   profileService.addProfile(profileModel);
    }

    @PUT
    @Path("/{profileName}")
    public ProfileModel updateProfile(@PathParam("profileName") String profileName, ProfileModel profileModel){

        profileModel.setProfileName(profileName);
        return profileService.updateProfile(profileModel);
    }

    @DELETE
    @Path("/{profileName}")
    public void deleteProfile(@PathParam("profileName") String profileName){
        profileService.removeProfile(profileName);
    }
}
