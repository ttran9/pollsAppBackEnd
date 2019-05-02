# Overview

- This repository follows the overall tutorial seen [here](https://www.callicoder.com/spring-boot-spring-security-jwt-mysql-react-app-part-1/)

- This upload will be up to the end of part 1 which is just setting up the back-end with basic models and ensuring we can connect to a MySQL db.
    - Note the tutorial uses localhost but I decided to just connect to a MySQL database running inside of a local docker container.
    - I also slightly deviated from the tutorial by using a seed class to populate the user and admin roles.
        - I can just change the roles to be false in order to not re-populate the roles table every time the database is run.
