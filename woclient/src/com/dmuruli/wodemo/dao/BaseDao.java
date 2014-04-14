package com.dmuruli.wodemo.dao;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
public class BaseDao {
	 private static EntityManager entityManager;

	 public EntityManager getEntityManager(){
	   if(entityManager==null){
	      entityManager = Persistence.createEntityManagerFactory("rentaldb").createEntityManager();
	   }
	   
	   return entityManager ;
	 }
}
