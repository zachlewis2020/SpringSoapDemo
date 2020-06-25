package zac.soap.demo.server;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import java.io.File;  // Import the File class
import java.io.IOException;  // Import the IOException class to handle errors

import demosoap.Request;
import demosoap.Response;

@Endpoint
public class MyDataEndpoint {

    private DataRepository dataRepository;

    @Autowired
    public MyDataEndpoint(DataRepository dataRepository) {
        this.dataRepository = dataRepository;
    }

    @PayloadRoot(namespace = "demosoap", localPart = "request")
    @ResponsePayload
    public Response processRequest(@RequestPayload Request req) {

        Response responseData = dataRepository.data.get("data1");
        System.out.println("Works In Data processResponse: ");
                System.out.println("Works In Data processResponse: " + req.getData());
        return responseData;
    }

}
