package it.gfrate.agent.controller;

import it.gfrate.agent.model.UrlRequest;
import it.gfrate.agent.model.UrlResponse;
import it.gfrate.agent.service.AgentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class AgentController {

    @Autowired
    private AgentService agentService;

    @PostMapping("/")
    public UrlResponse createShortUrl(@RequestBody UrlRequest urlRequest) {
        return agentService.createShortUrl(urlRequest);
    }
}
