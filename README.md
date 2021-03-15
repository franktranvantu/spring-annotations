# @Bean

@Bean marks a factory method which instantiates a Spring bean:
```java
@Bean
Engine engine() {
    return new Engine();
}
```

Spring calls these methods when a new instance of the return type is required.

The resulting bean has the same name as the factory method. If we want to name it differently, we can do so with the name or the value arguments of this annotation (the argument value is an alias for the argument name):
```java
@Bean("engine")
Engine getEngine() {
    return new Engine();
}
```
Note, that all methods annotated with @Bean must be in @Configuration classes.