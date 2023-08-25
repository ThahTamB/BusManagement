package com.btt.pojo;

import com.btt.pojo.Company;
import com.btt.pojo.Provinces;
import com.btt.pojo.Route;
import com.btt.pojo.Station;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2023-08-19T16:18:45")
@StaticMetamodel(Districts.class)
public class Districts_ { 

    public static volatile SingularAttribute<Districts, String> code;
    public static volatile SetAttribute<Districts, Route> routeSet1;
    public static volatile SingularAttribute<Districts, Provinces> provinceCode;
    public static volatile SingularAttribute<Districts, String> name;
    public static volatile SingularAttribute<Districts, String> codeName;
    public static volatile SingularAttribute<Districts, String> fullName;
    public static volatile SingularAttribute<Districts, String> nameEn;
    public static volatile SetAttribute<Districts, Route> routeSet;
    public static volatile SetAttribute<Districts, Company> companySet;
    public static volatile SingularAttribute<Districts, String> fullNameEn;
    public static volatile SetAttribute<Districts, Station> stationSet;

}