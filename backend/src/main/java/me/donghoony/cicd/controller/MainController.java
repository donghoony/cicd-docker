package me.donghoony.cicd.controller;

import me.donghoony.cicd.dto.MainResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping("/main")
    public ResponseEntity<MainResponse> mainResponse(){
        MainResponse mainResponse = new MainResponse("Hello world!");
        return ResponseEntity.ok(mainResponse);
    }
}
