package com.huobanbengkui.controller;

import com.huobanbengkui.Model.WXSessionModel;
import com.huobanbengkui.common.HttpclientUtil;
import com.huobanbengkui.common.JsonResult;
import com.huobanbengkui.common.JsonUtil;
import com.huobanbengkui.common.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class WXLoginController {

    @Autowired
    private RedisUtil redisUtil;

    @PostMapping("/wxLogin")
    public JsonResult wxLogin(String code) {
        String url = "https://api.weixin.qq.com/sns/jscode2session";
        Map<String ,String> map = new HashMap<>();
        map.put("appid", "wxgagagag");
        map.put("secret", "3a623345452345");
        map.put("js_code", code);

        String resultStr = HttpclientUtil.doGet(url, map);

        System.out.print(resultStr);

        WXSessionModel model = JsonUtil.jsonToPojo(resultStr, WXSessionModel.class);
        System.out.print(model.getErrcode());

        redisUtil.keyWithValue("gaga", "gagaga");
        System.out.print(redisUtil.getVale("gaga"));

        if (code.equals("400")) {
            return JsonResult.ok();
        }else {
            return JsonResult.error();
        }
    }


}
