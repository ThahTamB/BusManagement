package com.btt.pojo;

import com.btt.pojo.Bill;
import com.btt.pojo.Trip;
import com.btt.pojo.User;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2023-08-19T16:18:45")
@StaticMetamodel(Employee.class)
public class Employee_ { 

    public static volatile SingularAttribute<Employee, String> address;
    public static volatile SingularAttribute<Employee, Boolean> gender;
    public static volatile SingularAttribute<Employee, String> phone;
    public static volatile SingularAttribute<Employee, String> name;
    public static volatile SetAttribute<Employee, Bill> billSet;
    public static volatile SingularAttribute<Employee, Date> birth;
    public static volatile SetAttribute<Employee, Trip> tripSet;
    public static volatile SingularAttribute<Employee, Integer> id;
    public static volatile SingularAttribute<Employee, String> avatar;
    public static volatile SingularAttribute<Employee, User> userId;

}