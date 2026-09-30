package org.example.controllers;

import org.example.DTO.userActivityDTO;
import org.example.models.UserActivity;
import org.example.services.GitHubApiService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/github")
public class UserActivitiesController {
private GitHubApiService gitHubApiService;
public UserActivitiesController(GitHubApiService gitHubApiService){
    this.gitHubApiService=gitHubApiService;
}

    @Value("${username}")
    private String username;
    @GetMapping("/get")
    public List<userActivityDTO> GetUserActivity() throws NullPointerException{
        try{
            List<UserActivity>user=gitHubApiService.fetchUserActivity(username);
            return user.stream()
                    .map(x->new userActivityDTO(x.getId(),x.getType(),x.getActor().getLogin(),x.getCreatedAt())).collect(Collectors.toList());
        }
        catch(Exception e){
        System.out.println(e.getMessage());
        return Collections.emptyList();
        }
}

}
