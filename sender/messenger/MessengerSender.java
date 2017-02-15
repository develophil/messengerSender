package kr.co.juvis.common.sender.messenger;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.ClientHttpRequestFactory;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

import kr.co.juvis.common.sender.Content;
import kr.co.juvis.common.sender.Sender;

public abstract class MessengerSender implements Sender
{
    protected MessengerSender(String url){this.WEBHOOK_URL = url;};

    public String WEBHOOK_URL = "";

    protected HttpHeaders headers;

    public abstract void init();

    @Override
    public boolean send(Content content) {
            HttpEntity<Content> param= new HttpEntity(content, headers);
            ClientHttpRequestFactory httpRequestFactory =  new HttpComponentsClientHttpRequestFactory();
            RestTemplate restTemplate = new RestTemplate(httpRequestFactory);
            ResponseEntity<String> responseEntity = restTemplate.exchange(WEBHOOK_URL, HttpMethod.POST, param, String.class);
//            System.out.println("responseEntity.getStatusCode() : "+responseEntity.getStatusCode().value());
            return responseEntity.getStatusCode().value() == 200 ? true : false;
    }


}
