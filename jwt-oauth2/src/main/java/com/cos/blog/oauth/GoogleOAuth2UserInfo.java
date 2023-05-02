package com.cos.blog.oauth;

import java.util.Map;

public class GoogleOAuth2UserInfo extends OAuth2UserInfo {

    public GoogleOAuth2UserInfo(Map<String, Object> attributes) {
        super(attributes);
    }

    @Override
    public String getId() {
    	System.out.println("GoogleOAuth2UserInfo - getId 21 24");
        return (String) attributes.get("sub");
    }

    @Override
    public String getNickname() {
    	System.out.println("GoogleOAuth2UserInfo - getNickname 25");
        return (String) attributes.get("name");
    }

    @Override
    public String getImageUrl() {
    	System.out.println("GoogleOAuth2UserInfo - getImageUrl 26");
        return (String) attributes.get("picture");
    }
}
