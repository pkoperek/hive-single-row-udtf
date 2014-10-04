package com.github.pkoperek.udf.singlerow;

import org.apache.hadoop.hive.ql.exec.UDFArgumentException;
import org.apache.hadoop.hive.ql.metadata.HiveException;
import org.apache.hadoop.hive.ql.udf.generic.GenericUDTF;
import org.apache.hadoop.hive.serde2.objectinspector.ObjectInspector;
import org.apache.hadoop.hive.serde2.objectinspector.ObjectInspectorFactory;
import org.apache.hadoop.hive.serde2.objectinspector.StructObjectInspector;
import org.apache.hadoop.hive.serde2.objectinspector.primitive.PrimitiveObjectInspectorFactory;

import java.util.Arrays;

public class SingleRowUDTF extends GenericUDTF {
    @Override
    public StructObjectInspector initialize(ObjectInspector[] objectInspectors) throws UDFArgumentException {
        return ObjectInspectorFactory.getStandardStructObjectInspector(
                Arrays.asList("dummy"),
                Arrays.<ObjectInspector>asList(PrimitiveObjectInspectorFactory.javaStringObjectInspector)
        );
    }

    @Override
    public void process(Object[] objects) throws HiveException {
        // do nothing - we ignore all input cause we always want to return only a single row
    }

    @Override
    public void close() throws HiveException {
        forward(Arrays.asList("X"));
    }
}
