package com.rituraj.simpleSpringApp.service;

import jakarta.websocket.server.ServerEndpoint;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
public class DepartmentBean {
    private String DeptName;
}
