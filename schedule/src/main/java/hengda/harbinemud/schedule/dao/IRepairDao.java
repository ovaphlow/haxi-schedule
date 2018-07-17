package hengda.harbinemud.schedule.dao;

import hengda.harbinemud.schedule.entity.DetectionFlaw;
import hengda.harbinemud.schedule.entity.ScheduleSecond;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface IRepairDao {

    //二级修
    List<ScheduleSecond> findSecondByModel(String model);
    //探伤
    List<DetectionFlaw> findFlawByModel(String model);
    //镟修
    List<DetectionFlaw> findTurnByModel(String model);
    //万向轴
    List<DetectionFlaw> findShaftByModel(String model);
    //M4
    List<DetectionFlaw> findM4ByModel(String model);
    //380BG二级修探伤
    List<ScheduleSecond> findbgSecondByModel(String model);
    //380BG I2修
    List<ScheduleSecond> findbgI2ByModel(String model);
    //380BG 镟修
    List<DetectionFlaw> findbgTurnByModel(String model);
    //380BG M3修
    List<DetectionFlaw> findbgM3ByModel(String model);

}
