package kr.co.juvis.common.sender.messenger.jandi;

import java.util.ArrayList;
import java.util.List;

import kr.co.juvis.common.sender.ContentBuilder;
import kr.co.juvis.common.sender.messenger.CONTENT_LEVEL;
import kr.co.juvis.common.sender.messenger.jandi.content.ConnectInfo;
import kr.co.juvis.common.sender.messenger.jandi.content.JandiContent;

public class JandiContentBuilder extends ContentBuilder
{
    private JandiContent content;

    private JandiContentBuilder(){}
    private JandiContentBuilder(CONTENT_LEVEL level, String title){
        content = new JandiContent(level, title);
    }

    public static JandiContentBuilder createContent(CONTENT_LEVEL level, String title) {
        return new JandiContentBuilder(level, title);
    }
    public JandiContentBuilder addInfo(String title, String desc)
    {
        addInfo(title, desc, null);
        return this;
    }
    public JandiContentBuilder addInfo(String title, String desc, String imgUrl)
    {
        List<ConnectInfo> connectInfo = this.content.getConnectInfo();

        if(connectInfo == null) {
            connectInfo = new ArrayList<>();
        }
        connectInfo.add(new ConnectInfo(title, desc, imgUrl));
        this.content.setConnectInfo(connectInfo);
        return this;
    }

    public JandiContent build()
    {
        return content;
    }

}
