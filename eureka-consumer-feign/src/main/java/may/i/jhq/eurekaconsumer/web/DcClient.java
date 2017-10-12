/**
 * @author jinhuaquan
 * @create 2017-09-13 下午4:33
 * @desc 创建一个Feign的客户端接口定义
 **/
package may.i.jhq.eurekaconsumer.web;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("eureka-client") //指定这个接口所要调用的服务名称
public interface DcClient {

    @GetMapping("/dc")
    String consumer();

}
