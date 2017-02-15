package kr.co.juvis.common.sender.messenger.jandi;

import org.springframework.http.HttpHeaders;

import kr.co.juvis.common.sender.messenger.MessengerSender;

public class JandiSender extends MessengerSender
{

    public JandiSender(String topic)
    {
        super(topic);
    }

    @Override
    public void init()
    {
        headers = new HttpHeaders();
        headers.set("content-type", "application/json");
        headers.set("Accept", "application/vnd.tosslab.jandi-v2+json");
    }

}
