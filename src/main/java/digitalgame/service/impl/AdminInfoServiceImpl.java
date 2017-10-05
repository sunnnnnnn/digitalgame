package digitalgame.service.impl;

import com.google.common.base.Strings;
import digitalgame.dao.AdminInfoMapper;
import digitalgame.model.po.AdminInfo;
import digitalgame.service.AdminInfoService;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminInfoServiceImpl implements AdminInfoService {

    @Autowired
    AdminInfoMapper adminInfoMapper;

    @Override
    public int saveAdminInfo(AdminInfo adminInfo) {
        adminInfo.setIsEnable(1);
        return adminInfoMapper.insert(adminInfo);
    }

    @Override
    public AdminInfo editAdminInfo(AdminInfo adminInfo) {
        return null;
    }

    @Override
    public List<AdminInfo> queryAdminInfoByPage(AdminInfo adminInfo) {
        String whereCond = " where 1=1 ";
        if(!Strings.isNullOrEmpty(adminInfo.getAdminName())){
            whereCond +=  " and  admin_name like '%"+adminInfo.getAdminName()+"%'";
        }
        if(!Strings.isNullOrEmpty(adminInfo.getAdminCode())){
            whereCond +=  " and admin_code like '%"+adminInfo.getAdminCode()+"%'";
        }
        return adminInfoMapper.selectByPage(whereCond);
    }

    @Override
    public AdminInfo selectByPrimaryKey(Integer id) {
        return adminInfoMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(AdminInfo record) {
        return adminInfoMapper.updateByPrimaryKeySelective(record);
    }
}
