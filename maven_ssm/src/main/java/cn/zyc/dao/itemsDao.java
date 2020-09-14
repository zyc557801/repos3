package cn.zyc.dao;

import cn.zyc.domain.Items;

/**
 * 商品的dao接口
 */
public interface itemsDao {
    /**
     * 根据id查询
     * @param id
     * @return
     */
    Items findById(Integer id);
}
