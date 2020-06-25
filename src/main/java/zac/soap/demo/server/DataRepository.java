package zac.soap.demo.server;
import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;
import org.springframework.util.Assert;
import demosoap.Response;

@Component
public class DataRepository {
    public static final Map<String, Response> data = new HashMap<String, Response>();

    @PostConstruct
    public void initData() {
       Response data1 = new Response();
        data1.setData("response Data1");
        data.put("data1", data1);

    }

}
