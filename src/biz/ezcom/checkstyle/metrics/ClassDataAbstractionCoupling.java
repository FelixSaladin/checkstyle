package biz.ezcom.checkstyle.metrics;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.CharArrayReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStreamWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 
 */
public class ClassDataAbstractionCoupling {
    /**
     * @throws IOException e
     */
    public ClassDataAbstractionCoupling() throws IOException {
        new Date();
        new SimpleDateFormat();
        new File("fileName.txt");
        new InputStreamReader(null);
        new OutputStreamWriter(null);
        
        new FileInputStream("");
        new FileOutputStream("");
        new FileWriter("");
        new FileReader("");
        new BufferedInputStream(null);
        
        new BufferedOutputStream(null);
        new BufferedWriter(null);
        new BufferedReader(null);
        new ObjectInputStream(null);
        new ObjectOutputStream(null);
        
        new ByteArrayInputStream(null);
        new ByteArrayOutputStream();
        new CharArrayReader(null);
        new DataInputStream(null);
        new DataOutputStream(null);
        
        new java.sql.Date(1L);
        
    }
}
