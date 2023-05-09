package com.lsy.springCloud;

import com.lsy.springCloud.entity.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Component
@FeignClient(value = "springcloud-eureka-provider")
public interface UserServiceSpi {

    @GetMapping("/getInfo/{id}")
    User getInfo(@PathVariable(value = "id") Integer id);

}
