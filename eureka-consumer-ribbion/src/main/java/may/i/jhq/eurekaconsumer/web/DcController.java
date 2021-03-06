package may.i.jhq.eurekaconsumer.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author jinhuaquan
 * @create 2017-09-13 下午2:10
 * @desc 接口用来消费eureka-client提供的接口
 **/
@RestController
public class DcController {

//    @Autowired
//    private LoadBalancerClient loadBalancerClient;

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/consumer")
    public String dc() {
//        ServiceInstance serviceInstance = loadBalancerClient.choose("eureka-client");
//        String url = "http://" + serviceInstance.getHost() + ":" +serviceInstance.getPort() + "/dc";

//        System.out.println("url : " + url);
        return restTemplate.getForObject("http://eureka-client/dc", String.class);
    }

}
