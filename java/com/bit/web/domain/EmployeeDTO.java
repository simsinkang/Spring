package com.bit.web.domain;

import lombok.Data;

/**
 * employeeDTO
 */
@Data
public class EmployeeDTO {
private String employeeId, 
               manager, 
               name, 
               birthDate, 
               photo, 
               notes;
}