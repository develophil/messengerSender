package kr.co.juvis.common.sender.messenger;

public enum CONTENT_LEVEL {
    DEBUG("#cccccc")
    ,INFO("#00529B")
    ,SUCCESS("#4F8A10")
    ,WARN("#9F6000")
    ,ERROR("#D8000C");

    private final String color;

    private CONTENT_LEVEL(String color) {
            this.color = color;
    }

    public String getColorString() {
            return color;
    }
};
