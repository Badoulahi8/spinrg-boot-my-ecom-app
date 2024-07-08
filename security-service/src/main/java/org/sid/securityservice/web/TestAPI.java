package org.sid.securityservice.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("api")
public class TestAPI {

    @GetMapping("/datasTest")
    public Map<String, Object> mapDatas(){
        return Map.of("message", "test");
    }
}
