package org.example.maptest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MapController {
    @GetMapping("/naver-map")
    public String getNaverMap() {
        return "naverMap";
    }

    @GetMapping("/kakao-map")
    public String getKakaoMap() {
        return "kakaoMap";
    }
}
