package com.btt.pojo;

import com.btt.pojo.Trip;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2023-08-19T16:18:45")
@StaticMetamodel(Bus.class)
public class Bus_ { 

    public static volatile SingularAttribute<Bus, String> licensePlate;
    public static volatile SetAttribute<Bus, Trip> tripSet;
    public static volatile SingularAttribute<Bus, Integer> id;

}