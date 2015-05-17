package org.exoplatform.recipe18;

import javax.persistence.PrePersist;

public class NameValidator {
  static final int MAX_NAME_LEN = 40;

  @PrePersist
  public void validate(Object obj) {
    System.out.println("validate: " + obj);
  }
}
