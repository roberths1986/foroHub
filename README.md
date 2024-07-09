🌟 #ForoHub

⚠️ **Nota: Este proyecto aún está en construcción. Faltan por desarrollar los endpoints para usuarios y respuestas.**

##Bienvenido a ForoHub, una aplicación de foro en línea construida con Spring Boot. ForoHub permite a los usuarios registrarse, iniciar sesión, crear y responder a temas de discusión.

📋 ##Tabla de Contenidos 
- Introducción 
- Características 
- Instalación 
- Configuración 
- Uso 
- Arquitectura 
- Contribuciones 
- Licencia

📖 ##Introducción

ForoHub es una plataforma de foros donde los usuarios pueden discutir diversos temas. Esta aplicación utiliza Spring Boot para proporcionar un backend.

✨ ##Características

- **Registro e inicio de sesión de usuarios:** Los usuarios pueden registrarse y autenticarse en la aplicación. 
- **Gestión de temas:** Crear, leer, actualizar y eliminar (CRUD) temas de discusión. 
- **Seguridad:** Implementación de seguridad con JWT para proteger las rutas de la API. 
- **Manejo de errores:** Mecanismo de manejo de errores centralizado para proporcionar respuestas de error claras y consistentes. 
- **Documentación API:** Integración con SpringDoc para la generación automática de documentación de la API.

🚀 ##Instalación

Para instalar y ejecutar ForoHub en tu entorno local, sigue estos pasos:

1. Clona el repositorio:
```
git clone https://github.com/tu-usuario/foroHub.git
```

2. Navega al directorio del proyecto:
```
cd foroHub
```

3. Construye el proyecto con Maven:
```
./mvnw clean install
```

4. Ejecuta la aplicación:
```
./mvnw spring-boot:run
```

🛠️ ##Configuración

ForoHub utiliza un archivo de configuración **application.properties** para gestionar la configuración de la aplicación. Puedes encontrar este archivo en el directorio **src/main/resources.**

Asegúrate de configurar correctamente la base de datos y otros parámetros necesarios. Aquí tienes un ejemplo de configuración:
```
spring.datasource.url=jdbc:mysql://localhost:3306/foroHub
spring.datasource.username=tu-usuario
spring.datasource.password=tu-contraseña
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
jwt.secret=tu-secreto-jwt
```

📌 ###Uso

Una vez que la aplicación esté en funcionamiento, puedes acceder a la API a través de las siguientes rutas principales:

- **Autenticación:**
  - **POST /login:** Registrar un nuevo usuario. 
  - **POST /login:** Iniciar sesión y obtener un token JWT.
  
- **Temas:**
  - **POST /topicos:** Crear un nuevo tema. 
  - **GET /topicos:** Obtener una lista de todos los temas.
  - **GET /topicos/{id}:** Obtener detalles de un tema específico.
  - **PUT /topicos/{id}:** Actualizar un tema.
  - **DELETE /topicos/{id}:** Eliminar un tema.
  

  Para ver la documentación completa de la API, visita **http://localhost:8080/swagger-ui.html** una vez que la aplicación esté en funcionamiento.

🏗️ ##Arquitectura

ForoHub está organizado en los siguientes módulos principales:

- **Dominio:** Contiene las clases de entidades y repositorios.
- **Controladores:** Gestiona las solicitudes HTTP y coordina las respuestas.
- **Servicios:** Contiene la lógica de negocio de la aplicación.
- **Seguridad:** Gestiona la autenticación y autorización mediante JWT.
- **Configuración:** Configuración de Spring y otras bibliotecas.

📂 ##Estructura del Proyecto
```
foroHub
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com
│   │   │       └── alurachallenge
│   │   │           └── api
│   │   │               └── foroHub
│   │   │                   ├── controllers
│   │   │                   ├── domain
│   │   │                   ├── infra
│   │   │                   └── services
│   │   └── resources
│   │       ├── application.properties
│   │       └── db
│   │           └── migration
│   └── test
│       └── java
│           └── com
│               └── alurachallenge
│                   └── api
│                       └── foroHub
├── mvnw
├── mvnw.cmd
├── pom.xml
└── README.md
```

🤝 ##Contribuciones

¡Las contribuciones son bienvenidas! Si deseas contribuir a ForoHub, sigue estos pasos:

1. Haz un fork del repositorio. 
2. Crea una nueva rama para tu característica **(git checkout -b feature/nueva-caracteristica).**
3. Realiza tus cambios y haz commit **(git commit -m 'Añadir nueva característica').** 
4. Sube tus cambios **(git push origin feature/nueva-caracteristica).**
5. Abre una Pull Request.


🛠️ ##Tecnologías

🌟 ###Tecnologías Principales

- **Spring Boot:** Framework principal para la creación de aplicaciones Java.
- **Spring Security:** Para la implementación de la seguridad de la aplicación.
- **Spring Data JPA:** Para la interacción con la base de datos.
- **MySQL:** Base de datos relacional utilizada para almacenar los datos.

🌐 ###Tecnologías Secundarias

- **JWT (JSON Web Tokens):** Para la autenticación y autorización.
- **Lombok:** Biblioteca para reducir el código Java.
- **SpringDoc OpenAPI:** Para la generación automática de la documentación de la API.
- **Flyway:** Para la migración de la base de datos.

📦 ###Dependencias

Estas son algunas de las dependencias clave utilizadas en el proyecto:

- **spring-boot-starter-data-jpa**
- **spring-boot-starter-security** 
- **spring-boot-starter-web** 
- **spring-boot-starter-validation** 
- **spring-boot-starter-test** 
- **mysql-connector-java** 
- **jjwt** 
- **lombok** 
- **springdoc-openapi-ui**
- **flyway-core**