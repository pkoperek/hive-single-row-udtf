hive-dual-udtf
==============

UDTF for [hive]() which generates always only a single row. Can be used to create a single row DUAL-like table.

Usage:
======

 * Compile with `mvn package` 
 * Copy to hadoop cluster
 * Add jar in hive session `ADD JAR hive-dual-udth-1.0-SNAPSHOT.jar;`
 * Create `DUAL` table with:

```sql

```
