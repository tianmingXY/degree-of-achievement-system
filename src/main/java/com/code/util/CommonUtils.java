package com.code.util;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.apache.commons.lang.StringUtils;
import org.apache.http.Consts;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.apache.commons.codec.binary.Base64;

import java.io.IOException;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.Properties;

//自定义开发工具类

public class CommonUtils {


    public static void main(String[] args) throws Exception {
        boolean b = checkCode();
    }


    public static boolean checkCode() throws Exception {
        String keycode = "";
        return true;
    }


    //判断字符串是否不为空
    public static boolean isNotEmpty(String str) {
        return StringUtils.isNotEmpty(str);
    }

    //判断字符串是否为空
    public static boolean isEmpty(String str) {
        return StringUtils.isEmpty(str);
    }

    /**
     * 生成随机小数
     *
     * @param len
     * @return
     */
    public static float createFloatNum(int len) {
        float Max = 0, Min = 5;
        BigDecimal bd = new BigDecimal(Math.random() * (Max - Min) + Min);
        BigDecimal bigDecimal = bd.setScale(len, BigDecimal.ROUND_HALF_UP);// 保留2位小数并四舍五入
        float value = bigDecimal.floatValue();
        return value;
    }

    //获取系统时间字符串
    public static String getNowDateStr() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date d = new Date();
        String str = sdf.format(d);
        return str;
    }


    /**
     * 提取HTML信息
     */
    private static String getContent(String url) throws Exception {
        String html = "";
        CloseableHttpClient httpclient = HttpClients.createDefault();
        HttpGet httpGet = new HttpGet(url);
        // 模拟浏览器浏览
        httpGet.setHeader("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10.13; rv:60.0) Gecko/20100101 Firefox/60.0");
        CloseableHttpResponse response1 = httpclient.execute(httpGet);
        // 结果集合
        Map<String, String> reslut = null;
        //获取响应状态码
        int StatusCode = response1.getStatusLine().getStatusCode();
        try {

            HttpEntity entity1 = response1.getEntity();
            //如果状态响应码为200，则获取html实体内容或者json文件
            if (StatusCode == 200) {
                html = EntityUtils.toString(entity1, Consts.UTF_8);
                // 消耗掉实体
                EntityUtils.consume(response1.getEntity());
            } else {
                //否则，消耗掉实体
                EntityUtils.consume(response1.getEntity());
            }
        } finally {
            response1.close();
        }

        return html;
    }


}
