# Proyecto JAMM_TAP

---
Autor: **Martínez Mendoza Jesús Ángel**

N. Control: **22161152**

Grupo: **4SA**

Horario: **8:00 - 9:00**

Docente: **Martínez Nieto Adelina**

Fecha: **28 de Febrero del 2024**

---
![image](https://github.com/JesusAngelMM/ITO_TAP_U1_Formulario/assets/142072252/51b75d0e-afdc-44fe-afef-8e348864e2b7)

## Descripción
Este proyecto, denominado JAMM1_TAP, es una implementación en Java de un formulario de datos de alumnos. La interfaz gráfica permite capturar información como el número de control, nombre, apellidos, género y carrera. Los datos se almacenan en un ArrayList y se proporcionan funciones para mostrar y reiniciar los datos ingresados.

## Estructura del Proyecto
- **Paquete del Alumno:** `jamm_pck_alumno`
- **Clase Principal:** `jamm_form`

## Elementos del Formulario
1. **Número de Control:** Campo numérico para almacenar 8 dígitos. (Variable: `txtNumControl`)
2. **Nombre y Apellidos:** Campos de texto para el nombre, apellido paterno y apellido materno. (Variables: `txtNombre`, `txtPaterno`, `txtMaterno`)
3. **Género:** Opciones para seleccionar género masculino (`optMasculino`) o femenino (`optFemenino`).
4. **Carrera:** Menú desplegable con opciones de carreras. (Variable: `cboCarreras`)
   - Ingeniería Civil
   - Ingeniería en Gestión Empresarial
   - Ingeniería Electrónica
   - Ingeniería Eléctrica
   - Ingeniería en Sistemas Computacionales
   - Ingeniería Industrial
   - Ingeniería Mecánica
   - Ingeniería Química
   - Licenciatura en Administración

## Funcionalidades
1. Al iniciar, la opción masculina está preseleccionada y la carrera es Ingeniería en Sistemas Computacionales.
2. Al hacer clic en "Aceptar", se almacenan los datos del alumno en un ArrayList llamado "alumnos".
3. Se mostrará en consola el mensaje "Alumno almacenado correctamente".
4. Al hacer clic en "Cancelar", se reinician los valores del formulario.
5. Al hacer clic en "Mostrar en Consola", se visualizan todos los datos de los alumnos almacenados. Si no hay alumnos, se muestra el mensaje "No se encontraron alumnos registrados".
6. Se visualizará el género como "Femenino" o "Masculino" aunque se haya almacenado únicamente las letras 'M' y 'F'.

¡Bienvenido al Proyecto **JAMM_TAP**!
