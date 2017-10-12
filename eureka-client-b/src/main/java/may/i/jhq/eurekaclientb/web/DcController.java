package may.i.jhq.eurekaclientb.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author jinhuaquan
 * @create 2017-09-13 下午1:27
 * @desc 通过DiscoveryClient对象，在日志中打印出服务实例的相关内容
 **/
@Controller
public class DcController {

    @Autowired
    private DiscoveryClient discoveryClient;

    @GetMapping("/dc")
    @ResponseBody
    public String dc() throws InterruptedException {

        //Thread.sleep(5000L);   测试hystrix所用

        String services = "Services: " +discoveryClient.getServices();

        System.out.println(services);
        return services;
    }

}
