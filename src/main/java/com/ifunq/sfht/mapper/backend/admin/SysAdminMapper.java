package com.ifunq.sfht.mapper.backend.admin;

import com.ifunq.sfht.backend.admin.dao.SysAdminDAO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created by  Yanghua on
 * Date：2017/3/31 Time：23:08
 * Description:
 */
@Mapper
public interface SysAdminMapper {

    List<SysAdminDAO> queryAll();

}