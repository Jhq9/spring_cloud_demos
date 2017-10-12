package may.i.jhq.eurekaconsumer.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jinhuaquan
 * @create 2017-09-13 下午2:10
 * @desc 接口用来消费eureka-client提供的接口
 **/
@RestController
public class DcController {

    @Autowired
    private DcClient dcClient;

    @GetMapping("/consumer")
    public String dc() {

        return dcClient.consumer();
    }

}
