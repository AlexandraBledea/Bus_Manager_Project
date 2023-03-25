package ro.ubb.catalog.core.model;

import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(City.class)
public abstract class City_ extends ro.ubb.catalog.core.model.BaseEntity_ {

	public static volatile SingularAttribute<City, String> name;
	public static volatile SetAttribute<City, BusStation> stations;
	public static volatile SingularAttribute<City, Integer> population;

	public static final String NAME = "name";
	public static final String STATIONS = "stations";
	public static final String POPULATION = "population";

}

