package may.i.jhq.consul.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jinhuaquan
 * @create 2017-09-13 下午2:52
 * @desc 创建一个用于被消费的接口
 **/
@RestController
public class DcController {

    @Autowired
    private DiscoveryClient discoveryClient;

    @GetMapping("/dc")
    public String dc() {

        String services = "services :" + discoveryClient.getServices();

        return services;

    }

}
