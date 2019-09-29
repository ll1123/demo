package com.example.demo.hystrix;

import com.example.demo.fegin.HelloRemote;
import org.springframework.stereotype.Component;

/**
 * @author ll
 * @version 1.0
 * @since 2019/9/29 14:06
 */
@Component
public class HelloRemoteHystrix implements HelloRemote {
    @Override
    public String helloWrold() {
        return "error";
    }
}
