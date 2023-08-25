package com.btt.pojo;

import com.btt.pojo.Company;
import com.btt.pojo.Districts;
import com.btt.pojo.Provinces;
import com.btt.pojo.Review;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2023-08-19T16:18:45")
@StaticMetamodel(Station.class)
public class Station_ { 

    public static volatile SingularAttribute<Station, Districts> districtsCode;
    public static volatile SingularAttribute<Station, Company> companyId;
    public static volatile SingularAttribute<Station, String> address;
    public static volatile SetAttribute<Station, Review> reviewSet;
    public static volatile SingularAttribute<Station, Integer> id;
    public static volatile SingularAttribute<Station, Provinces> provincesCode;

}