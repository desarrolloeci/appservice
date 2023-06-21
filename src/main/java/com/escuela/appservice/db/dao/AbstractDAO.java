package com.escuela.appservice.db.dao;

import java.io.Serializable;
import java.util.List;
import javax.annotation.PreDestroy;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.transaction.Transactional;

public abstract class AbstractDAO<T extends Serializable> {

    private Class<T> clazz;

    public EntityManagerFactory emf;

    public EntityManager em;

    public AbstractDAO() {
        this.emf = Persistence.createEntityManagerFactory("AppMovil");
        this.em = emf.createEntityManager();
    }

    @PreDestroy
    public void destruct() {
        emf.close();
    }

    public final void setClazz(Class<T> clazzToSet) {
        this.clazz = clazzToSet;
    }

    public T findOne(int id, Class<T> clazz) {
        return this.em.find(clazz, id);
    }

    @SuppressWarnings("unchecked")
    public List<T> findAll() {
        return this.em.createQuery("from " + clazz.getName()).getResultList();
    }

    public Integer maxID(String dato){
        Integer idN=this.em.createQuery("Select MAX(t.id) FROM "+dato+" t ",Integer.class).getSingleResult();
        if(idN==null){
            return 0;
        }else{
        return idN;
        }
    }
     
    public void create(T entity) {
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        this.em.persist(entity);
        tx.commit();
    }

    public T update(T entity) {
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        entity = this.em.merge(entity);
        tx.commit();
        return entity;
        
    }

    public void deleteById(int entityId, Class<T> clazz) {
        T entity = findOne(entityId, clazz);
        this.em.remove(entity);
    }

    public void delete(T entity) {
        this.em.remove(entity);
    }

    public void flushCommitEM() {
        this.em.flush();
    }
}
