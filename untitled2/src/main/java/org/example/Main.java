package org.example;

import org.apache.commons.io.IOUtils;
import org.jetbrains.annotations.TestOnly;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        //IOutils的使用
      // test1();
       //test2();
        //test3();

    }
    public static void test1() throws IOException {//使用commos -io IOUTils进行文件复制
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {

            File srcFile = new File("E:\\pojo\\launcher_install.txt");
            File destFile = new File("E:\\pojo\\launcher_installcopy.txt");
            fis = new FileInputStream(srcFile);
            fos = new FileOutputStream(destFile);
            IOUtils.copy(fis, fos);
        }catch(IOException e)
        {
            throw new RuntimeException(e);
        }finally
        {
            IOUtils.close(fis);
            IOUtils.close(fos);
        }
    }


    public static void test2() throws IOException //使用IOUtils构建输入流对像，并将文件内容存入对象中并输出
    {
        File srcFilr=new File("E:\\pojo\\launcher_install.txt");
        InputStream fis=new FileInputStream(srcFilr);
        System.out.println(IOUtils.toString(fis));
    }
    public static void test3() throws IOException //使用IOUtils 复制超大文件
    {
        File srcFilr=new File("D:\\腾讯会.议_4437493965.exe");
        File srcFilr2=new File("D:\\特鲁.exe");
        FileInputStream fileInputStream=new FileInputStream(srcFilr);
        FileOutputStream fileOutputStream=new FileOutputStream(srcFilr2);
        IOUtils.copy(fileInputStream,fileOutputStream);


    }

}