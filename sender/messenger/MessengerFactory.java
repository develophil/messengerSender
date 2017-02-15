package kr.co.juvis.common.sender.messenger;

import java.util.HashMap;

import kr.co.juvis.common.sender.Sender;
import kr.co.juvis.common.sender.SenderFactory;

public abstract class MessengerFactory implements SenderFactory
{
    public static final HashMap<String, String> WEBHOOK_URLS = new HashMap<String,String>() {
        {
         put("slack_test", "https://hooks.slack.com/services/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");
         put("jandi_test", "https://wh.jandi.com/connect-api/webhook/12667568/6d92f5a0b59947d346920217b3db6d84");
        }
    };

    public abstract Sender create(String topic);
}
