# Maceta Huerto

Los requisitos que nos llegan del cliente son los siguientes:

- Tengo un huerto (garden) urbano en las ventanas de mi casa y quiero un sistema que me ayude a gestionarlo
- Voy a hacer una combinación de

  - hierbas aromáticas (aromatic plants) (como el hinojo (fennel) o el perejil (parsley))
  - plantas de hoja (leaf plants) (lechuga (lettuce), canónigos (corn salad))
  - plantas de raíz (root plants) (rabanitos (radish), zanahorias (carrot))
  - plantas de fruto (fruit plants) (tomates (tomato), pimientos (pepper))

- Algunas plantas (plants) necesitan ser sembradas en semillero, y otras se pueden plantar directamente.

- Cada especie tiene sus propios requisitos

  - de espacio (volumen de sustrato que necesitan, distancia entre plantas, etc.)
  - de riego
  - sus tiempos de germinación
  - trasplante (si se plantaron en semillero)
  - recolección

- Hay cultivos que son compatibles (pueden plantarse en la misma maceta (pot)) y otros que no.De otros, no sabemos

- La compatibilidad entre plantas (plants) depende de

  - los nutrientes que consumen
  - del espacio que necesitan

- Suelen ser fácilmente combinables una planta de raíz (root plant), con una de hoja (leaf plant), con una de fruto (fruit plant) (lechuga (lettuce) con tomate (tomato) y zanahoria (carrot)),
  pero no dos del mismo tipo (lechuga (lettuce) con canónigos (corn salad))

- En el huerto, tengo disponibles varias jardineras (pots), de distintos tamaños y formas (rectangular, tubular).

Se trata de hacer un programa en Java que permita gestionar el huerto, de acuerdo con las indicaciones dadas por el cliente.

## Interfaces

- `Pot`: interfaz que define los métodos necesarios para gestionar una maceta.
- `Plant`: interfaz que define los métodos necesarios para gestionar una planta.
- `Garden`: interfaz que define los métodos necesarios para gestionar el huerto y sus macetas.

## Clases

- `App`: clase principal que contiene el método `main` y gestiona la interacción con el usuario.
- `Garden`: representa el huerto en sí, con sus jardineras y plantas. Implementa la interfaz `Garden`.

- abstract `Pot`: representa una maceta, con su volumen, forma, etc. Implementa la interfaz `Pot`.
  - clase hija `RectangularPot`: representa una maceta rectangular, con su largo, ancho y alto.
  - clase hija `TubularPot`: representa una maceta tubular, con su diámetro
- abstract `Plant`: representa una planta, con su tipo (hoja, raíz, fruto), requisitos de espacio, riego, etc. Implementa la interfaz `Plant`.
  - clase hija `AromaticPlant`: representa una planta aromática, con sus requisitos específicos.
    - clase hija `Fennel`: representa el hinojo, con sus requisitos específicos.
    - clase hija `Parsley`: representa el perejil, con sus requisitos
  - clase hija `LeafPlant`: representa una planta de hoja, con sus requisitos específicos.
    - clase hija `Lettuce`: representa la lechuga, con sus requisitos específicos.
    - clase hija `CornSalad`: representa los canónigos, con sus requisitos específicos.
  - clase hija `RootPlant`: representa una planta de raíz, con sus requisitos específicos.
    - clase hija `Radish`: representa el rabanito, con sus requisitos específicos.
    - clase hija `Carrot`: representa la zanahoria, con sus requisitos específicos.
  - clase hija `FruitPlant`: representa una planta de fruto, con sus requisitos específicos.
    - clase hija `Tomato`: representa el tomate, con sus requisitos específicos.
    - clase hija `Pepper`: representa el pimiento, con sus requisitos específicos.

## Enums

- `PlantType`: enum que define los tipos de planta (aromática, hoja, raíz, fruto).
- `PotType`: enum que define los tipos de maceta (rectangular, tubular).
- `Species`: enum que define las especies de plantas (hinojo, perejil, lechuga, canónigos, rabanito, zanahoria, tomate, pimiento).

---
