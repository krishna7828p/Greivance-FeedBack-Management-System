package com.fms.feedbackmanagementsystem4.repo;


import com.fms.feedbackmanagementsystem4.entities.Department;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Department Repo.
 */

public interface DepartmentRepo extends JpaRepository<Department, Integer> {

  /**
   * Find By Department Name.
   *
   * @param depName String
   * @return Department
   */
  Department findByDepName(String depName);
}
