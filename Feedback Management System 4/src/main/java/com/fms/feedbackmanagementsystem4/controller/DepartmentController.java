package com.fms.feedbackmanagementsystem4.controller;

import com.fms.feedbackmanagementsystem4.dto.DepartmentInDto;
import com.fms.feedbackmanagementsystem4.serviceinterface.DepartmentServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


/**
 * Department Controller.
 *
 * @author adarsh
 */
@Controller
@RequestMapping("/department")
public class DepartmentController {

  /**
   * DepartmentService Autowired.
   */
  @Autowired
  private DepartmentServiceInterface departmentService;

//  /**
//   * Logger.
//   */
//  private static final Logger LOGGER = LoggerFactory.getLogger(
//        EmployeeController.class);

  /**
   * Get all Department.
   *
   * @param offset Integer
   * @return ResonseEntity
   */
  @GetMapping("/getall")
  public ResponseEntity<?> getAllDepartment(
      final @RequestParam(required = false) Integer offset) {
    if (offset == null) {
      return new ResponseEntity<>(this.departmentService.getAllDepartment(),
          HttpStatus.OK);
    } else {
      return new ResponseEntity<>(
          this.departmentService.getAllDepartmentByPagination(offset),
          HttpStatus.OK);
    }
  }

  /**
   *Save Department.
   *
   * @param departmentDto of type DepartmentDto.
   *
   * @return Department.
   */
  @PostMapping("/add")
  public ResponseEntity<?> saveDepartment(
      final @Validated @RequestBody DepartmentInDto departmentDto) {
    return new ResponseEntity<>(
      this.departmentService.addDepartment(departmentDto),
      HttpStatus.CREATED
    );
  }

  /**
   * Delete By Id.
   *
   * @param id Integer
   * @return String
   */
  @DeleteMapping("/delete/{id}")
  public ResponseEntity<?> deleteDepartment(
      final @PathVariable(name = "id") Integer id) {
    return new ResponseEntity<>(this.departmentService.deleteById(id),
        HttpStatus.OK);
  }
}
