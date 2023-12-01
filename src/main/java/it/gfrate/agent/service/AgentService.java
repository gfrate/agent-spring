package it.gfrate.agent.service;

import it.gfrate.agent.model.UrlResponse;
import it.gfrate.agent.model.UrlRequest;

public interface AgentService {
    UrlResponse createShortUrl(UrlRequest urlRequest);
}
