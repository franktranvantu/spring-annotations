# @Value

We can use @Value for injecting property values into beans. It's compatible with constructor, setter, and field injection.

Constructor injection:
```java
Engine(@Value("8") int cylinderCount) {
    this.cylinderCount = cylinderCount;
}
```
Setter injection:
```java
@Autowired
void setCylinderCount(@Value("8") int cylinderCount) {
    this.cylinderCount = cylinderCount;
}
```
Alternatively:
```java
@Value("8")
void setCylinderCount(int cylinderCount) {
    this.cylinderCount = cylinderCount;
}
```
Field injection:
```java
@Value("8")
int cylinderCount;
```
Of course, injecting static values isn't useful. Therefore, we can use placeholder strings in @Value to wire values defined in external sources, for example, in .properties or .yaml files.

Let's assume the following .properties file:
```properties
engine.fuelType=petrol
```
We can inject the value of engine.fuelType with the following:
```java
@Value("${engine.fuelType}")
String fuelType;
```
We can use @Value even with SpEL. More advanced examples can be found in [article about @Value](https://www.baeldung.com/spring-value-annotation).