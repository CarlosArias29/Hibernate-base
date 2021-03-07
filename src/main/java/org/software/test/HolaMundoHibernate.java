/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.software.test;

import java.util.List;
import javax.persistence.EntityManagerFactory;
import javax.persistence.*;
import org.software.domain.Persona;

/**
 *
 * @author Usuario
 */
public class HolaMundoHibernate {
    public static void main(String[] args) {
        String hql = "SELECT p FROM Persona p";
        EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("HibernateEjemplo1");
        EntityManager entityManager = fabrica.createEntityManager();
        
        Query query = entityManager.createQuery(hql);
        
        List<Persona> personas = query.getResultList();
        for (Persona p : personas) {
            System.out.println("Personas: " + p);
        }
    }
}
