//WID(2/06/2026)(DegamieSign)#1.1
package com.carofly.game_server.controller;

import com.carofly.game_server.service.OpenAIService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Controller
@RequestMapping("/carofly/ai")
public class OpenAIController {
    @Autowired
    public OpenAIService aiService;
    public void setOpenAiService(OpenAIService aiService){this.aiService=aiService;}//binding AiService in App
    public OpenAIController(OpenAIService aiService){
        this.aiService=aiService;
    }
    @GetMapping("/chat")
    public String   chat(@RequestParam(value = "message",defaultValue = "Which Car color you want to Select?,pLs tell")String message)
    {
        return aiService.generateresponse(message);
    }
}
