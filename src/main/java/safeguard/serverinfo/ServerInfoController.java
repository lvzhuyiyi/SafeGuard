package safeguard.serverinfo;

import com.alibaba.fastjson.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Administrator on 2015/12/5.
 */
@Controller
@RequestMapping(value = "/serverInfo")
public class ServerInfoController {
    @RequestMapping(value = "/getVersion", method = RequestMethod.GET)
    @ResponseBody
    public String getVersion() {
        JSONObject json = new JSONObject();
        json.put("version", "1.0");
        json.put("description", "simple");
        json.put("apkUrl", "http://182.61.4.65/safeguard.apk");
        return json.toJSONString();
    }
}
