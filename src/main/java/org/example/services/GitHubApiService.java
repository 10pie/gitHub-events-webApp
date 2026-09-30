package org.example.services;

import org.example.models.UserActivity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Service
public class GitHubApiService {
    private final RestClient restClient;
    GitHubApiService(){
        this.restClient=RestClient.create();
    }
    public List<UserActivity> fetchUserActivity(String username){
        String uri="https://api.github.com/users/"+username+"/events";
//        System.out.println(uri);
        UserActivity[] userActivities= restClient.get().uri(uri).retrieve().body(UserActivity[].class);
        if(userActivities!=null){
            return Arrays.asList(userActivities);
        }
        return Collections.emptyList();
    }
}
