package com.ifunq.sfht.backend.admin.service;

import com.ifunq.sfht.backend.admin.dao.SysAdminDAO;

import java.util.List;

/**
 * Created by  Yanghua on
 * Date：2017/3/31 Time：23:28
 * Description:
 */
public interface SysAdminService {
    public List<SysAdminDAO> getAllAdmin();
}
