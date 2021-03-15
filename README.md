# @Required

@Required on setter methods to mark dependencies that we want to populate through XML:

```java
@Required
void setColor(String color) {
    this.color = color;
}
```
```xml
<bean class="com.franktran.Bike">
    <property name="color" value="green" />
</bean>
```
Otherwise, BeanInitializationException will be thrown.