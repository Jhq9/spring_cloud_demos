package may.i.jhq.consulconsumer.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author jinhuaquan
 * @create 2017-09-13 下午2:46
 * @desc 创建一个接口用来消费consul提供的接口：
 **/
@RestController
public class DcController {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private LoadBalancerClient loadBalancerClient;

    @GetMapping("/consumer")
    public String dc() {

        ServiceInstance serviceInstance = loadBalancerClient.choose("consul-client-8084");

        String url = "http://" + serviceInstance.getHost() + ":" + serviceInstance.getPort() + "/dc";

        System.out.println("url : " + url);

        return restTemplate.getForObject(url, String.class);

    }


}
