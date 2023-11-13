# Clean Architecture Spring Boot API

Este proyecto es una API REST de ejemplo que utiliza Spring Boot y Java 21 para implementar la Clean Architecture. Proporciona las funcionalidades básicas de un CRUD para la gestión de productos, códigos de barras y categorías.

## Características

- **API RESTful:** Utiliza el estándar REST para la exposición de servicios web, lo que facilita la integración con otras aplicaciones.

- **Operaciones CRUD:** Permite realizar las operaciones básicas de Crear, Leer, Actualizar y Eliminar (CRUD) en productos, códigos de barras y categorías.

## Clonar el Repositorio

Para clonar este repositorio y ejecutar el proyecto en tu máquina local, sigue estos pasos:

```bash
git clone https://github.com/tuusuario/tu-proyecto.git
cd tu-proyecto
```

## Ejecución del Programa
Asegúrate de tener Java 21 instalado en tu sistema antes de ejecutar la aplicación. Puedes verificar la versión de Java con el siguiente comando:

```bash
java -version
```
Si no tienes Java 21 instalado, te recomendamos instalarlo antes de continuar.

## Configuración
Antes de ejecutar la aplicación, asegúrate de configurar la base de datos y otros parámetros en el archivo `application.yml`. 
Puedes configurar la base de datos, el puerto en el que se ejecutará la aplicación y otros ajustes según tus necesidades.

## Ejecución con Maven
Puedes ejecutar la aplicación utilizando Maven. Abre una terminal en la carpeta del proyecto y ejecuta el siguiente comando:
```bash
./mvnw spring-boot:run
```

La aplicación se ejecutará en el puerto predeterminado (generalmente 8080). Puedes acceder a la API a través de `http://localhost:8080`.

## Contribuciones
¡Las contribuciones son bienvenidas! Si deseas colaborar en este proyecto, no dudes en abrir una solicitud de extracción (pull request) o informar problemas (issues) en el repositorio.
