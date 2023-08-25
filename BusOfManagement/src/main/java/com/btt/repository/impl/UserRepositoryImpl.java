/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.btt.repository.impl;

import com.btt.pojo.User;
import java.util.List;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.btt.repository.UserRepository;
import org.hibernate.HibernateException;

/**
 *
 * @author bthta
 */
@Repository
@Transactional
public class UserRepositoryImpl implements UserRepository {

    @Autowired
    private LocalSessionFactoryBean factory;

    @Override
    public List<User> findAllUser() {
        Session s = factory.getObject().getCurrentSession();
        CriteriaBuilder b = s.getCriteriaBuilder();
        CriteriaQuery<User> q = b.createQuery(User.class);
        Root r = q.from(User.class);

        q.select(r);
        Query query = s.createQuery(q);
        return query.getResultList();
    }

    @Override
    public boolean addUser(User u) {
        Session s = this.factory.getObject().getCurrentSession();
                s.save(u);
                return true;
    }

    public boolean checkUsername(User u) {
        Session s = factory.getObject().getCurrentSession();
        String query = "From User WHERE username:=un";
        Query q = s.createQuery(query);

        q.setParameter("un", u.getUsername());
        if (q.getFirstResult() > 0) {
            return true;
        }

        return false;
    }

}
