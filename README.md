Interacción con Imágenes (versión Fragments)
Este proyecto es una aplicación Android que demuestra el uso de Fragments para la interacción con imágenes. La aplicación permite al usuario seleccionar una imagen de una lista y ver los detalles de la imagen seleccionada.
Características

Selección de imágenes mediante un Spinner
Visualización de la imagen seleccionada en pantalla completa
Navegación entre fragments
Conservación del estado al girar el dispositivo

Estructura del Proyecto
El proyecto consta de los siguientes componentes principales:
Actividades

MainActivity: Actividad principal que actúa como contenedor para los fragments.

Fragments

ImageSelectionFragment: Permite al usuario seleccionar una imagen de una lista.
ImageDetailFragment: Muestra los detalles de la imagen seleccionada.

Layouts

activity_main.xml: Layout principal que contiene el contenedor de fragments.
fragment_image_selection.xml: Layout para la selección de imágenes.
fragment_image_detail.xml: Layout para mostrar los detalles de la imagen.

Funcionamiento

Al iniciar la aplicación, se muestra el ImageSelectionFragment.
El usuario selecciona una imagen del Spinner y presiona "Siguiente".
La aplicación navega al ImageDetailFragment, mostrando la imagen seleccionada.
El usuario puede volver a la selección de imágenes presionando "Volver".

Manejo de la Rotación del Dispositivo
La aplicación está diseñada para mantener el estado actual al girar el dispositivo, gracias al uso de Fragments y el manejo adecuado del ciclo de vida de Android.
Requisitos

Android SDK
Dispositivo o emulador con Android (versión mínima por determinar)

Instalación y Ejecución

Clone el repositorio.
Abra el proyecto en Android Studio.
Ejecute la aplicación en un emulador o dispositivo Android.

Autor
Luigui Alexander Huanca Capira
Fechas

Fecha de creación: 2024-09-25
Última modificación: 2024-09-25
