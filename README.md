# CRUD JSP con MySQL

Aplicación web básica para operaciones CRUD (Crear, Leer, Actualizar, Borrar) usando JSP y MySQL, desarrollada en Eclipse.

## Requisitos

- Java JDK 8+
- Apache Tomcat
- MySQL
- JDBC Driver para MySQL

## Instalación

1. **Base de Datos**:
   Ejecuta el siguiente SQL en MySQL:

   ```sql
   CREATE DATABASE ejemplo_db;
   USE ejemplo_db;
   CREATE TABLE invitados (
       id INT AUTO_INCREMENT PRIMARY KEY,
       nombre VARCHAR(50),
       apellido VARCHAR(50)
   );
 2. **Configurar Eclipse**:
Importar Proyecto: Abre Eclipse y selecciona File > Import > Existing Projects into Workspace.
Añadir JAR: Coloca mysql-connector-java en lib dentro de WebContent/WEB-INF.
Despliegue:

 3. **Servidor**: Configura Apache Tomcat en Eclipse (Servers view).
Despliegue: Añade el proyecto al servidor y arráncalo.
 4. **Uso**: Accede a http://localhost:8080/tu-proyecto/index.jsp para gestionar invitados.
