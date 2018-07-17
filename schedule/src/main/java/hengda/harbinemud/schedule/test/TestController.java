package hengda.harbinemud.schedule.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping(value = "/api/schedule")
public class TestController {

    private final TestMapper mapper;

    @Autowired
    public TestController(TestMapper mapper) {
        this.mapper = mapper;
    }

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public Map<String, Object> test() {
        Map<String, Object> r = new HashMap();
        try {
            r.put("content", mapper.test());
            r.put("message", "");
        } catch (Exception e) {
            r.put("content", "");
            r.put("message", "服务器错误。");
        }
        return r;
    }
}
