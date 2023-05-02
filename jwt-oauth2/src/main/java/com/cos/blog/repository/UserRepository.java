package com.cos.blog.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.cos.blog.model.SocialType;
import com.cos.blog.model.User;

public interface UserRepository extends JpaRepository<User, Long>{

	Optional<User> findByEmail(String email);

    Optional<User> findByNickname(String nickname);

    Optional<User> findByRefreshToken(String refreshToken);
    
    @Modifying
    @Query("UPDATE User u SET u.refreshToken = :refreshToken WHERE u.email = :email")
    void saveRefreshToken(@Param("email") String email, @Param("refreshToken") String refreshToken);
    
    Optional<User> findBySocialTypeAndSocialId(SocialType socialType, String socialId);
    
}
