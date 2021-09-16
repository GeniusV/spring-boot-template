# Spring Boot Template

This is a template project to create application quickly, including:
- Spring Boot
- Spring Cloud
- Spring Cloud Alibaba
- Mapstruct
- lombok
- hutool

Check `pom.xml` to change version.

Others features:

- Already configured annotation processors:
  - `spring-boot-configuration-processor`: for application config file autocomplete
  - `mapstruct-processor`: for mapstruct
  - `lombok`: for lombok
- Javadoc plugin on `package` stage
- Spring boot plugin to package executable jars. See [Spring Boot jar Executable](#spring-boot-jar-executable) for
  detail.

## Install

```bash
mvn clean install -DskipTests 
```

## Spring Boot jar Executable

``` bash
mvn clean package -DskipTests 
```

Or

``` bash
mvn clean install spring-boot:repackage -Dmaven.test.skip=true
```

After maven package, two package will be generated under `target/`:

- `spring-boot-template-1.0.0-SNAPSHOT.jar`: the executable jar.
- `spring-boot-template-1.0.0-SNAPSHOT-distribution.zip`: contains the jar and `application.yml`, which is convenient
  for uses to change configurations.

## Logging

This template use `Log4j2` as logging framework.

All logs will be logged to both file and system out.

- Log files locates in `<pwd>/logs`
- Rollover when startup and max log file size of 10 MB

> Currently, only logging level can be changed by `application.yml`, other configurations for log4j2 can be changed by `log4j2.xml`

## Test

There are two type of test, unit test and integration test.

- Unit test must not reply on another external service, such as a db, redis, etc. Use mock instead. Unit test class
  should end with `Test` suffix (like `ApplicationTest`).
- Integration test will require external service and can actually write some data to external service. Integration test
  should end with `IntegrationTest` suffix (like `ApplicationIntegrationTest`).

In maven pom file, there are two profile: `unit-test` and `integration-test`

- `unit-test` profile is enable by default, which will on run unit tests.
- `integration-test` profile has to manually specific by `-P` flag, like `mvn clean test -P integration-test`. Since
  unit test should work everywhere, so when running integration test will also run unit tests.

In Intellij IDEA, unit tests and integration tests can be configured separately.

- Unit test pattern: `^(?!.*IntegrationTest.*).*$`
- Integration test pattern: `.*IntegrationTest.*$`
- All tests pattern: `.*Test.*$`

Note, in above configuration, unit tests will not be triggered when running integration tests. 



