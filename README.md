# @Autowired

We can use the @Autowired to mark a dependency which Spring is going to resolve and inject. We can use this annotation with a constructor, setter, or field injection.

Constructor injection:
```java
class Car {
    Engine engine;

    @Autowired
    Car(Engine engine) {
        this.engine = engine;
    }
}
```
Setter injection:
```java
class Car {
    Engine engine;

    @Autowired
    void setEngine(Engine engine) {
        this.engine = engine;
    }
}
```
Field injection:
```java
class Car {
    @Autowired
    Engine engine;
}
```
@Autowired has a boolean argument called required with a default value of true. It tunes Spring's behavior when it doesn't find a suitable bean to wire. When true, an exception is thrown, otherwise, nothing is wired.

Note, that if we use constructor injection, all constructor arguments are mandatory.

Starting with version 4.3, we don't need to annotate constructors with @Autowired explicitly unless we declare at least two constructors.