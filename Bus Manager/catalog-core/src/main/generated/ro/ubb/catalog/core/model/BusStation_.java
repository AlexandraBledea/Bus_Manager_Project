package ro.ubb.catalog.core.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(BusStation.class)
public abstract class BusStation_ extends ro.ubb.catalog.core.model.BaseEntity_ {

	public static volatile SingularAttribute<BusStation, City> city;
	public static volatile SingularAttribute<BusStation, String> name;
	public static volatile SetAttribute<BusStation, BusStop> stops;

	public static final String CITY = "city";
	public static final String NAME = "name";
	public static final String STOPS = "stops";

}

