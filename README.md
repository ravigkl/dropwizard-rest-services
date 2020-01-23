# Phonebook

How to start the Phonebook application
---

1. Run `mvn clean install` to build your application
1. Start application with `java -jar target/dw-phonebook-1.0-SNAPSHOT.jar server config.yml`
1. To check that your application is running enter url `http://localhost:8090`

Health Check
---

To see your applications health enter url `http://localhost:8091/healthcheck`
--
The package info 
--

api: Representations. Request and response bodies.

cli: Commands

client: Client code that accesses external HTTP services.

core: Domain implementation; where objects not used in the API such as POJOs, validations, crypto, etc, reside.

jdbi3: Database access classes

health: Health Checks

resources: Resources

PhonebookApplication: The application class

PhonebookApplicationConfiguration: configuration class


Reference: `https://www.dropwizard.io/en/stable/manual/core.html`

--
Use cURL for CRUD operation of HTTP verbs
--
curl http://localhost:8090/contact/123 for GET
curl -X PUT -d 'firstName=FOO&lastName=BAR&phone=+19002037865' http://localhost:8090/contact/123
