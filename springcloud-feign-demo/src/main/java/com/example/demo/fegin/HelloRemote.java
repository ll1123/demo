package com.example.demo.fegin;

import com.example.demo.hystrix.HelloRemoteHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author ll
 * @version 1.0
 * @since 2019/9/29 11:36
 */
@FeignClient(name = "hello-word",fallback = HelloRemoteHystrix.class)
public interface HelloRemote {
    @GetMapping("/hello")
    String helloWrold();
}
