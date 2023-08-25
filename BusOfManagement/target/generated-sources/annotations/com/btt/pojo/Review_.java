package com.btt.pojo;

import com.btt.pojo.Station;
import com.btt.pojo.User;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2023-08-19T16:18:45")
@StaticMetamodel(Review.class)
public class Review_ { 

    public static volatile SingularAttribute<Review, Date> dateAcquired;
    public static volatile SingularAttribute<Review, Integer> star;
    public static volatile SingularAttribute<Review, Integer> id;
    public static volatile SingularAttribute<Review, User> userId;
    public static volatile SingularAttribute<Review, String> content;
    public static volatile SingularAttribute<Review, Station> stationId;

}