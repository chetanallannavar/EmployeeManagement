package com.example.employeeManagement.employeeManagement.bean;

public class Department {
private String Name;
private String dptId;
private String reportingManager;
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
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
