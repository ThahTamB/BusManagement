package com.btt.pojo;

import com.btt.pojo.Customer;
import com.btt.pojo.Employee;
import com.btt.pojo.Review;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2023-08-19T16:18:45")
@StaticMetamodel(User.class)
public class User_ { 

    public static volatile SingularAttribute<User, String> password;
    public static volatile SingularAttribute<User, String> role;
    public static volatile SetAttribute<User, Customer> customerSet;
    public static volatile SetAttribute<User, Review> reviewSet;
    public static volatile SingularAttribute<User, Integer> id;
    public static volatile SingularAttribute<User, String> username;
    public static volatile SetAttribute<User, Employee> employeeSet;

}