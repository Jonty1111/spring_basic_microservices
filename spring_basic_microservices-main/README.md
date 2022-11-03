Signup & Tokenized Login -> proxied through consumer-service (dummyService) : port = 8082

Signup -> http://localhost:8082/consumer/add-user <br>
Login -> http://localhost:8082/consumer/login

1) Proxied authentication-service (in which token is created) in consumer-service (dummyService)
2) Then, Proxied admin-service (the login signup one) in consumer-service (dummyService)
3) Manipulated the admin-service URIs according to need (tokenized).


Microservices Assesment
Implement Movie App CRUD, JWT on Microservices using Open Fiegn and Eureka Server

1. Service 1 => Movie App => MongoDB 
2. Service 2 => JWT for generating token 
3. Service 3 => Admin Service => H2 Database
