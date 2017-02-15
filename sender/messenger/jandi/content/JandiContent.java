package kr.co.juvis.common.sender.messenger.jandi.content;

import java.util.List;

import kr.co.juvis.common.sender.Content;
import kr.co.juvis.common.sender.messenger.CONTENT_LEVEL;

public class JandiContent implements Content
{
    private String body;
    private String connectColor;
    private List<ConnectInfo> connectInfo;

    private JandiContent(){}
    public JandiContent(CONTENT_LEVEL level, String title)
    {
        this.body = title;
        this.connectColor = level.getColorString();
    }

    public String getBody()
    {
        return body;
    }
    public void setBody(String body)
    {
        this.body = body;
    }
    public String getConnectColor()
    {
        return connectColor;
    }
    public void setConnectColor(String connectColor)
    {
        this.connectColor = connectColor;
    }
    public List<ConnectInfo> getConnectInfo()
    {
        return connectInfo;
    }
    public void setConnectInfo(List<ConnectInfo> connectInfo)
    {
        this.connectInfo = connectInfo;
    }


}
