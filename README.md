# Overview

- This repository follows the tutorial seen [here](https://www.callicoder.com/spring-boot-spring-security-jwt-mysql-react-app-part-1/)

- This upload will be up to the end of part 2 which implements Spring Security using JWT authentication and APIs used for
user register and login.
    - In application.properties I store the "app.jwtSecret" inside of an environment variable.
        - I had an issue with using the @Value annotation on the data member directly in the JwtTokenProvider class so
        the solution I used was just use constructor based DI.
            - I followed [this](https://stackoverflow.com/questions/25764459/spring-boot-application-properties-value-not-populating) stackoverflow thread
    - I also made slight modifications when using Dependency Injection (DI).
