package org.spring.springboot.dao;

import org.apache.ibatis.annotations.*;
import org.spring.springboot.domain.City;

import java.util.List;

/**
 * 城市 DAO 接口类
 *
 * Created by xchunzhao on 02/05/2017.
 */
@Mapper // 标志为 Mybatis 的 Mapper
public interface CityDao {

    /**
     * 根据城市名称，查询城市信息
     *
     * @param empno 城市名
     */
    @Select("SELECT * FROM emp")
    // 返回 Map 结果集
    @Results({
            @Result(property = "empno", column = "empno"),
            @Result(property = "ename", column = "ename"),
            @Result(property = "job", column = "job"),
            @Result(property = "mgr", column = "mgr"),
            @Result(property = "hiredate", column = "hiredate"),
            @Result(property = "sal", column = "sal"),
            @Result(property = "comm", column = "COMM"),
    })
    List<City> findByEmpNo(@Param("empno") int empno);
}
