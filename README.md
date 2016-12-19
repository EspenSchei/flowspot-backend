# Overview

This Github project contains the backend API for the flowspot project. 
	
## Technologies used

- Maven 3.3.9 (Build tool) 
- Java 1.8
- Jersey 6 (JAX-RS)
- Jetty 6 (Server)

## Build and run

```
mvn install
mvn jetty:run-exploded
```

### Test the service

*1. Requests: JSON*
```
http://localhost:8080/rest/ping 
http://localhost:8080/rest/playlist/top
```
