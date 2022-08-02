package com.code.util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class MyFilleUtil {

    //读取文件

    /**
     * 读取文件
     *
     * @param path 文件路径
     * @return 文件内容
     * @throws IOException
     */
    public static String ReadFile(String path) throws IOException {
        StringBuffer sb = new StringBuffer();
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(path), "UTF-8"));
        String line = null;
        while ((line = br.readLine()) != null) {
            sb.append(line);
        }
        br.close();
        return sb.toString();
    }

    //写文件

    /**
     * 写入文件（先清空内容在写入 文件不存在会自动创建）
     *
     * @param path    存放路径如 c://1.txt
     * @param content 写入内容
     * @throws IOException
     */
    public static void WriteFile(String path, String content) throws IOException {
        Clear(path);//清空文本内容
        File f = new File(path);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(f), "UTF-8"));
        bw.write(content);
        bw.close();
    }

    /**
     * 先清空文件
     *
     * @param path
     * @throws IOException
     */
    public static void Clear(String path) throws IOException {
        File f = new File(path);
        //如果文件不存在 则创建文件
        if (!f.exists()) {
            System.out.println("正在创建文件" + f.getAbsolutePath());
            f.createNewFile();
        }
        FileWriter fw = new FileWriter(f);
        fw.write("");
        fw.close();
    }

    public static void main(String[] args) throws IOException {
        File f = new File("1.txt");
        f.createNewFile();
    }
}
