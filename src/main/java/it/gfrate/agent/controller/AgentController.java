package it.gfrate.agent.controller;

import it.gfrate.agent.model.UrlRequest;
import it.gfrate.agent.model.UrlResponse;
import it.gfrate.agent.service.AgentService;
import jakarta.servlet.http.HttpServlet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpResponse;

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
}
