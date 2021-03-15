# @Lazy

We use @Lazy when we want to initialize our bean lazily. By default, Spring creates all singleton beans eagerly at the startup/bootstrapping of the application context.

However, there are cases when we need to create a bean when we request it, not at application startup.

This annotation behaves differently depending on where we exactly place it. We can put it on:

- a @Bean annotated bean factory method, to delay the method call (hence the bean creation)
- a @Configuration class and all contained @Bean methods will be affected
- a @Component class, which is not a @Configuration class, this bean will be initialized lazily
an @Autowired constructor, setter, or field, to load the dependency itself lazily (via proxy)
This annotation has an argument named value with the default value of true. It is useful to override the default behavior.

For example, marking beans to be eagerly loaded when the global setting is lazy, or configure specific @Bean methods to eager loading in a @Configuration class marked with @Lazy:
```java
@Configuration
@Lazy
class VehicleFactoryConfig {

    @Bean
    @Lazy(false)
    Engine engine() {
        return new Engine();
    }
}
```
```java
@Bean
public Car car() {
    return new Car();
}
```
For further reading, please visit [this article](https://www.baeldung.com/spring-lazy-annotation).