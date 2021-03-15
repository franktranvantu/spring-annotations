# @DependsOn

We can use this annotation to make Spring initialize other beans before the annotated one. Usually, this behavior is automatic, based on the explicit dependencies between beans.

We only need this annotation when the dependencies are implicit, for example, JDBC driver loading or static variable initialization.

We can use @DependsOn on the dependent class specifying the names of the dependency beans. The annotation's value argument needs an array containing the dependency bean names:
```java
@DependsOn("engine")
class Car implements Vehicle {}
```
Alternatively, if we define a bean with the @Bean annotation, the factory method should be annotated with @DependsOn:
```java
@Bean
@DependsOn("fuel")
Engine engine() {
    return new Engine();
}
```