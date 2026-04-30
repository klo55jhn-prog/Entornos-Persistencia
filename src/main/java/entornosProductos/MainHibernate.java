package entornosProductos;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
public class MainHibernate {
    public static void main(String[] args) {
        // Configuración de la sesión[cite: 1]
    	// Cambia lo que tengas en la línea 10 por esto:
    	SessionFactory factory = new Configuration().configure().addAnnotatedClass(Producto.class).buildSessionFactory();
    	// Cambia esto
    	// Session session = factory.getCurrentSession(); 

    	// Por esto
    	Session session = factory.openSession();

        try {
            Producto temp = new Producto("Teclado Mecánico", 85.0);
            session.beginTransaction();
            session.save(temp); // Hibernate genera el SQL automáticamente[cite: 1]
            session.getTransaction().commit();
            System.out.println("¡Producto guardado correctamente!");
        } finally {
            factory.close();
        }
    }
}