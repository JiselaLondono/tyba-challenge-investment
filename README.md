# tyba-challenge-investment

El proyecto tyba-challenge-investment contiene en la actualidad la implementación de un programa que brinda una orientación al usuario sobre cuál producto invertir, de acuerdo al monto de inversión aplicado.

Para este programa se utlizaron algunos componentes de la librería de swing de Java, la cual nos provee varias opciones para la implementación de Interfaz gráfica. En este caso se hizo gran uso de JOptionPane, y de otras para complementar los formularios como JTextField, JComboBox y JLabel.

### **Requisitos de negocio y funcionamiento**

- El programa solicita inicialmente el nombre, apellido del cliente y el tipo de documento, en los cuales se realizan validaciones de obligatoriedad.
- Los tipos de documentos que operan en el programa son: Cédula de ciudadanía, Cédula de extranjería, Pasaporte, Permiso especial de permanencia, Registro civil y Tarjeta de identidad.
- Los tipos de documento con los que se puede realizar la inversión son: Cédula de ciudadanía y Cédula de extranjería.
- Si se cumple con la condición anterior, se podrá continuar con el ingreso del monto de inversión. De lo contrario se presenta mensaje de validación. 
- En el ingreso del monto de inversión se realizan validaciones de obligatoriedad y de tipo de dato, que en este caso es número entero.
- De acuerdo al monto ingresado, se brindará la siguiente recomendación al cliente: 

  - De $0 a $200.000-> Se notifica que el monto mínimo de inversión es de $200.000.
  - De $200.000 a $5.000.000 -> Se recomienda producto de CDT, con porcentaje de ganacia de 7% calculado.
  - De $5.000.000 a $25.000.000 -> Se recomienda producto de Acciones, con porcentaje de ganacia de 12% calculado.
  - De $25.000.000 en adelante -> Se recomienda producto de Fondos de Inversión, con porcentaje de ganacia de 20% calculado.

### **Detalles de la implementación**

Para el desarrollo de este proyecto, se utilizaron las siguientes herramientas:
+ IDE: Intellij IDEA Community Edition 2022.3
+ Lenguaje de programación: Java / JDK v11.0.17
+ Sistema de Control de Versiones: Git

### **Requisitos para la ejecución del programa**

Tener instalado y configurado el funcionamiento de lo siguiente:

+ Java JDK 1.8 o superior (variables de entorno configuradas)
+ IDE de desarrollo, preferiblemente Intellij IDEA Community Edition v2022.3. o superior.
+ Git

### **Estructura del proyecto**
La estructura completa del proyecto es la siguiente:

* ```src```
- Utils package: Acá tenemos un paquete con varias clases de utilería utilizadas dentro de la claseMain.
- Dentro del src tenemos la clase ```Main```, la cual es el punto de arranque del programa y tiene implementada la lógica principal. 
