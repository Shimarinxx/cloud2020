package com.atguigu.springcloud.alibaba.service;

/**
 * @author index
 * @create 2021-07-30 12:43
 */
public interface StorageService {
    /**
     * 扣减库存
     *
     * @param productId
     * @param count
     */
    void decrease(Long productId, Integer count);
}
