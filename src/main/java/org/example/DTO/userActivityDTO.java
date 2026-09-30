package org.example.DTO;

import lombok.Getter;
import lombok.Setter;

import java.time.format.DateTimeFormatter;

@Getter @Setter
public class userActivityDTO{
    private String id;
    private String type;
    private String actorLogin;
    private String createdAt;
   public userActivityDTO(){
    }
    public userActivityDTO(String id,String type,String actorLogin,String createdAt){
       this.id=id;
       this.actorLogin=actorLogin;
       this.type=type;
       this.createdAt=createdAt;
    }
}