package com.bit.web.mapper;

import java.util.List;
import com.bit.web.domain.EmployeeDTO;
import org.springframework.stereotype.Repository;

/**
 * EmployeeMapper
 */

@Repository
public interface EmployeeMapper {
    public void addEmployee(EmployeeDTO employee);
    public List<EmployeeDTO> findEmployees();
    public List<EmployeeDTO> findEmployeesByOption(EmployeeDTO option);
    public EmployeeDTO findEmployeeByEmployeeId(String employeeId);
    public void updateEmployee(EmployeeDTO employee);
    public void deleteEmployee(EmployeeDTO employee);
}