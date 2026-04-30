## 💻 Ejecución del Sistema

Para poner en marcha el proyecto, solo tienes que ejecutar la clase `MainHibernate.java` como **Java Application**. 

Al arrancar, el motor de Hibernate gestiona el ciclo de vida de forma automática:
1. 🔌 **Handshake**: Establece la conexión segura con el servidor MySQL.
2. 🏗️ **Auto-Schema**: Gracias a `hbm2ddl.auto`, crea la tabla `productos` si no existe en tu BD.
3. 💾 **Persistencia**: Mapea el objeto Java, ejecuta el `INSERT` y muestra el rastro SQL en la consola.

---

## 📝 Conclusiones y Comparativa: Hibernate vs JDBC

> [!TIP]
> Tras el desarrollo, queda claro que el uso de un framework **ORM** es el estándar en la industria por tres razones críticas:

*   **⚡ Productividad Elevada**: En JDBC pierdes tiempo mapeando cada campo a mano. En Hibernate, las anotaciones `@Entity` y `@Column` hacen el trabajo sucio por ti.
*   **🛠️ Mantenimiento Ágil**: Si cambias un nombre en la base de datos, solo tocas una clase Java. En JDBC tendrías que buscar y reemplazar strings de SQL en todo el proyecto.
*   **🌍 Independencia del Motor (Dialectos)**: Puedes saltar de **MySQL** a **PostgreSQL** o **Oracle** cambiando una línea en el `cfg.xml`. Con JDBC, tendrías que reescribir gran parte de tus queries.

---

## 🏁 Conclusión Final (DAM)

Como estudiante de **DAM**, mi conclusión es que Hibernate es una herramienta clave. Aunque la curva de aprendizaje inicial con Maven y el XML de configuración es un poco más empinada que con JDBC, **el ahorro de tiempo a largo plazo es brutal**. 

Lo que más destaco es la capacidad de tratar los datos como **objetos reales** y no como simples filas de texto. Esto hace que el código sea mucho más profesional, escalable y, sobre todo, menos propenso a los típicos errores de sintaxis de SQL manual. **Merece la pena el esfuerzo inicial por la limpieza que aporta al proyecto.**

---

## 👤 Autor

| Nomre | Rol | GitHub |
| :--- | :--- | :--- |
| **Carlos** | Lead Developer - DAM | [@tu-usuario](https://github.com/tu-usuario) |

---

En resumen: Aunque configurar Hibernate al principio (Maven, dependencias y el XML) es un poco más lío que JDBC, merece totalmente la pena para cualquier proyecto que sea un poco grande por lo fácil que hace el mantenimiento y la escalabilidad de la aplicación.
