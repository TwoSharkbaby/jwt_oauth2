package com.cos.blog.oauth;

import java.util.Map;

public class NaverOAuth2UserInfo extends OAuth2UserInfo {

	public NaverOAuth2UserInfo(Map<String, Object> attributes) {
		
		super(attributes);
	}

	@Override
	public String getId() {
		System.out.println("NaverOAuth2UserInfo - getId 21");
		Map<String, Object> response = (Map<String, Object>) attributes.get("response");
		System.out.println(attributes.toString());
		if (response == null) {
			return null;
		}
		return (String) response.get("id");
	}

	@Override
	public String getNickname() {
		System.out.println("NaverOAuth2UserInfo - getNickname");
		Map<String, Object> response = (Map<String, Object>) attributes.get("response");

		if (response == null) {
			return null;
		}

		return (String) response.get("name");
	}

	@Override
	public String getImageUrl() {
		System.out.println("NaverOAuth2UserInfo - getImageUrl");
		Map<String, Object> response = (Map<String, Object>) attributes.get("response");

		if (response == null) {
			return null;
		}

		return (String) response.get("profile_image");
	}
}
