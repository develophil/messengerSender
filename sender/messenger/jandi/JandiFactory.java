package kr.co.juvis.common.sender.messenger.jandi;

import kr.co.juvis.common.sender.Sender;
import kr.co.juvis.common.sender.messenger.MessengerFactory;

public class JandiFactory extends MessengerFactory
{

    @Override
    public Sender create()
    {
        return null;
    }

    @Override
    public Sender create(String topic)
    {
        if(!topic.contains("jandi")) {
            topic = "jandi_" + topic;
        }
        String url = WEBHOOK_URLS.get(topic);
        return new JandiSender(url);
    }
}
