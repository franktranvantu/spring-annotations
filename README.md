# @Profile

Profiles are a core feature of the framework — allowing us to map our beans to different profiles — for example, dev, test, and prod.

We can then activate different profiles in different environments to bootstrap only the beans we need.

### Use @Profile on a Bean
Consider a basic scenario: We have a bean that should only be active during development but not deployed in production.

We annotate that bean with a dev profile, and it will only be present in the container during development. In production, the dev simply won't be active:
```java
@Component
@Profile("dev")
public class DevDatasourceConfig {}
```
### Set Profiles
#### Maven Profile
Spring profiles can also be activated via Maven profiles, by specifying the spring.profiles.active configuration property.

In every Maven profile, we can set a spring.profiles.active property:

```xml
<profiles>
    <profile>
        <id>dev</id>
        <activation>
            <activeByDefault>true</activeByDefault>
        </activation>
        <properties>
            <spring.profiles.active>dev</spring.profiles.active>
        </properties>
    </profile>
    <profile>
        <id>prod</id>
        <properties>
            <spring.profiles.active>prod</spring.profiles.active>
        </properties>
    </profile>
</profiles>
```
Its value will be used to replace the @spring.profiles.active@ placeholder in application.properties:

```xml
spring.profiles.active=@spring.profiles.active@
```
Now we need to enable resource filtering in pom.xml:

```xml
<build>
    <resources>
        <resource>
            <directory>src/main/resources</directory>
            <filtering>true</filtering>
        </resource>
    </resources>
    ...
</build>
```
### The Default Profile
Any bean that does not specify a profile belongs to the default profile.

Spring also provides a way to set the default profile when no other profile is active — by using the spring.profiles.default property.
### Get Active Profiles
#### Using Environment
We can access the active profiles from the Environment object by injecting it:

```java
public class ProfileManager {
    @Autowired
    private Environment environment;

    public void getActiveProfiles() {
        for (String profileName : environment.getActiveProfiles()) {
            System.out.println("Currently active profile - " + profileName);
        }  
    }
}
```