package com.ifunq.sfht.backend.admin.service.impl;

import com.ifunq.sfht.backend.admin.dao.SysAdminDAO;
import com.ifunq.sfht.backend.admin.service.SysAdminService;
import com.ifunq.sfht.mapper.backend.admin.SysAdminMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by  Yanghua on
 * Date：2017/3/31 Time：23:30
 * Description:
 */
@Service
public class SysAdminServiceImpl implements SysAdminService {
    @Autowired
    private SysAdminMapper sysAdminMapper;

    @Override
    public List<SysAdminDAO> getAllAdmin() {
        return sysAdminMapper.queryAll();
    }
}
