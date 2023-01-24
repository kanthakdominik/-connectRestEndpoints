# connectRestEndpoints
#### Examples of connecting Rest Api in Spring Boot  
<br /> 

**Proxy endpoint run on <http://localhost:8080>**  
<br /> 
 
**OpenFeign example run on <http://localhost:9090>**

```bash
curl -X POST -H 'content-type:application/json' -d '{"amount":1000}' http://localhost:9090/payment
```

**RestTemplate example run on <http://localhost:9091>**

```bash
curl -X POST -H 'content-type:application/json' -d '{"amount":1000}' http://localhost:9091/payment
```

**WebClient example run on <http://localhost:9092>**

```bash
curl -X POST -H 'content-type:application/json' -d '{"amount":1000}' http://localhost:9092/payment
```
