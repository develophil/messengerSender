package kr.co.juvis.common.sender.messenger;

import kr.co.juvis.common.sender.messenger.jandi.JandiFactory;

public class MessengerFactoryProducer
{
    public static MessengerFactory getFactory(String choice) {

        if("jandi".equalsIgnoreCase(choice)) {
            return new JandiFactory();
        }else if("slack".equalsIgnoreCase(choice)) {

        }

        return null;
    }
}
