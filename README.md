# @Scope

We use @Scope to define the scope of a @Component class or a @Bean definition. It can be either singleton, prototype, request, session, globalSession or some custom scope.

For example:
```java
@Component
@Scope("prototype")
class Engine {}
```