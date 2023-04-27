package com.java.department.service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.department.entity.Depatrment;
import com.java.department.entity.DepatrmentEntity;
import com.java.department.repository.DepartmentRepository;

@Service

public class DepartmentServiceImpl implements DepartmentService{
	@Autowired
	private DepartmentRepository departmentRepository;
	@Override
	public Depatrment saveDepatrment(Depatrment department) {
		return departmentRepository.save(department);
	}
	@Override
	public List<Depatrment>fetchDepartmentList(){
		return List(<departmentRepository>)departmentRepository.findAll();
	}

	@Override
	public DepartmentRepository updateDepartment(Department department, Long departmentId) {
		Depatrment depDB=departmentRepository.findById(departmentId).get();
		if(Objects.nonNull(department.getDepartmentName())&& !"".equalsIgnoreCase(department.getDepartmentName())){
				depDB.setDepartmentName(department.getDepartmentName());
		}
		if(Objects.nonNull(department.getDepartmentAddress())&&!"".equalsIgnoreCase(department.getDepartmentAddress())){
				depDB.setDepartmentAddress(department.getDepartmentAddress());

	}if(Objects.nonNull(department.getDepartmentCode())&&!"".equalsIgnoreCase(department.getDepartmentCode())){
			depDB.setDepartmentCode(department.getDepartmentCode());
			}
	return departmentRepository.save(depDB);
	}
    @Override
	public void deleteDepartmentById(Long departmentId) {
		departmentRepository.deleteById(departmentId);
	}
}

}
