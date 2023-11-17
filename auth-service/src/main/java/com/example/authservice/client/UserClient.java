package com.example.authservice.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "user-service")
public interface UserClient
{
    @GetMapping("api/v1/users/register/{username}")
    void registerUser(@PathVariable("username") String username);
}