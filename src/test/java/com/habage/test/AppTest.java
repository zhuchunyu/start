package com.habage.test;

import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryo.io.Input;
import com.esotericsoftware.kryo.io.Output;
import com.habage.model.Grade;
import junit.framework.TestCase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;


public class AppTest extends TestCase {

    public void testWrite() throws FileNotFoundException {
        System.out.println("test");
        Kryo kryo = new Kryo();
        Output output = new Output(new FileOutputStream("file.bin"));

        Grade grade = new Grade();
        grade.setId(2);
        grade.setGradeNm("smith");
        grade.setTeacherId(2);

        kryo.writeObject(output, grade);
        output.close();
    }

    public void testRead() throws FileNotFoundException {
        Kryo kryo = new Kryo();
        Input input = new Input(new FileInputStream("file.bin"));
        Grade grade = kryo.readObject(input, Grade.class);
        System.out.println(grade.getId());
        System.out.println(grade.getGradeNm());
        System.out.println(grade.getTeacherId());
        input.close();
    }
}
