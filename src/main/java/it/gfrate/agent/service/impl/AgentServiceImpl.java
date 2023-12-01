package it.gfrate.agent.service.impl;

import it.gfrate.agent.Utils;
import it.gfrate.agent.model.Url;
import it.gfrate.agent.model.UrlRequest;
import it.gfrate.agent.model.UrlResponse;
import it.gfrate.agent.repository.AgentRepository;
import it.gfrate.agent.service.AgentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service("agentServiceImpl")
public class AgentServiceImpl implements AgentService {

    @Autowired
    private AgentRepository agentRepository;

    @Override
    public UrlResponse createShortUrl(UrlRequest urlRequest) {
        String url = urlRequest.getOriginalUrl();

        if(url.isEmpty())
            return new UrlResponse(false, "URL is not valid.");

        String encodedUrl = Utils.encodeUrl(url);
        Url generatedUrl = new Url(url, encodedUrl, new Date());

        agentRepository.save(generatedUrl);

        return new UrlResponse(true, encodedUrl);
    }
}
