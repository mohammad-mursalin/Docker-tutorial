# Docker Compose Commands for Student App

This file provides all the essential commands to build, run, and manage the Dockerized Spring Boot application with PostgreSQL.

---

##  Clean and Package the Application
Use Maven to clean and create a JAR package of the Spring Boot project:

```bash
mvn clean package
```
##  Build and Start Docker Containers

Use Docker Compose to build the images and start the containers:

```bash
docker compose up --build
```

This will use the docker-compose.yml file to build and start the application and PostgreSQL containers.

##  List Docker Images

```bash
docker images
```

## Stop the Containers
Stop without deleting anything (most common)

```bash
docker compose stop
```

* Containers stop

* Volumes stay

* Network stays

* Fast restart later

##  Start Containers Again

```bash
docker compose start
```

This restarts the same containers.

##  Stop + Remove Containers (but keep DB data)

```bash
docker compose down
```

* Containers removed

* Network removed

* Volumes kept

Then run again:

```bash
docker compose up
```

##  Full Reset (Deletes Database)

```bash
docker compose down -v
```

Use this when:

* DB schema is broken

* You want a clean PostgreSQL database

Then:

```bash
docker compose up --build
```

##  Cheat-Sheet

| What you want      | Command                     |
| ------------------ | --------------------------- |
| Pause services     | `docker compose stop`       |
| Resume services    | `docker compose start`      |
| Restart everything | `docker compose restart`    |
| Rebuild app image  | `docker compose up --build` |
| Clean reset        | `docker compose down -v`    |

##  Bonus Commands

See Running Containers

```bash
docker compose ps
```

## View Logs

```bash
docker compose logs -f
```

## Restart Only the App Container

```bash
docker compose restart app
```

