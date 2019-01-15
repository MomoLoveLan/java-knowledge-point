package com.momo.utils;

import net.sf.json.JSONObject;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/**
 * @author zhanghui2018
 * @ClassName MenuUtils
 * @Description
 * @date 2018/12/29 10:04
 */
public class MenuUtils {
    public static JSONObject createMenu() {
        return getMenuResult();
    }

    private static JSONObject getMenuResult() {
        String menu = readMenuCfg();
        JSONObject result = JSONObject.fromObject(menu);
        return result;
    }

    /**
     * 读取菜单配置
     */
    private static String readMenuCfg() {
        String path;
        StringBuffer menu = new StringBuffer();
        try {
            // 服务地址
            String basePath = MenuUtils.class.getResource("").getPath();
            path = (basePath.split("file:/"))[1].split("MomoLanWechat")[0] + "config/menu.cfg";
            System.out.println("服务地址");
        } catch (ArrayIndexOutOfBoundsException ae) {
            // 取大于数组最大下标时报错处理
            // 本地地址
            path = MenuUtils.class.getClassLoader().getResource("menu.cfg").getPath();
            System.out.println("本地地址");
        }
        System.out.println(path);
        try {

            File file = new File(path);
            InputStreamReader read = null;
            try {
                read = new InputStreamReader(new FileInputStream(
                        file), "UTF-8");
                BufferedReader reader = new BufferedReader(read);
                String line = null;
                while ((line = reader.readLine()) != null) {
                    menu.append(line);
                }
                reader.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return menu.toString();
    }

    public static void main(String[] args) {
        createMenu();
    }
}
