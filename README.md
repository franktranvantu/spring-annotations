# @Qualifier

We use @Qualifier along with @Autowired to provide the bean id or bean name we want to use in ambiguous situations.

For example, the following two beans implement the same interface:
```java
class Bike implements Vehicle {}

class Car implements Vehicle {}
```
If Spring needs to inject a Vehicle bean, it ends up with multiple matching definitions. In such cases, we can provide a bean's name explicitly using the @Qualifier annotation.

Using constructor injection:

```java
@Autowired
Biker(@Qualifier("bike") Vehicle vehicle) {
    this.vehicle = vehicle;
}
```
Using setter injection:

```java
@Autowired
void setVehicle(@Qualifier("bike") Vehicle vehicle) {
    this.vehicle = vehicle;
}
```
Alternatively:
```java
@Autowired
@Qualifier("bike")
void setVehicle(Vehicle vehicle) {
    this.vehicle = vehicle;
}
```
Using field injection:
```java
@Autowired
@Qualifier("bike")
Vehicle vehicle;
```