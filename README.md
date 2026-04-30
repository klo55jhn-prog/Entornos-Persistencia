💻 Ejecución
Para ejecutar el proyecto, simplemente corre la clase MainHibernate.java.
Hibernate realizará las siguientes acciones automáticamente:

Conectará con el servidor MySQL.

Creará la tabla productos si no existe (hbm2ddl.auto=update).

Insertará un nuevo registro y mostrará el log del SQL en consola.

📝 Conclusiones y Comparativa (Hibernate vs JDBC)
Tras la realización de este proyecto, se extraen las siguientes conclusiones sobre la conveniencia de usar un framework ORM:

Productividad Elevada: A diferencia de JDBC, donde cada consulta SQL debe escribirse manualmente y mapearse campo a campo, Hibernate realiza este proceso de forma automática basándose en las anotaciones de la clase Java.

Mantenimiento: El código es mucho más limpio y fácil de mantener. Si la estructura de la base de datos cambia, solo es necesario actualizar la entidad en Java, en lugar de revisar decenas de cadenas de texto SQL dispersas por el código.

Abstracción del Dialecto: Hibernate permite cambiar de base de datos (por ejemplo, pasar de MySQL a PostgreSQL) simplemente cambiando una línea en el archivo de configuración, sin tocar una sola línea de código Java.

Reflexión Final: Aunque JDBC ofrece un control total y un rendimiento ligeramente superior en operaciones muy simples, Hibernate es la opción más conveniente para aplicaciones modernas orientadas a objetos por su capacidad de escalabilidad y reducción de errores humanos.

👤 Autor
Tu Nombre: Carlos
🏁 Conclusión Final
Tras completar la Tarea UD17, la conclusión es clara: Hibernate le da mil vueltas a JDBC en cuanto a comodidad y limpieza de código.

Ahorro de tiempo: Lo mejor ha sido no tener que escribir ni un solo INSERT o UPDATE a mano; el mapeo por anotaciones (@Entity) se encarga de todo y evita errores típicos de sintaxis en el SQL.

Código más profesional: Usar un ORM permite que el código de la aplicación sea mucho más legible, tratando los datos como objetos reales y no como simples filas de una tabla.

Flexibilidad: El uso del archivo hibernate.cfg.xml permite que, si mañana queremos cambiar de MySQL a otra base de datos, no tengamos que tocar ni una línea de la lógica del programa, solo cambiar el dialecto.

En resumen: Aunque configurar Hibernate al principio (Maven, dependencias y el XML) es un poco más lío que JDBC, merece totalmente la pena para cualquier proyecto que sea un poco grande por lo fácil que hace el mantenimiento y la escalabilidad de la aplicación.
