package com.ifunq.sfht.backend.admin.controller;

import com.ifunq.sfht.backend.admin.dao.SysAdminDAO;
import com.ifunq.sfht.backend.admin.service.SysAdminService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by  Yanghua on
 * Date：2017/3/30 Time：21:38
 * Description:
 */
@RestController
public class SysAdminController {
    public final static Logger logger = LoggerFactory.getLogger(SysAdminController.class);

    @Autowired
    private SysAdminService sysAdminServce;


    @RequestMapping(value = "/hello")
    public String getUser() {
        List<SysAdminDAO> admin = sysAdminServce.getAllAdmin();
        logger.info("admins:" + admin);
        return "hello : " + admin.get(0).getUsername() + admin.get(0).getPassword();
    }
}
