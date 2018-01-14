package com.dianping.cip;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author gaoleizhou@gmail.com
 *         Created At 2018/1/14.
 *         Desc:
 */
@RestController
public class Controller {

    @RequestMapping("/")
    public String helloWorld() {
        return "hello world";
    }

}
