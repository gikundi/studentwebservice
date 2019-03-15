package com.students.soap.webservices.studentssoapwebservices.student;

import com.students.students.GetStudentDetailsRequest;
import com.students.students.GetStudentDetailsResponse;
import com.students.students.StudentDetails;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class StudentDetailsEndpoint {

    @PayloadRoot(namespace = "http://students.com/students", localPart = "GetStudentDetailsRequest")
    @ResponsePayload
    public GetStudentDetailsResponse processCourseDetailsRequest(@RequestPayload GetStudentDetailsRequest request) {
        GetStudentDetailsResponse response = new GetStudentDetailsResponse();

        StudentDetails studentDetails = new StudentDetails();
        studentDetails.setId(request.getId());
        studentDetails.setName("Denis");
        studentDetails.setPassportNumber("286123432");

        response.setStudentDetails(studentDetails);
        return  response;


    }

}
