1)run the zipkin jar for distributed tracing , currently which is using in-memory
2)command:java -jar zipkin-server-2.12.9-exec.jar
3)access zipkin ui http://localhost:9411/zipkin/
4)run service1 which is running on 9091
5)run service2 which is running on 9092
6)run orchastrator which is running on 9090 , this is used to call service 1 & service2
7)AOP code is written as a separate application we can use that as dependecy in whatever the project that we want
eg:if we want acudit any method just use @Audit annotaion
eg logs:[nio-9090-exec-4] com.centime.audit.AuditLogAspect         : DelegateController.healthCheck took 0 ms
8)caching is used in service1 to store the GET response at cache and exposed method to refresh the cache also.
9)swagger UI added for orchastrator service http://localhost:9090/orch/swagger-ui.html
10)implemented in-memory authentication at orchastrator service one get API without any authentication , POST method is required eg:akbar/akbar
