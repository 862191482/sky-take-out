package com.sky.service;

import com.sky.annotation.AutoFill;
import com.sky.dto.DishDTO;
import com.sky.enumeration.OperationType;

public interface DishService {
    /**
     * 新增菜品和对应的口味
     * @param dishDTO
     */
    @AutoFill(OperationType.INSERT)
    public void saveWithFlavor(DishDTO dishDTO);
}
