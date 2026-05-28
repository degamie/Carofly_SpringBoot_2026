//WID(28/5/2026)(DegamieSign)
package com.carofly.game_server.controller;

import com.carofly.game_server.service.OpenAIService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Controller
@RequestMapping("/carofly/ai")
public class OpenAIController {
    @Autowired
    public OpenAIService aiService;
    public OpenAIController(OpenAIService aiService){
        this.aiService=aiService;
    }
}
