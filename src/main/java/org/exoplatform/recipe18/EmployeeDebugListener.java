package org.exoplatform.recipe18;

import javax.persistence.PreUpdate;

public class EmployeeDebugListener {

  @PreUpdate
  public void preUpdate(Employee emp) {
    System.out.println("EmployeeDebugListener.Update called on employee id: " + emp.getId());
  }

}
