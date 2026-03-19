# Laboratorio BDD parte 2 - Laboratorio #4

## Arquitectura Centrada en el Negocio (ARCN)

## Nicolás Toro Criollo

En este repositorio se busca solución el laboratorio propuesto en el link [BDD parte 2](https://eci-arcn.github.io/Labs/bdd-part2/)
incorporando el uso del patrón Page Object Model (POM) junto con PageFactory para mejorar la mantenibilidad, escalabilidad y claridad del código de pruebas automatizadas.

---

## Requisitos Previos
- Java 17+
- Maven
- GitHub Codespaces
- JUnit 5 para pruebas

---

## Estructura del proyecto

```bash
src
├── main
│   └── java
│       └── com
│           └── example
│               └── App.java
└── test
    ├── java
    │   ├── com
    │   │   └── example
    │   │       └── AppTest.java
    │   ├── pages
    │   │   ├── CheckboxPages.java
    │   │   └── LoginPage.java
    │   ├── runners
    │   │   └── TestRunner.java
    │   └── steps
    │       ├── CheckboxSteps.java
    │       ├── LoginSteps.java
    │       └── SearchSteps.java
    └── resources
        ├── cucumber.properties
        └── features
            ├── auth.feature
            ├── checkboxes.feature
            └── google_search.feature
```

## Proceso realizado

1. Se implementó el feature de Checkbox, se pueden encontrar las características de la funcionalidad detalladamente en *checkboxes.feature*

2. Posterior a eso, se creo el Page Objeto *CheckBoxPage.java* donde se lozaliza a los elementos, encapsula las acciones y gestiona los estados de los checkboxes.

3. Después se definieron los steps de la funcionalidad en *CheckboxSteps*, siendo este el responsable de mapear los pasos de Gherkin a código, emplear métodos del Page Object que se creó anteriormente y validar que los resultados sean los correctos.


