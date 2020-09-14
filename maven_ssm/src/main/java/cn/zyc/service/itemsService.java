package cn.zyc.service;

import cn.zyc.domain.Items;

/**
 * 业务层接口
 */
public interface itemsService {

    /**
     * 根据id查询
     * @param id
     * @return
     */
    Items findById(Integer id);
}
