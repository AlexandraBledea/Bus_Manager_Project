package ro.ubb.catalog.core.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(BusStop.class)
public abstract class BusStop_ {

	public static volatile SingularAttribute<BusStop, Bus> bus;
	public static volatile SingularAttribute<BusStop, BusStation> station;
	public static volatile SingularAttribute<BusStop, String> stopTime;

	public static final String BUS = "bus";
	public static final String STATION = "station";
	public static final String STOP_TIME = "stopTime";

}

