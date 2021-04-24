package com.example.employeeManagement.Util;

import java.util.Random;

import org.springframework.beans.BeanUtils;

import com.example.employeeManagement.repository.SrcEmployee;
import com.example.employeeManagement.request.bean.EmployeeRequestModel;
import com.example.employeeManagement.response.bean.EmployeeResponseModel;

public class HelperUtil {

	public static SrcEmployee mapEmployeeSrcModel(EmployeeRequestModel model) {
		SrcEmployee srcEmployee = new SrcEmployee();
		BeanUtils.copyProperties(model, srcEmployee);
		srcEmployee.setEmpId(getEmployeeId());
		return srcEmployee;
	}

	public static EmployeeResponseModel mapEmployeeResModel(SrcEmployee save) {
		EmployeeResponseModel resmodel = new EmployeeResponseModel();
		resmodel.setEmpID(resmodel.getFirstName());
		resmodel.setLastName(resmodel.getLastName());
		resmodel.setEmpID(resmodel.getEmpID());
		return resmodel;
	}

	public static String getEmployeeId() {
		StringBuffer bf = new StringBuffer();
		for (int i = 1; i <= 6; i++) {
			double d = (Math.random()) * 10;
			bf.append(d);
		}

		return bf.toString();

	}

}