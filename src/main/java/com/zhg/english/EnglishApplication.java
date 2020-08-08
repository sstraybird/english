package com.zhg.english;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EnglishApplication {
    //截视频
    /*
        -t duration
        -ss position
        ffmpeg -ss 10 -i *.mp4 -t 5 out.mp4
     */

    public static void main(String[] args) {
        SpringApplication.run(EnglishApplication.class, args);
    }

}
