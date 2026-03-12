# TikTok Video Downloader 🎵

Aplicación de escritorio desarrollada en Java con NetBeans que permite descargar videos de TikTok pegando el enlace del video directamente desde el navegador.

## 📸 Vista previa


<img width="444" height="250" alt="image" src="https://github.com/user-attachments/assets/a7f0f3c7-54de-409f-bb68-0f6a7bb510d4" />

<img width="447" height="250" alt="image" src="https://github.com/user-attachments/assets/62724e91-1a30-4ea3-978e-9775e708fce9" />

<img width="446" height="251" alt="image" src="https://github.com/user-attachments/assets/ca4f7edf-6c46-49cd-8580-f95749ebc11e" />

<img width="450" height="248" alt="image" src="https://github.com/user-attachments/assets/ea4a2159-76d0-416f-a140-220221727ad8" />


## 🛠️ Tecnologías usadas
- Java (Swing) - Interfaz gráfica de escritorio
- API de tikwm.com - Extracción del link de descarga
- HttpURLConnection - Peticiones HTTP a la API
- Multithreading (Thread) - Descarga sin congelar la interfaz

## ⚙️ ¿Cómo funciona?
1. El usuario pega el link del video de TikTok
2. La app limpia los parámetros extra de la URL automáticamente
3. Se hace una petición a la API de tikwm.com
4. La API devuelve el link directo del video
5. La app descarga y guarda el archivo con un nombre único

## 🚀 ¿Cómo usarlo?
1. Clona el repositorio
2. Abre el proyecto en NetBeans
3. Ejecuta el proyecto
4. Abre TikTok en el navegador, entra a un video y copia la URL
5. Pégala en la app y haz click en Descargar ✅

## 📋 Requisitos
- Java JDK 8 o superior
- NetBeans IDE

## ✨ Características
- Interfaz modo oscuro
- Barra de progreso durante la descarga
- Descarga múltiples videos sin reemplazar los anteriores
- Compatible con cualquier video público de TikTok
