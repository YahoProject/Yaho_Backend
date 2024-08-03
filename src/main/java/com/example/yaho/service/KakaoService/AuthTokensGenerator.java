//package com.example.yaho.service.KakaoService;
//
//import com.example.yaho.web.dto.LoginResponseDto;
//import lombok.RequiredArgsConstructor;
//import org.springframework.stereotype.Component;
//
//import java.util.Date;
//
//@Component
//@RequiredArgsConstructor
//public class AuthTokensGenerator {
//    private static final String BEARER_TYPE = "Bearer";
//    private static final long ACCESS_TOKEN_EXPIRE_TIME = 1000 * 60 * 60;	//1시간
//    private static final long REFRESH_TOKEN_EXPIRE_TIME = 1000 * 60 * 60 * 24 * 14;  // 14일
//
//    private final JwtTokenProvider jwtTokenProvider;
//
//    //id 받아 Access Token 생성
//    public LoginResponseDto.AuthTokens generate(String uid) {
//        long now = (new Date()).getTime();
//        Date accessTokenExpiredAt = new Date(now + ACCESS_TOKEN_EXPIRE_TIME);
//        Date refreshTokenExpiredAt = new Date(now + REFRESH_TOKEN_EXPIRE_TIME);
//
//        //String subject = email.toString();
//        String accessToken = jwtTokenProvider.accessTokenGenerate(uid, accessTokenExpiredAt);
//        String refreshToken = jwtTokenProvider.refreshTokenGenerate(refreshTokenExpiredAt);
//
//        return new LoginResponseDto.AuthTokens(accessToken, refreshToken, BEARER_TYPE, ACCESS_TOKEN_EXPIRE_TIME / 1000L);
//    }
//}