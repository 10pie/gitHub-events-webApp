package org.example.controllers;

import org.example.DTO.userActivityDTO;
import org.example.models.UserActivity;
import org.example.services.GitHubApiService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;
import java.util.stream.Collectors;

//telling springboot here is the controller
@RestController
@RequestMapping("/api/github")//for defining the base url https://localhost:8081/api/github
public class UserActivitiesController {
    List<String>EventType=List.of(
            "PUSH_EVENT",
            "WATCH_EVENT",
            "FORK_EVENT",
            "ISSUES_EVENT"
    );
private GitHubApiService gitHubApiService;
public UserActivitiesController(GitHubApiService gitHubApiService){
    this.gitHubApiService=gitHubApiService;
}
    //getting the value of username(passed in args)
    @Value("${username}")
    private String username;
    @Value("${filterType:All}")
    private String filterType;

    @GetMapping("/get")//route + the http method
    public List<userActivityDTO> GetUserActivity() throws NullPointerException{
        System.out.println("filterType "+filterType);
        try{
            List<UserActivity>user=gitHubApiService.fetchUserActivity(username);
            if(!EventType.contains(filterType)){
                return user.stream()
                        .map(x->new userActivityDTO(x.getId(),x.getType(),x.getActor().getLogin(),x.getCreatedAt())).collect(Collectors.toList());
            }
            else{
                return user
                        .stream()
                        .filter(x->filterType.equals(x.getType()))
                        .map(x->new userActivityDTO(x.getId(),x.getType(),x.getActor().getLogin(),x.getCreatedAt())).collect(Collectors.toList());
            }
        }
        catch(Exception e){
        System.out.println(e.getMessage());
        return Collections.emptyList();
        }
}

}
