# Intersystems-JDBC
How to connect to an Interstems Caché database table in a namespace using a JDBC connection

## Requirements
* A Caché server with user rights for the namespace and table you want
* Java 1.8+ (if using something older, you'll need modifications)
* The Intersystems JDBC library (the 2.0.0 version is included in this repo)

## Class Dependancies
```Java
import java.sql.*;
import com.intersys.jdbc.*;
```
