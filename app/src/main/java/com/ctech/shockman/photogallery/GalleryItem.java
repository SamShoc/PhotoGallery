package com.ctech.shockman.photogallery;

public class GalleryItem {

    private String mCaption;
    private String mId;
    private String mUrl;

    public String getUrl() {
        return mUrl;
    }

    public void setUrl(String url) {
        mUrl = url;
    }

    public String getId() {
        return mId;
    }

    public void setId(String id) {
        mId = id;
    }

    public String getCaption() {
        return mCaption;
    }

    public void setCaption(String caption) {
        mCaption = caption;
    }

    @Override
    public String toString() {
        return mCaption;
    }
}
