package com.itheima.coneroller;


import com.itheima.client.Userclient;
import com.itheima.pojo.tb_user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("conner/user")
//@DefaultProperties(defaultFallback = "")//声明全方法熔断然后跳那个方法
public class usercontroller {
    @Autowired
    private Userclient userclient;
  /*  @Autowired
    private RestTemplate restTemplate;*/
/*    @Autowired
    private DiscoveryClient discoveryClient;//包含了拉去的所有服务信息*/
    @GetMapping
    //@HystrixCommand(fallbackMethod = "fallBackMethod")//声明熔断的方法
    @ResponseBody
    public tb_user query(@RequestParam(value = "id") Long id ){
       /* List<ServiceInstance> instances = discoveryClient.getInstances("CN-ITCAST-PR");
        ServiceInstance serviceInstance = instances.get(0);
        String hostName = serviceInstance.getHost();
        int port = serviceInstance.getPort();*/
        //return this.restTemplate.getForObject("http://cn-itcast-pr:/user/"+id,String.class);

    return this.userclient.quiry(id);
    }
    /**
     * 熔断方法
     * 返回值要和被熔断的方法的返回值一致
     * 熔断方法不需要参数
     * @return
     */

    /*@RequestMapping("test")
    public String test(){
        return "heheda";
    }*/
}
