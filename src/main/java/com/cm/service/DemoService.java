package com.cm.service;

import com.cm.pojo.Manager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * Created by GSY on 2017/6/28.
 */
@Service("demoService")
public class DemoService {

    @Autowired
    private HibernateTemplate hibernateTemplate;

    //显示管理员信息
    public List<Manager> getManager(){
        String hsql = "from Manager ";
        List<Manager> data = (List<Manager>) hibernateTemplate.find(hsql);
        return data;
    }

    //通过name找到管理员信息
    public Manager findByManagerName(String userName){
        String hsql = "from Manager u where u.managername = ?";
        List<Manager> data = (List<Manager>)hibernateTemplate.find(hsql,userName);
        if(!data.isEmpty()){
            return  data.get(0);
        }
        return null;
    }

    //添加
    public boolean addUsers(Manager myUser){
        hibernateTemplate.save(myUser);
        return true;
    }
}
