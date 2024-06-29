package com.example.RegisterLogin.response;


public class LoginResponse {
    String message;
    Boolean status;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }


    public LoginResponse(String message, Boolean status) {
        this.message = message;
        this.status = status;
    }
}

//package com.example.RegisterLogin.response;
//
//
//public class LoginResponse {
//    String message;
//    Boolean status;
//    String name;
//    String role;
//    String stream;
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getRole() {
//        return role;
//    }
//
//    public void setRole(String role) {
//        this.role = role;
//    }
//
//    public String getStream() {
//        return stream;
//    }
//
//    public void setStream(String stream) {
//        this.stream = stream;
//    }
//
//    public String getMessage() {
//        return message;
//    }
//
//    public void setMessage(String message) {
//        this.message = message;
//    }
//
//    public Boolean getStatus() {
//        return status;
//    }
//
//    public void setStatus(Boolean status) {
//        this.status = status;
//    }
//
//
//    public LoginResponse(String message, Boolean status ,String name , String role , String stream) {
//        this.message = message;
//        this.status = status;
//        this.name =name;
//        this.role=role;
//        this.stream=stream;
//    }
//}