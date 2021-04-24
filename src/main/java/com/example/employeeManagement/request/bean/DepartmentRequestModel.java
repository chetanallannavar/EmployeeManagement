package com.example.employeeManagement.request.bean;

import org.springframework.stereotype.Component;

@Component
public class DepartmentRequestModel {
private String dName;
private String dptId;
private String reportingManager;
public String getName() {
	return dName;
}
public void setdName(String name) {
	dName = name;
}
public String getDptId() {
	return dptId;
}
public void setDptId(String dptId) {
	this.dptId = dptId;
}
public String getReportingManager() {
	return reportingManager;
}
public void setReportingManager(String reportingManager) {
	this.reportingManager = reportingManager;
}


}
