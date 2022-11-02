package homework_5;

import hibernate.HibernateException;
import hibernate.SessionFactory;
import hibernate.cfg.AnnotationConfiguration;

public class HibernateUtil {
    private static SessionFactory factory;


    static {
        try {
            factory = new Configuration()
                    .configure("ex_002_config.xml")
                    .buildSessionFactory();
        } catch (HibernateException e) {
            e.printStackTrace();
        }
    }

    public static SessionFactory getSessionFactory() {
        return factory;
    }
}
