package com.btt.pojo;

import com.btt.pojo.Districts;
import com.btt.pojo.Provinces;
import com.btt.pojo.Station;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2023-08-19T16:18:45")
@StaticMetamodel(Company.class)
public class Company_ { 

    public static volatile SingularAttribute<Company, Districts> districtsCode;
    public static volatile SingularAttribute<Company, String> address;
    public static volatile SingularAttribute<Company, String> name;
    public static volatile SingularAttribute<Company, Integer> id;
    public static volatile SingularAttribute<Company, String> avatar;
    public static volatile SingularAttribute<Company, Provinces> provincesCode;
    public static volatile SetAttribute<Company, Station> stationSet;

}