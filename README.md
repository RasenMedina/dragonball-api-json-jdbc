# Persistència de Dades: 2a pràctica 

**Professor:** Xavier Martín  
**Autors:** Hajar Errahmani & Rasen Mediñà  
**Data:** 22 de Maig del 2026

# Dragon Ball API JSON JDBC

Aplicació Java de persistència de dades desenvolupada per a l'assignatura **MS005 - Persistència de dades**.

## Descripció

Aquest projecte permet gestionar dades de l'univers Dragon Ball mitjançant:

* Connexió amb una API REST externa
* Lectura de fitxers JSON
* Persistència de dades amb JDBC
* Sincronització entre fonts externes i base de dades
* Gestió de dades des d'una interfície per terminal

L'aplicació treballa principalment amb informació de:

* Personatges
* Planetes

## Tecnologies utilitzades

* Java
* JDBC
* MySQL
* JSON
* Gson
* Git & GitHub
* IntelliJ IDEA

## Funcionalitats principals

### 1. Llistar dades

Mostrar el contingut actual de la base de dades.

### 2. Mostrar dades externes

Visualitzar informació obtinguda des de:

* Endpoints API
* Fitxers JSON

### 3. Actualitzar registres

Actualitzar personatges existents a partir d'una font externa.

### 4. Sincronització de dades

* Còpia parcial
* Còpia completa

### 5. Control d'errors

Gestió de:

* Errors de connexió
* Errors d'estructura JSON
* Validació de dades
* Excepcions

## API utilitzada

Dragon Ball API:

* https://www.freepublicapis.com/dragon-ball-api
* https://web.dragonball-api.com/documentation

## Estructura inicial del projecte

```text
src/
│
├── api/
├── database/
├── json/
├── menu/
├── model/
├── service/
├── utils/
└── Main.java
```

