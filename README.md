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