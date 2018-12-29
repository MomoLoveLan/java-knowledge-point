package com.momo.controller;

import com.momo.utils.MenuUtils;
import net.sf.json.JSONObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhanghui2018
 * @ClassName MenuController
 * @Description
 * @date 2018/12/29 10:05
 */
@RestController
@RequestMapping(value = "/wx")
public class MenuController {

    @GetMapping(value = "/crtMenu")
    public String createMenu() {
        JSONObject jsonObject = MenuUtils.createMenu();
        return jsonObject.toString();
    }

}
