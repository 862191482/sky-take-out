package com.sky.mapper;

import com.sky.entity.SetmealDish;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SetmealDishMapper {

    List<Long> getSetmealIdsByDishIds(List<Long> dishIds);

    /**
     * 批量新增套餐
     * @param setmealDishes
     * @return
     */
    void insertBatch(List<SetmealDish> setmealDishes);

    /**
     * 批量删除套餐
     * @param ids
     * @return
     */
    void deleteBySetmealIds(List<Long> ids);

    /**
     * 根据id删除套餐
     * @param setmealId
     */
    @Delete("delete from setmeal_dish where setmeal_id = #{setmealId}")
    void deleteBySetmealId(Long setmealId);
}
