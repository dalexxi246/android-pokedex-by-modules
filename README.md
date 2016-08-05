# android-pokedex-by-modules

Un ejemplo de como desarrollar una aplicacion android modular (que sigue el patron MVP), con cada una de las capas del modelo y la logica de negocio (solo Java) bien separadas de la parte grafica nativa hecha con el framework de Android.

Librerias usadas:

Retrofit en el modulo "Model": Para consumir el API de pokeapi.co, la cual provee mucha informacion sobre Pokemon.
Glide en el modulo "App (View)": Para mostrar en la app la imagen de cada uno de los Pokemon consultados.
Eventbus en un modulo "Common": Para el pase de mensajes entre modulos y componentes de la app, lo cual permite desacoplar las capas logicas de la aplicacion. Se pone en este modulo porque Eventbus es usado en los modulos "View" y "Model".

Basado en el articulo http://androcode.es/2015/02/un-stack-productivo-para-el-desarrollador-android-1-arquitectura/
