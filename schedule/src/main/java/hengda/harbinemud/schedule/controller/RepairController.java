package hengda.harbinemud.schedule.controller;

import hengda.harbinemud.schedule.dao.IRepairDao;
import hengda.harbinemud.schedule.entity.DetectionFlaw;
import hengda.harbinemud.schedule.entity.ScheduleSecond;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
@RequestMapping(value = "/api/repair")
public class RepairController {

    @Autowired
    private IRepairDao repairDao;

    /**
     * 5A，5G二级修
     * @param model 车型
     * @return
     */
    @RequestMapping(value = "/second", method = RequestMethod.POST)
    public Map<String, Object> requireSecond(String model){
        Map<String, Object> result = new HashMap<String, Object>();
        try {
            List<ScheduleSecond> schedules = repairDao.findSecondByModel(model);
            for (ScheduleSecond schedule : schedules) {
                Date lastRepairDate = schedule.getLast_date();
                long sustainDay = differenceOfDate(lastRepairDate);
                int totalMileage = Integer.parseInt(schedule.getTotal_mileage());
                int lastMileage = Integer.parseInt(schedule.getLast_total_mileage());
                int mileage = totalMileage - lastMileage;
                if (sustainDay < 66){
                    if (mileage < 40000){
                        schedule.setRemark("正常");
                    }else if (mileage < 55000){
                        schedule.setRemark("报警");
                    }else{
                        schedule.setRemark("必修");
                    }
                }else{
                    schedule.setRemark("必修");
                }
                schedule.setMileage_after_last(String.valueOf(mileage));
                schedule.setNext_mileage(String.valueOf(lastMileage + 55000));
                schedule.setNext_date(addDayOfDate(lastRepairDate,66));
            }
            result.put("content", schedules);
            result.put("message", "查询成功");
        }catch (Exception e){
            e.printStackTrace();
            result.put("content", "");
            result.put("message", "服务器错误");
        }
        return result;
    }

    /**
     * 5A，5G探伤
     * @param model 车型
     * @return
     */
    @RequestMapping(value = "/detectionFlaw", method = RequestMethod.POST)
    public Map<String, Object> detectionFlaw(String model){
        Map<String, Object> result = new HashMap<String, Object>();
        try {
            List<DetectionFlaw> schedules = repairDao.findFlawByModel(model);
            for (DetectionFlaw schedule : schedules) {
                int totalMileage = Integer.parseInt(schedule.getTotal_mileage());
                int lastMileage = Integer.parseInt(schedule.getLast_total_mileage());
                int mileage = totalMileage - lastMileage;

                if (mileage < 168000){
                    schedule.setRemark("正常");
                }else if (mileage < 198000){
                    schedule.setRemark("报警");
                }else{
                    schedule.setRemark("必修");
                }

                schedule.setMileage_after_last(String.valueOf(mileage));
                schedule.setNext_mileage(String.valueOf(lastMileage + 198000));

            }
            result.put("content", schedules);
            result.put("message", "查询成功");
        }catch (Exception e){
            e.printStackTrace();
            result.put("content", "");
            result.put("message", "服务器错误");
        }
        return result;
    }

    /**
     * 5A，5G镟修
     * @param model 车型
     * @return
     */
    @RequestMapping(value = "/turnRepair", method = RequestMethod.POST)
    public Map<String, Object> turnRepair(String model){
        Map<String, Object> result = new HashMap<String, Object>();
        try {
            List<DetectionFlaw> schedules = repairDao.findTurnByModel(model);
            for (DetectionFlaw schedule : schedules) {
                int totalMileage = Integer.parseInt(schedule.getTotal_mileage());
                int lastMileage = Integer.parseInt(schedule.getLast_total_mileage());
                int mileage = totalMileage - lastMileage;

                if (mileage < 230000){
                    schedule.setRemark("正常");
                }else if (mileage < 250000){
                    schedule.setRemark("报警");
                }else{
                    schedule.setRemark("必修");
                }
                schedule.setMileage_after_last(String.valueOf(mileage));
                schedule.setNext_mileage(String.valueOf(lastMileage + 250000));

            }
            result.put("content", schedules);
            result.put("message", "查询成功");
        }catch (Exception e){
            e.printStackTrace();
            result.put("content", "");
            result.put("message", "服务器错误");
        }
        return result;
    }

    /**
     * 5A，5G万向轴
     * @param model 车型
     * @return
     */
    @RequestMapping(value = "/shaft", method = RequestMethod.POST)
    public Map<String, Object> shaft(String model){
        Map<String, Object> result = new HashMap<String, Object>();
        try {
            List<DetectionFlaw> schedules = repairDao.findShaftByModel(model);
            for (DetectionFlaw schedule : schedules) {
                int totalMileage = Integer.parseInt(schedule.getTotal_mileage());
                int lastMileage = Integer.parseInt(schedule.getLast_total_mileage());
                int mileage = totalMileage - lastMileage;

                if (mileage < 510000){
                    schedule.setRemark("正常");
                }else if (mileage < 660000){
                    schedule.setRemark("报警");
                }else{
                    schedule.setRemark("必修");
                }
                schedule.setMileage_after_last(String.valueOf(mileage));
                schedule.setNext_mileage(String.valueOf(lastMileage + 660000));

            }
            result.put("content", schedules);
            result.put("message", "查询成功");
        }catch (Exception e){
            e.printStackTrace();
            result.put("content", "");
            result.put("message", "服务器错误");
        }
        return result;
    }

    /**
     * 5A，5G M4
     * @param model 车型
     * @return
     */
    @RequestMapping(value = "/m4", method = RequestMethod.POST)
    public Map<String, Object> m4(String model){
        Map<String, Object> result = new HashMap<String, Object>();
        try {
            List<DetectionFlaw> schedules = repairDao.findM4ByModel(model);
            for (DetectionFlaw schedule : schedules) {
                int totalMileage = Integer.parseInt(schedule.getTotal_mileage());
                int lastMileage = Integer.parseInt(schedule.getLast_total_mileage());
                int mileage = totalMileage - lastMileage;

                if (mileage < 510000){
                    schedule.setRemark("正常");
                }else if (mileage < 660000){
                    schedule.setRemark("报警");
                }else{
                    schedule.setRemark("必修");
                }
                schedule.setMileage_after_last(String.valueOf(mileage));
                schedule.setNext_mileage(String.valueOf(lastMileage + 660000));

            }
            result.put("content", schedules);
            result.put("message", "查询成功");
        }catch (Exception e){
            e.printStackTrace();
            result.put("content", "");
            result.put("message", "服务器错误");
        }
        return result;
    }

    /**
     * 380BG 二级修探伤
     * @param model 车型
     * @return
     */
    @RequestMapping(value = "/bgsecond", method = RequestMethod.POST)
    public Map<String, Object> requireBGsecAndFlaw(String model){
        Map<String, Object> result = new HashMap<String, Object>();
        try {
            List<ScheduleSecond> schedules = repairDao.findSecondByModel(model);
            for (ScheduleSecond schedule : schedules) {
                Date lastRepairDate = schedule.getLast_date();
                long sustainDay = differenceOfDate(lastRepairDate);
                int totalMileage = Integer.parseInt(schedule.getTotal_mileage());
                int lastMileage = Integer.parseInt(schedule.getLast_total_mileage());
                int mileage = totalMileage - lastMileage;
                if (sustainDay < 99){
                    if (mileage < 85000){
                        schedule.setRemark("正常");
                    }else if (mileage < 110000){
                        schedule.setRemark("报警");
                    }else{
                        schedule.setRemark("必修");
                    }
                }else{
                    schedule.setRemark("必修");
                }
                schedule.setMileage_after_last(String.valueOf(mileage));
                schedule.setNext_mileage(String.valueOf(lastMileage + 110000));
                schedule.setNext_date(addDayOfDate(lastRepairDate,99));
            }
            result.put("content", schedules);
            result.put("message", "查询成功");
        }catch (Exception e){
            e.printStackTrace();
            result.put("content", "");
            result.put("message", "服务器错误");
        }
        return result;
    }

    /**
     * 380BG I2修
     * @param model 车型
     * @return
     */

    @RequestMapping(value = "/I2bgRepair", method = RequestMethod.POST)
    public Map<String, Object> i2bgRepair(String model){
        Map<String, Object> result = new HashMap<String, Object>();
        try {
            List<ScheduleSecond> schedules = repairDao.findbgI2ByModel(model);
            for (ScheduleSecond schedule : schedules) {
                Date lastRepairDate = schedule.getLast_date();
                long sustainDay = differenceOfDate(lastRepairDate);
                int totalMileage = Integer.parseInt(schedule.getTotal_mileage());
                int lastMileage = Integer.parseInt(schedule.getLast_total_mileage());
                int mileage = totalMileage - lastMileage;
                if (sustainDay < 20){
                    if (mileage < 15000){
                        schedule.setRemark("正常");
                    }else if (mileage < 20000){
                        schedule.setRemark("报警");
                    }else{
                        schedule.setRemark("必修");
                    }
                }else{
                    schedule.setRemark("必修");
                }
                schedule.setMileage_after_last(String.valueOf(mileage));
                schedule.setNext_mileage(String.valueOf(lastMileage + 20000));
                schedule.setNext_date(addDayOfDate(lastRepairDate,20));
            }
            result.put("content", schedules);
            result.put("message", "查询成功");
        }catch (Exception e){
            e.printStackTrace();
            result.put("content", "");
            result.put("message", "服务器错误");
        }
        return result;
    }

    /**
     * 380BG 镟修
     * @param model 车型
     * @return
     */
    @RequestMapping(value = "/turnbgRepair", method = RequestMethod.POST)
    public Map<String, Object> turnbgRepair(String model){
        Map<String, Object> result = new HashMap<String, Object>();
        try {
            List<DetectionFlaw> schedules = repairDao.findbgTurnByModel(model);
            for (DetectionFlaw schedule : schedules) {
                int totalMileage = Integer.parseInt(schedule.getTotal_mileage());
                int lastMileage = Integer.parseInt(schedule.getLast_total_mileage());
                int mileage = totalMileage - lastMileage;

                if (mileage < 170000){
                    schedule.setRemark("正常");
                }else if (mileage < 200000){
                    schedule.setRemark("报警");
                }else{
                    schedule.setRemark("必修");
                }
                schedule.setMileage_after_last(String.valueOf(mileage));
                schedule.setNext_mileage(String.valueOf(lastMileage + 200000));

            }
            result.put("content", schedules);
            result.put("message", "查询成功");
        }catch (Exception e){
            e.printStackTrace();
            result.put("content", "");
            result.put("message", "服务器错误");
        }
        return result;
    }

    /**
     * 380BG M3修
     * @param model 车型
     * @return
     */
    @RequestMapping(value = "/M3Repair", method = RequestMethod.POST)
    public Map<String, Object> m3bgRepair(String model){
        Map<String, Object> result = new HashMap<String, Object>();
        try {
            List<DetectionFlaw> schedules = repairDao.findbgM3ByModel(model);
            for (DetectionFlaw schedule : schedules) {
                int totalMileage = Integer.parseInt(schedule.getTotal_mileage());
                int lastMileage = Integer.parseInt(schedule.getLast_total_mileage());
                int mileage = totalMileage - lastMileage;

                if (mileage < 280000){
                    schedule.setRemark("正常");
                }else if (mileage < 880000){
                    schedule.setRemark("报警");
                }else{
                    schedule.setRemark("必修");
                }
                schedule.setMileage_after_last(String.valueOf(mileage));
                schedule.setNext_mileage(String.valueOf(lastMileage + 880000));

            }
            result.put("content", schedules);
            result.put("message", "查询成功");
        }catch (Exception e){
            e.printStackTrace();
            result.put("content", "");
            result.put("message", "服务器错误");
        }
        return result;
    }

    /**
     * 计算距离上次修竣的天数
     * @param lastRepairDate 上次修竣日期
     * @return 天数
     */
    public static long differenceOfDate(Date lastRepairDate){
        Date nowDate = new Date();
        long timeNow = nowDate.getTime();
        long timeOld = lastRepairDate.getTime();
        return (timeNow-timeOld)/(86400000);
    }

    /**
     * 在原日期的基础上增加天数
     * @param date
     * @param i
     * @return
     */
    public static Date addDayOfDate(Date date,int i){
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        c.add(Calendar.DATE, i);
        Date newDate = c.getTime();
        return newDate;
    }
}
