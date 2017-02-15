package kr.co.juvis.common.sender.messenger.jandi.content;

public class ConnectInfo {
	String title;
	String description;
	String imageUrl;

	public ConnectInfo() {
	}
	public ConnectInfo(String title, String desc) {
	    this.title = title;
            this.description = desc;
	}
	public ConnectInfo(String title, String desc, String imageUrl) {
	    this.title = title;
	    this.description = desc;
	    this.imageUrl = imageUrl;
	}

	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
}
