# Micro Proyecto final curso. Gestión de Zoológico

- Creamos una carpeta: exam-java fuera de la carpeta utilizada durante el curso
- Añadimos un fichero readme.md con un título
- Añadimos un fichero .gitignore para Java-Maven
- Creamos un repositorio de git
- Añadimos un commit de mensaje: "Initial commit"
- Lo vinculamos con nuestro github en el repo: "exam-java"
- Añadimos un nuevo proyecto JAV-Maven archetype: QuickStart:
  - group id: "com.cdsb"
  - name: "exam"
- Añadimos un nuevo commit: "Add project"
- Lo subimos a GitHub

# Gestión de Zoológico: requisitos

Los requisitos que nos llegan del cliente son los siguientes:

- Tengo un zoológico (zoo) y quiero un sistema que me ayude a gestionarlo
- Voy a gestionar una combinación de

  - mamíferos (mammals) (como leones (lions), elefantes (elephants) o cebras (zebras))
  - aves (birds) (loros (parrots), tucanes (toucans))
  - reptiles (reptiles) (serpientes (snakes), iguanas (iguanas))
  - animales acuáticos (aquatic animals) (delfines (dolphins), focas (seals))

- Algunos animales (animals) pueden convivir en grupos, y otros deben mantenerse solos.

- Cada especie tiene sus propios requisitos

  - de espacio (tamaño del hábitat que necesitan)
  - de alimentación (tipo de dieta, frecuencia)
  - de cuidados veterinarios específicos

- Hay animales que son compatibles (pueden compartir el mismo hábitat (habitat)) y otros que no. De otros, no sabemos.

- La compatibilidad entre animales (animals) depende de

  - su comportamiento natural (depredador/presa)
  - del tipo de hábitat que necesitan

- Suelen ser fácilmente combinables animales de similar comportamiento y hábitat (herbívoros como elefantes (elephants) con cebras (zebras), aves tropicales como loros (parrots) con tucanes (toucans), o animales acuáticos sociales como delfines (dolphins) con focas (seals)),
  pero no depredadores con presas (león (lion) con elefante (elephant) o cebra (zebra)), ni reptiles territoriales que prefieren estar solos (serpientes (snakes) e iguanas (iguanas) deben mantenerse separadas)

- En el zoológico, tengo disponibles varios tipos de hábitats (habitats), de distintos tamaños (terrestre (terrestrial), acuático (aquatic), terrario (terrarium)).

Se trata de hacer un programa en Java que permita gestionar el zoológico, de acuerdo con las indicaciones dadas por el cliente.
