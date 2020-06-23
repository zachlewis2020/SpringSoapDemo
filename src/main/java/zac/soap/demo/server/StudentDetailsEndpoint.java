package zac.soap.demo.server;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import java.io.File;  // Import the File class
import java.io.IOException;  // Import the IOException class to handle errors

import students.StudentDetailsRequest;
import students.StudentDetailsResponse;
import students.StudentDetails;

@Endpoint
public class StudentDetailsEndpoint {

    @PayloadRoot(namespace = "students", localPart = "GetStudentDetailsRequest")
    @ResponsePayload
    public StudentDetailsResponse processCourseDetailsRequest() {

        StudentDetailsResponse fii = new StudentDetailsResponse();
        fii.setName("Works");
        System.out.println("Works");
        return fii;
    }

}
