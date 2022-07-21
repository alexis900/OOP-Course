# Programación Orientada a Objetos

## ¿Que resuelve?

- Resuelve problemas que la programación estructurada se deja.
- Resuelve códigos muy largos.
- Resuelve fallos si solo falla una parte.
- Resuelve la facilidad de mantenimiento.

## Paradigma

La Orientación a Objetos surge a partir de los problemas y poder plasmar el código, tenemos que observar nuestros problemas en forma de objetos.

### Composición de la POO

- Clases
- Propiedades
- Métodos
- Objetos

Encapsulamiento
Abstracción - Nosotros abstraemos los datos de un objeto para generar un molde.
Herencia
Polimorfismo

## ¿Como plasmar nuestro análisis?

### OMT (Object Modeling Techniques)

Metodologia para el análisis para la POO. Este está desconinuado, se debe usar UML.

- Clases
- Objetos

### UML (Unified Modeling Language)

Es la representación grafica para representar una situcación.

- Clases:
En la parte superior se colocan atributos y propiedades. El primer símbolo representa si es una clase pública (+) o privada (-).
![Clases](https://static.platzi.com/media/user_upload/clase-1897e6cf-84b3-4432-926b-aff4fc4db122.jpg)

- Asociación:
![Asociación](https://static.platzi.com/media/user_upload/associacion-d2e1b691-b6e9-4854-85e2-d3ffdf0a9049.jpg)

Este elemento contiene al otro

- Herencia:
Este tipo de flecha siempre expresa herencia. La dirección va desde el hijo hacia el padre.
![Herencia](https://static.platzi.com/media/user_upload/herencia-2eb98d5e-bcad-4162-b236-aa87eba20e76.jpg)
![HerenciaModelo](https://static.platzi.com/media/user_upload/herencia-clases-53cb3117-def7-433f-adc5-4ad183d6b5e7.jpg)

- Agregación:
Es un elemento que depende de muchos otros. ClaseA contiene varios elementos de la ClaseB.

![Agregacion](https://static.platzi.com/media/user_upload/agregacion-6489d946-cc06-4e3c-a976-f6435531b4f2.jpg)

![AgregacionEjemplo](https://static.platzi.com/media/user_upload/uml-relacion-agregacion-adb20be8-d6c2-41d1-b002-2cfa37639240.jpg)

- Composición:
Es una relación compenetrada. Una de estas clases no podria vivir si no existe la otra.
![Composicion](https://static.platzi.com/media/user_upload/composicion-1da1dd19-6925-42d9-9727-7fd8cb031b0c.jpg)
![ComposicionEjemplo](https://static.platzi.com/media/user_upload/uml-relacion-composicion-2d4cb1fa-5422-44e3-849b-3a3e2d276733.jpg)

## Objetos

Cuando tengamos problemas, tendremos que identificar Objetos

Estos objetos son aquellos que tienen propiedades y comportamientos. Estos serán substantivos. Estos pueden ser fisicos o conceptuales.

### Propiedades

También llamadas **atributos** serán substantivos.

### Comportamientos

Serán todas las operaciones del objeto, donde suelen ser verbos o substantivo y verbos.

## Clases

Es el modelo sobre el cual se construyen nuestros objetos. Tenemos que analizar los objetos para crear las clases.

### Diseño modular

Dividir els sistema y crear modulos independientes, lo que permite evitar el colapso.

Nos permite:

- Reutilizar código
- Evitar colapsos
- Mantenible
- Legibilidad
- Resolución rápida de problemas

## DRY: Don't repeat yourself

Reduce la duplicación en la programación.
Nunca deberia de ser duplicada la información, ya que se incrementa la dificultad en los cambios.

### Herencia

Podemos crear nuevas clases a partir de otras.

Se establece una relación padre e hijo, también llamadas súperclase y subclase.

### Método constructor

Es un método para dar el estado inicial del objeto, donde tendrá el mismo nombre que la clase. Este tendrá los parámetros mímimos para que el objeto pueda crearse.
