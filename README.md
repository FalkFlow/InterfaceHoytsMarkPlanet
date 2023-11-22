# InterfaceHoytsMarkPlanet

## Preparacion

Se realizo la conexión de base de datos en el sistema de oracle, expresamente el Oracle Database 21c Express edition, luego de la instalación de estas nos conectamos con el usuario ´SYSTEM´
al entrar en lahoja de trabajo deberemos escribir lo 
siguiente:
```SQL
  ALTER SESSION SET "_ORACLE_SCRIPT" = TRUE;

  CREATE USER test_connetion IDENTIFIED BY "test_123";
  GRANT "CONNECT" TO test_connetion;
  GRANT CREATE SESSION TO text_connetion;
  GRANT CREATE SEQUENCE TO text_connetion;
  GRANT CREATE TRIGGER TO text_connetion;

  ALTER USER "TEST_CONNETION" QUOTA UNLIMITED ON "SYSTEM";
  ALTER USER "TEST_CONNTION" QUOTA UNLMTED ON "USERS";
```

esto es para crear un usuario, luego de crear el usuario e ingresar a este creamos la tabla, en este caso ocuparemos la mala practica de escribir el nombre de la tabla en plural.
```SQL
  CREATE TABLE peliculas(
  ID INT NOT NULL,
  titulo VARCHAR2(60) NOT NULL,
  annio INT NOT NULL,
  director VARCHAR2(60),
  genero VARCHAR2(60) NOT NULL,
  duracion INT
  );

  ALTER TABLE peliculas
    ADD CONSTRAINT id_pk PRIMARY KEY (id);
```

con esto crearemos la tabla peliculas con id como primary key por lo cual ningun id puede ser vacia y tambien tiene que ser unica, entonces ahora haremos lo siguiente en oracle
```SQL
  CREATE SEQUENCE id_inc
  START WITH 1
  INCREMENT BY 1;

  CREATE TRIGGER trig_id_inc
  BEFORE INSERT ON peliculas
  FOR EACH ROW
  BEGIN
    SELECT id_inc.NEXTVAL INTO :NEW.ID FROM DUAL;
  END;
```
con esto tendremos id automatico al momento de ingresar peliculas.

## APACHE
ahora en netbeans en la parte donde esta los archivos del projecto se encuentra un barra superior clickearemos en servicios o services, expandemos databases, click derecho en driver, click en newdrive y buscamos
nuestro ojdbc11.jar el cual ocupamos nosotros, cabe mencionar que es compatible con los JDK desde el 11 hasta el 20. el cual hara aparecer la opcion ORACLE THIN (1), click derecho sobre este y apretaremos la primera opcion,
en la cual modificaremos el user name de hr a test_connetion y la pass en test_123, con esto estamos con la conexion lista para usar la app luego solo basta correr el projecto y esta listo.
