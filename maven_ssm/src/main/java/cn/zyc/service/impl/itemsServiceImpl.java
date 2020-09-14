package cn.zyc.service.impl;

import cn.zyc.dao.itemsDao;
import cn.zyc.domain.Items;
import cn.zyc.service.itemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 业务层实现类
 */
@Service
public class itemsServiceImpl implements itemsService {

    @Autowired
    private itemsDao itemsDao;
    /**
     * 根据id查询
     * @param id
     * @return
     */
    @Override
    public Items findById(Integer id) {
        return itemsDao.findById(id);
    }
}