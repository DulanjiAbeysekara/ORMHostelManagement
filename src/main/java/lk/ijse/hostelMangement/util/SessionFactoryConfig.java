package lk.ijse.hibernate.hostel.util;


//import lk.ijse.hibernate.hostel.entity.Reservation;
//import lk.ijse.hibernate.hostel.entity.Room;
//import lk.ijse.hibernate.hostel.entity.Student;
//import lk.ijse.hibernate.hostel.entity.User;
import lk.ijse.hostelMangement.entity.Reservation;
import lk.ijse.hostelMangement.entity.Room;
import lk.ijse.hostelMangement.entity.Student;
import lk.ijse.hostelMangement.entity.User;
import lk.ijse.hostelMangement.util.Util;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.model.naming.ImplicitNamingStrategyJpaCompliantImpl;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import java.io.IOException;
import java.util.Properties;


public class SessionFactoryConfig {

    private static SessionFactoryConfig factoryConfiguration;
    private final SessionFactory sessionFactory;


    private SessionFactoryConfig() {
        sessionFactory = new Configuration ()
                .mergeProperties(Util.getProperties())
                .addAnnotatedClass(Student.class)
                .addAnnotatedClass(Room.class)
                .addAnnotatedClass(Reservation.class)
                .addAnnotatedClass(User.class)
                .buildSessionFactory();
    }


    public static SessionFactoryConfig getInstance() {
        return (null == factoryConfiguration)
                ? factoryConfiguration = new SessionFactoryConfig()
                : factoryConfiguration;
    }


    public Session getSession() throws HibernateException {
        return sessionFactory.openSession();
    }


}
