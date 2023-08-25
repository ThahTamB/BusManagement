package com.btt.pojo;

import com.btt.pojo.Company;
import com.btt.pojo.Districts;
import com.btt.pojo.Station;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2023-08-19T16:18:45")
@StaticMetamodel(Provinces.class)
public class Provinces_ { 

    public static volatile SingularAttribute<Provinces, String> code;
    public static volatile SetAttribute<Provinces, Districts> districtsSet;
    public static volatile SingularAttribute<Provinces, String> name;
    public static volatile SingularAttribute<Provinces, String> codeName;
    public static volatile SingularAttribute<Provinces, String> fullName;
    public static volatile SingularAttribute<Provinces, String> nameEn;
    public static volatile SetAttribute<Provinces, Company> companySet;
    public static volatile SingularAttribute<Provinces, String> fullNameEn;
    public static volatile SetAttribute<Provinces, Station> stationSet;

}