package com.fms.feedbackmanagementsystem4.serviceinterface;

import com.fms.feedbackmanagementsystem4.dto.ChangePasswordDto;
import com.fms.feedbackmanagementsystem4.dto.EmployeeOutDto;
import com.fms.feedbackmanagementsystem4.dto.EmployeesInDto;
import com.fms.feedbackmanagementsystem4.dto.UserLogin;
import com.grievance.exception.ApiResponse;
import java.util.List;

/**
 * Interface for employee service .
 */
public interface EmployeeServiceInterface {

  /**
   *save employee .
   *
   * @param empDto
   *
   * @return EmployeeDto
   */
  EmployeeOutDto saveEmployee(EmployeesInDto empDto);

  /**
   * login method .
   *
   * @param login
   *
   * @return String
   */
  EmployeeOutDto login(UserLogin login);

  /**
   * Get By Id.
   *
   * @param id Integer.
   *
   * @return EmployeeOutDto
   */
  EmployeeOutDto getById(Integer id);

  /**
   * Update Employee.
   *
   * @param id Integer
   * @param emp Employee
   * @return EmployeeOutDto
   */
  EmployeeOutDto updateEmployee(
        Integer id, EmployeesInDto emp);

  /**
   * change Password.
   *
   * @param id Integer
   * @param changePasswordDto ChangePasswordDto
   * @return ApiResponse
   */
  ApiResponse changePassword(
         Integer id, ChangePasswordDto changePasswordDto);

  /**
   * Get All Employee.
   *
   * @param offset Integer
   * @param depName String
   *
   * @return List of EmployeeOutDto
   */
  List<EmployeeOutDto> getAllEmployee(Integer offset, String depName);

  /**
   * Delete Employee.
   *
   * @param id Integer
   * @return String
   */
  String deleteEmployee(Integer id);
}
