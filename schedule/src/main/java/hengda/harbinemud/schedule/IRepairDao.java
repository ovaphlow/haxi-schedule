package hengda.harbinemud.schedule;


import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

@Mapper
public interface IRepairDao {

    //查询原始数据
    List<Map<String, Object>> findSource(@Param("model") String model);
    //查询上次修竣数据
    Map<String, Object> findByTrain(@Param("tableName") String tableName,@Param("train") String train);
    //查询原始数据
    String findMileage(@Param("train") String train);
    //插入修竣数据
    int insert(@Param("tableName") String tableName, @Param("params") Map<String,Object> params);

}
