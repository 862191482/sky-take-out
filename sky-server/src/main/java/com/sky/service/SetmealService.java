package com.sky.service;

import com.sky.dto.SetmealDTO;
import com.sky.dto.SetmealPageQueryDTO;
import com.sky.result.PageResult;

import java.util.List;

public interface SetmealService {
    /**
     * 新增套餐
     * @param setmealDTO
     * @return
     */
    void save(SetmealDTO setmealDTO);

    /**
     * 套餐分页查询
     * @param
     * @return
     */
    PageResult SetmealpageQuery(SetmealPageQueryDTO setmealPageQueryDTO);

    /**
     * 批量删除套餐
     * @param ids
     * @return
     */
    void deleteByIds(List<Long> ids);
}
