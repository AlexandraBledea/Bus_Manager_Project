package ro.ubb.catalog.core.model;

import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Bus.class)
public abstract class Bus_ extends ro.ubb.catalog.core.model.BaseEntity_ {

	public static volatile SingularAttribute<Bus, String> modelName;
	public static volatile SingularAttribute<Bus, Driver> driver;
	public static volatile SingularAttribute<Bus, String> fuel;
	public static volatile SetAttribute<Bus, BusStop> stops;
	public static volatile SingularAttribute<Bus, Integer> capacity;

	public static final String MODEL_NAME = "modelName";
	public static final String DRIVER = "driver";
	public static final String FUEL = "fuel";
	public static final String STOPS = "stops";
	public static final String CAPACITY = "capacity";

}

