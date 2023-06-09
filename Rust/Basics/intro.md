

# println! macro

main realiza una tarea. Llama a la macro println! predefinida en Rust. La macro println! espera uno o varios argumentos de entrada, que se muestran en la pantalla o en la salida estándar. En nuestro ejemplo, pasamos un argumento de entrada a la macro, la cadena de texto "Hello, world!".

```rust
//Hello world
fn main() {
    println!("Hello, world!");
}

```

# Macro todo!
La macro todo! se usa para identificar código sin terminar en el programa de Rust. La macro es útil para crear prototipos, o bien cuando se quiere indicar un comportamiento que no está completo.

```rust
fn main() {
    // Display the message "Hello, world!"
    todo!("Display the message by using the println!() macro");
}
```

# Sustitución de valores para argumentos {}

```rust
fn main() {
    // Call println! with three arguments: a string, a value, a value
    println!("The first letter of the English alphabet is {} and the last letter is {}.", 'A', 'Z');
}
//console: The first letter of the English alphabet is A and the last letter is Z.
```

# Variables
En rust las variables se declaran con la palabra clave let, cuando se declara una variable se puede enlazar a un valor o se puede enlazar más adelante en el programa.
```rust
let a_number;

a_number = 10;
```
# inmutable y mutable
En rust los enlaces de variables son inmutables de forma predeterminada, cuando una variable es inmutable despues de enlazar un valor no se puede cambiar.
```rust
let a_number = 10;
a_number = 15;
//console: cannot assign twice to immutable variable
//genera un error
```
Para mutar un valor debemos usar la palabra clave **mut**
```rust
let mut a_number = 10;
a_number = 15;

```
# Funciones
Una función es un bloque de código que realiza una tarea específica. Separamos el código de nuestro programa en bloques basados en tareas. Esta separación hace que el código sea más fácil de entender y mantener.
Cada programa de Rust debe tener una función llamada main. El código de la función main siempre es el primer código que se ejecuta en un programa con Rust. Podemos llamar a otras funciones desde la función main o desde otras funciones.
```rust
fn main() {
    println!("Hello, world!");
}

```
Para declarar una función en Rust, usamos la palabra clave fn. Después del nombre de la función, se le indica al compilador cuántos parámetros o argumentos espera la función como entrada. Los argumentos se enumeran entre paréntesis (). El cuerpo de la función es el código que realiza la tarea de una función y se define entre llaves {}

# Compilación y ejecucion de un programa
Para compilar y ejecutar un programa se utilizan los siguientes comandos en la consola:
```
rustc main.rs
.\main.exe

```

# Creacion de un proyecto con Cargo
Asegurarse de que la terminal se encuentra en el directorio donde desea crear el proyecto
comando:
```
cargo new hello-cargo
```
Se genera un nuevo directorio llamado hello-cargo dentro del directorio donde esta ubicada la consola
Se generan 2 archivos:
- El archivo Cargo.toml es el archivo de manifiesto de Rust. Es donde se conservan los metadatos para el proyecto, así como las dependencias.
- El archivo main.rs en el subdirectorio src es donde escribirá el código de la aplicación.

# Tipos de datos

se le indica al compilador que cree la variable number como un entero de 32 bits. Especificamos el tipo de datos u32 después del nombre de la variable. 
```rust
//int
let number: u32 = 14;
println!("The number is {}.", number);
```
Si ponemos el valor de la variable entre comillas dobles, el compilador interpreta el valor como texto en lugar de como un número. El tipo de datos deducido del valor no coincide con el tipo de datos u32

```rust

let number: u32 = "14";
//console:
Compiling playground v0.0.1 (/playground)
error[E0308]: mismatched types
 --> src/main.rs:2:23
  |
2 |     let number: u32 = "14";
  |                 ---   ^^^^ expected `u32`, found `&str`
  |                 |
  |                 expected due to this

error: aborting due to previous error

```
## Numeros: int y float
**Los enteros** en Rust se identifican por el tamaño en bits y la propiedad signed. Un entero con signo puede ser un número positivo o negativo. Un entero sin signo solo puede ser un número positivo.

| Length | Firmado | Sin signo |
|  ---   |   ---   |    ---    |
|8 bits  |    i8   |   u8      |
|16 bits |    i16  |   u16     |
|32 bits |    i32  |   u32     |
|64 bits |    i64  |   u64     |
|128 bits|   i128  |  u128     |

**isize** y **usize** dependen del tipo de equipo en el que se ejecuta el programa. El tipo de 64 bits se usa en una arquitectura de 64 bits y el tipo de 32 bits, en una arquitectura de 32 bits. Si no especifica el tipo para un entero, y el sistema no puede deducir el tipo, asigna el tipo i32 (un entero de 32 bits con signo) de forma predeterminada.

Rust tiene dos tipos de datos de punto flotante para los valores decimales: f32 (32 bits) y f64 (64 bits). El tipo de punto flotante predeterminado es f64. En las CPU modernas, el tipo f64 tiene aproximadamente la misma velocidad que el tipo f32, pero cuenta con una mayor precisión.

```rust
let number_64 = 4.0;      // compiler infers the value to use the default type f64
let number_32: f32 = 5.0; // type f32 specified via annotation

```
Todos los números primitivos en rust admiten operaciones matematicas como suma,resta,multiplicación y división.
```rust
// Addition, Subtraction, and Multiplication
println!("1 + 2 = {} and 8 - 5 = {} and 15 * 3 = {}", 1u32 + 2, 8i32 - 5, 15 * 3);

// Integer and Floating point division
println!("9 / 2 = {} but 9.0 / 2.0 = {}", 9u32 / 2, 9.0 / 2.0);

```

## Booleanos: True o False

El tipo bool tiene dos valores posibles: true o false.

En el ejemplo siguiente, usamos el operador mayor que > para probar dos valores. El operador devuelve un valor booleano que muestra el resultado de la prueba.

```rust
// Declare variable to store result of "greater than" test, Is 1 > 4? -- false
let is_bigger = 1 > 4;
println!("Is 1 > 4? {}", is_bigger);
//Console: Is 1 > 4? false
```

## str: caracteres y cadenas
Rust admite valores de texto con dos tipos de cadena básicos y un tipo de carácter. Un carácter es un elemento único, mientras que una cadena es una serie de caracteres. Todos los tipos de texto son representaciones UTF-8 válidas.

char es el más primitivo de los tipos de texto. El valor se especifica poniendo el elemento entre comillas simples:

```rust
let uppercase_s = 'S';
let lowercase_f = 'f';
let smiley_face = '😃';
```
char es util para manipular caracteres individuales

String:
- String es un tipo de dato que representa una cadena de texto mutable y de propiedad propia.
- Es un tipo de dato dinámico, lo que significa que puede cambiar su longitud en tiempo de ejecución.
- La cadena de texto está almacenada en el heap y se puede modificar fácilmente.
- String tiene métodos que permiten agregar, quitar, modificar y realizar diversas operaciones en la cadena de texto.

&str:
- &str (también conocido como "string slice" o "rebanada de cadena") es un tipo de dato que representa una vista inmutable y prestada (prestado como referencia) de una cadena de texto.
- Es un tipo de dato estático y no mutable.
- No tiene propiedad propia, sino que es una referencia a una sección de memoria que contiene la cadena de texto.
- &str se usa comúnmente para referenciar cadenas literales, argumentos de función o secciones de una cadena String.
- &str se puede pasar fácilmente entre funciones sin copiar el contenido de la cadena, ya que es una referencia.

La diferencia fundamental entre String y &str radica en la propiedad y mutabilidad. String es propiedad propia y mutable, mientras que &str es una referencia prestada e inmutable.

```rust
// Specify the data type "char"
let character_1: char = 'S';
let character_2: char = 'f';
   
// Compiler interprets a single item in quotations as the "char" data type
let smiley_face = '😃';

// Compiler interprets a series of items in quotations as a "str" data type and creates a "&str" reference
let string_1 = "miley ";

// Specify the data type "str" with the reference syntax "&str"
let string_2: &str = "ace";

println!("{} is a {}{}{}{}.", smiley_face, character_1, string_1, character_2, string_2);
```

# Colecciones de datos mediante Tuplas y estructuras
Una tupla es una agrupación de valores de distintos tipos recopilados en un valor compuesto. Los valores individuales de una tupla se denominan elementos. Los valores se especifican como una lista separada por comas entre paréntesis (<value>, <value>, ...).

Una tupla tiene una longitud fija, que es igual a su número de elementos. Una vez declarada una tupla, no puede aumentar ni reducir su tamaño. No se pueden agregar ni quitar elementos. El tipo de datos de una tupla se define mediante la secuencia de los tipos de datos de los elementos.

```rust
// Tuple of length 3
let tuple_e = ('E', 5i32, true);

```
## Acceder a elementos de una tupla

```rust
// Declare a tuple of three elements
let tuple_e = ('E', 5i32, true);

// Use tuple indexing and show the values of the elements in the tuple
println!("Is '{}' the {}th letter of the alphabet? {}", tuple_e.0, tuple_e.1, tuple_e.2);

```
## Estructuras
Una estructura es un tipo compuesto por otros tipos. Los elementos de una estructura se denominan campos. Al igual que las tuplas, los campos de una estructura pueden tener tipos de datos diferentes. Una ventaja importante del tipo de estructura es que puede asignar un nombre a cada campo, por lo que queda claro lo que significa el valor.

```rust
//estructura

//Tipos de estructuras

// Classic struct with named fields
struct Student { name: String, level: u8, remote: bool }
// Tuple struct with data types only
struct Grades(char, char, char, char, f32);

// Unit struct
struct Unit;

```
- Las estructuras de C clásicas son las más utilizadas. Cada campo de la estructura tiene un nombre y un tipo de datos. Una vez definida una estructura clásica, se puede acceder a los campos de la estructura usando la sintaxis <struct>.<field> (**Las estructuras clásicas no terminan con punto y coma**).
- Las estructuras de tupla son parecidas a las clásicas, pero sus campos no tienen nombres. A fin de acceder a los campos de una estructura de tupla, usamos la misma sintaxis que para indexar una tupla: <tuple>.<index>.
- Las estructuras de unidad suelen usarse como marcadores.

## Instancias de estructura
Después de definir un tipo de estructura, para usar la estructura se crea una instancia del tipo y se especifican valores para cada campo. 

```rust
    // Classic struct with named fields
    struct Student { name: String, level: u8, remote: bool }
    // Instantiate classic struct, specify fields in random order, or in specified order
    let user_1 = Student { name: String::from("Constance Sharma"), remote: true, level: 2 };
    let user_2 = Student { name: String::from("Dyson Tan"), level: 5, remote: false };
    //String::from se utiliza para tomar posesión (ownership) de la secuencia de caracteres y poder modificarlos
    //si no se utiliza String::from por defecto es &str y sería inmutable
```
# Variantes de enumeración para datos compuestos

Usamos la palabra clave enum para crear un tipo de enumeración, que puede tener cualquier combinación de las variantes de enumeración. Las variantes de enumeración, al igual que las estructuras, pueden tener campos con nombres, pero también los pueden tener sin nombres

```rust
//Definicion de una enumeración
enum WebEvent {
    // An enum variant can be like a unit struct without fields or data types
    WELoad,
    // An enum variant can be like a tuple struct with data types but no named fields
    WEKeys(String, char),
    // An enum variant can be like a classic struct with named fields and their data types
    WEClick { x: i64, y: i64 }
}

```
# Definición de enumeración con estructuras
Una manera de evitar los requisitos de variante de la enumeración es definir una estructura independiente para cada variante de esta. Después, cada variante de la enumeración usa la estructura correspondiente.

```rust
// Define a tuple struct
struct KeyPress(String, char);

// Define a classic struct
struct MouseClick { x: i64, y: i64 }

// Redefine the enum variants to use the data from the new structs
// Update the page Load variant to have the boolean type
enum WebEvent { WELoad(bool), WEClick(MouseClick), WEKeys(KeyPress) }
```

## Creación de una instancia de enumeración

Para cada variante, usamos la palabra clave let a fin de realizar la asignación. Para acceder a la variante específica en la definición de enumeración, usamos la sintaxis <enum>::<variant> con dos puntos dobles ::.
```rust
//ejemplo

let we_load = WebEvent::WeLoad(true);


```

Variante de estructura WeClick(MouseClick)

```rust
// Instantiate a MouseClick struct and bind the coordinate values
let click = MouseClick { x: 100, y: 250 };

// Set the WEClick variant to use the data in the click struct
let we_click = WebEvent::WEClick(click);
```

Código final para crear una instancia de las variantes de enumeración

```rust

// Define a tuple struct
#[derive(Debug)]
struct KeyPress(String, char);

// Define a classic struct
#[derive(Debug)]
struct MouseClick { x: i64, y: i64 }

// Define the WebEvent enum variants to use the data from the structs
// and a boolean type for the page Load variant
#[derive(Debug)]
enum WebEvent { WELoad(bool), WEClick(MouseClick), WEKeys(KeyPress) }

fn main() {
    // Instantiate a MouseClick struct and bind the coordinate values
    let click = MouseClick { x: 100, y: 250 };
    println!("Mouse click location: {}, {}", click.x, click.y);
        
    // Instantiate a KeyPress tuple and bind the key values
    let keys = KeyPress(String::from("Ctrl+"), 'N');
    println!("\nKeys pressed: {}{}", keys.0, keys.1);
        
    // Instantiate WebEvent enum variants
    // Set the boolean page Load value to true
    let we_load = WebEvent::WELoad(true);
    // Set the WEClick variant to use the data in the click struct
    let we_click = WebEvent::WEClick(click);
    // Set the WEKeys variant to use the data in the keys tuple
    let we_key = WebEvent::WEKeys(keys);
        
    // Print the values in the WebEvent enum variants
    // Use the {:#?} syntax to display the enum structure and data in a readable form
    println!("\nWebEvent enum structure: \n\n {:#?} \n\n {:#?} \n\n {:#?}", we_load, we_click, we_key);
}


```


