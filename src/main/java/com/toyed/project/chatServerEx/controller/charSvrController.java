package com.toyed.project.chatServerEx.controller;

import com.toyed.project.chatServerEx.dto.ChatRoom;
import com.toyed.project.chatServerEx.dto.ChatService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping(path = "/chat")
public class charSvrController {

    private final ChatService chatService;

    @PostMapping
    public ChatRoom createRoom(@RequestParam String name){
        return chatService.createRooom(name);
    }

    @GetMapping
    public List<ChatRoom> finalAllRoom(){
        return chatService.finalAllRoom();
    }

}
