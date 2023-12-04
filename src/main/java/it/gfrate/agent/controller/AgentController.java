package it.gfrate.agent.controller;

import it.gfrate.agent.model.UrlRequest;
import it.gfrate.agent.model.UrlResponse;
import it.gfrate.agent.service.AgentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

@RestController
public class AgentController {

    @Autowired
    private AgentService agentService;

    @PostMapping("/")
    public UrlResponse createShortUrl(@RequestBody UrlRequest urlRequest) {
        return agentService.createShortUrl(urlRequest);
    }

    @GetMapping("/{shortenedUrl}")
    public RedirectView getOriginalUrl(@PathVariable("shortenedUrl") String shortenedUrl) {
        return new RedirectView(agentService.getOriginalUrl(shortenedUrl));
    }

    @DeleteMapping("/{id}")
    public UrlResponse deleteOriginalUrl(@PathVariable("id") Long id) {
        return agentService.deleteShortUrl(id);
    }
}
