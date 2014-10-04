hive-single-row-udtf
==============

UDTF for [hive]() which generates always only a single row. Can be used to create a single row DUAL-like table.

Usage:
======

 * Compile with `mvn package` 
 * Copy to hadoop cluster
 * Create `DUAL` table with:

```sql
ADD JAR hive-single-row-udtf-1.0-SNAPSHOT.jar;
CREATE TEMPORARY FUNCTION singlerow AS 'com.github.pkoperek.udf.dual.SingleRowUDTF';

```
