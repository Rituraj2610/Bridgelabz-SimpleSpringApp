package com.rituraj.simpleSpringApp.service;

import org.springframework.beans.factory.annotation.Autowired;

public class EmployeeBean {
    private int id;
    private String name;

    @Autowired
    private DepartmentBean departmentBean;

    @Autowired
    public EmployeeBean(DepartmentBean departmentBean) {
        this.departmentBean = departmentBean;
    }

    public DepartmentBean getDepartmentBean() {
        return departmentBean;
    }

    public void setDepartmentBean(DepartmentBean departmentBean) {
        this.departmentBean = departmentBean;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "EmployeeBean{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", departmentBean=" + departmentBean +
                '}';
    }
}
