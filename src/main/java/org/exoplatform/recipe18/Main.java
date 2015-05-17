package org.exoplatform.recipe18;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.apache.log4j.Logger;

public class Main {
  
  private static final Logger log = Logger.getLogger(Main.class);
  
  static EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPAService");

  static EntityManager em = emf.createEntityManager();

  public static void main(String[] a) throws Exception {
    try {
      log.info("starting..........");
      
      em.getTransaction().begin();
      Employee emp = new Employee();
      emp.setId(1);
      em.persist(emp);
      em.getTransaction().commit();
      
      log.info("preUpdate..........");
      em.getTransaction().begin();
      emp.setName("Thanh");
      em.persist(emp);
      em.getTransaction().commit();
      
      Helper.checkData();
      em.close();
      emf.close();


    } finally {
      
    }
    
  }
}