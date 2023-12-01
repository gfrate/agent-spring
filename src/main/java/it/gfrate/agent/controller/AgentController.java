package it.gfrate.agent.controller;

import it.gfrate.agent.model.UrlRequest;
import it.gfrate.agent.service.AgentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AgentController {

    @Autowired
    private AgentService agentService;

    @PostMapping("/")
    public void createShortUrl(@RequestBody UrlRequest urlRequest) {
        agentService.createShortUrl(urlRequest);
    }
}
