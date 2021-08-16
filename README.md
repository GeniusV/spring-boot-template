# Spring Boot Template

This is a template project to create application quickly, including:
- Spring Boot
- Spring Cloud
- Spring Cloud Alibaba
- Mapstruct
- lombok
- hutool

Check `pom.xml` to change version.

Others:
- Already configured annotation processors:
    - `spring-boot-configuration-processor`: for application config file autocomplete
    - `mapstruct-processor`: for mapstruct
    - `lombok`: for lombok
- Javadoc plugin on `package` stage
- Spring boot plugin to package executable jars.

## Package jar executable

``` bash
mvn clean install spring-boot:repackage -Dmaven.test.skip=true
```

## Test

In this template, there are two type of test, unit test and integration test.

- Unit test must not reply on another external service, such as a db, redis, etc. Use mock instead. Unit test class
  should end with `Test` suffix (like `ApplicationTest`).
- Integration test will require external service and can actually write some data to external service. Integration test
  should end with `IntegrationTest` suffix (like `ApplicationIntegrationTest`).

In maven pom file, there are two profile: `unit-test` and `integration-test`

- `unit-test` profile is enable by default, which will on run unit tests.
- `integration-test` profile has to manually specific by `-P` flag, like `mvn clean test -P integration-test`. Since
  unit test should work everywhere, so when running integration test will also run unit tests.

In Intellij IDEA, unit tests and integration tests can be configured separately.

- Unit test pattern: `^(.*IntegrationTest)`
- Integration test pattern: `.*IntegrationTest`

Note, in above configuration, unit tests will not be trigger when run integration tests. If you want to run integration
tests and unit tests together like maven, just run all tests.



