# Java Dependency Injection JSR-330

[![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)](https://www.java.com/es/)
[![Maven](https://img.shields.io/badge/Apache_Maven-C71A36?style=for-the-badge&logo=apachemaven&logoColor=white)](https://maven.apache.org/)

Un pequeño ejemplo de como usar inyección de dependencias en Java mediante la API `jakarta.inject` y la implementación [**Weld SE**](https://weld.cdi-spec.org/).

[**Weld SE**](https://weld.cdi-spec.org/) es una implementación del CDI (Context and Dependency Injection) en Java SE. La especificación CDI se basa en JSR-330 para la inyección de dependencias, que permite inyectar dependencias en objetos sin necesidad de crear instancias explícitamente en el código.

## Componentes

- **`HelloWorldPrinter`:** Interfaz que define el metodo `print` para imprimir un Hello World
- **`HelloWorldPrinterCapitalize`:** Implementación de `HelloWorldPrinter` que imprime el Hello World en formato de capitalización.
- **`HelloWorldPrinterUppercase`:** Implementación de `HelloWorldPrinter` que imprime el Hello World en formato de mayúsculas.
- **`HelloWorldClient`:** Cliente que inyecta todas las implementaciones de `HelloWorldPrinter` y llama el metodo `print` de cada una.
