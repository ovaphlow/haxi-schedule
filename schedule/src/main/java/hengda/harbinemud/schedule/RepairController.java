package hengda.harbinemud.schedule;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping(value = "/api/schedule")
public class RepairController {

    @Autowired
    private IRepairDao repairDao;

    /**
     * 5A，5G二级修
     *
     * @param model 车型
     * @return
     */
    @RequestMapping(value = "/second/{model}", method = RequestMethod.GET)
    public Map<String, Object> second(@PathVariable("model") String model) {
        Map<String, Object> result = compute(model, "schedule_second", true);
        return result;
    }

    /**
     * 5A，5G探伤
     *
     * @param model 车型
     * @return
     */
    @RequestMapping(value = "/detectionFlaw/{model}", method = RequestMethod.GET)
    public Map<String, Object> detectionFlaw(@PathVariable("model") String model) {
        Map<String, Object> result = compute(model, "schedule_detectionflaw", false);
        return result;
    }

    /**
     * 5A，5G镟修
     *
     * @param model 车型
     * @return
     */
    @RequestMapping(value = "/turnRepair/{model}", method = RequestMethod.GET)
    public Map<String, Object> turnRepair(@PathVariable("model") String model) {
        Map<String, Object> result = compute(model, "schedule_turnrepair", false);
        return result;
    }

    /**
     * 5A，5G万向轴
     *
     * @param model 车型
     * @return
     */
    @RequestMapping(value = "/shaft/{model}", method = RequestMethod.GET)
    public Map<String, Object> shaft(@PathVariable("model") String model) {
        Map<String, Object> result = compute(model, "schedule_shaft", false);
        return result;
    }

    /**
     * 5A，5G M4
     *
     * @param model 车型
     * @return
     */
    @RequestMapping(value = "/m4/{model}", method = RequestMethod.GET)
    public Map<String, Object> m4(@PathVariable("model") String model) {
        Map<String, Object> result = compute(model, "schedule_m4", false);
        return result;
    }

    /**
     * 5A，5G设置二级修
     *
     * @param train 车组号
     * @return
     */
    @RequestMapping(value = "/insertSecond/{train}", method = RequestMethod.GET)
    public Map<String, Object> insertSecond(@PathVariable("train") String train) {
        Map<String, Object> result = insertDate("schedule_second", train, 40000, 55000, 66);
        return result;
    }

    /**
     * 5A，5G设置探伤
     *
     * @param train 车组号
     * @return
     */
    @RequestMapping(value = "/insertDetectionFlaw/{train}", method = RequestMethod.GET)
    public Map<String, Object> insertDetectionFlaw(@PathVariable("train") String train) {
        Map<String, Object> result = insertDate("schedule_detectionflaw", train, 168000, 198000, 0);
        return result;
    }

    /**
     * 5A，5G设置镟修
     *
     * @param train 车组号
     * @return
     */
    @RequestMapping(value = "/insertTurnRepair/{train}", method = RequestMethod.GET)
    public Map<String, Object> insertTurnRepair(@PathVariable("train") String train) {
        Map<String, Object> result = insertDate("schedule_turnrepair", train, 230000, 250000, 0);
        return result;
    }

    /**
     * 5A，5G设置万向轴
     *
     * @param train 车组号
     * @return
     */
    @RequestMapping(value = "/insertShaft/{train}", method = RequestMethod.GET)
    public Map<String, Object> insertShaft(@PathVariable("train") String train) {
        Map<String, Object> result = insertDate("schedule_shaft", train, 510000, 660000, 0);
        return result;
    }

    /**
     * 5A，5G设置M4
     *
     * @param train 车组号
     * @return
     */
    @RequestMapping(value = "/insertM4/{train}", method = RequestMethod.GET)
    public Map<String, Object> insertM4(@PathVariable("train") String train) {
        Map<String, Object> result = insertDate("schedule_m4", train, 510000, 660000, 0);
        return result;
    }

    /**
     * 380BG二级修探伤
     *
     * @param model 车型
     * @return
     */
    @RequestMapping(value = "/bgsecond/{model}", method = RequestMethod.GET)
    public Map<String, Object> bgsecond(@PathVariable("model") String model) {
        Map<String, Object> result = compute(model, "schedule_bgsecond", true);
        return result;
    }

    /**
     * 380BG设置二级修探伤
     *
     * @param train 车组号
     * @return
     */
    @RequestMapping(value = "/insertbgSecond/{train}", method = RequestMethod.GET)
    public Map<String, Object> insertbgSecond(@PathVariable("train") String train) {
        Map<String, Object> result = insertDate("schedule_bgsecond", train, 85000, 110000, 99);
        return result;
    }

    /**
     * 380BG I2修
     *
     * @param model 车型
     * @return
     */
    @RequestMapping(value = "/i2bgRepair/{model}", method = RequestMethod.GET)
    public Map<String, Object> i2bgRepair(@PathVariable("model") String model) {
        Map<String, Object> result = compute(model, "schedule_i2repair", true);
        return result;
    }

    /**
     * 380BG设置I2修
     *
     * @param train 车组号
     * @return
     */
    @RequestMapping(value = "/inserti2bgRepair/{train}", method = RequestMethod.GET)
    public Map<String, Object> inserti2bgRepair(@PathVariable("train") String train) {
        Map<String, Object> result = insertDate("schedule_i2repair", train, 15000, 20000, 20);
        return result;
    }

    /**
     * 380BG 镟修
     *
     * @param model 车型
     * @return
     */
    @RequestMapping(value = "/turnbgRepair/{model}", method = RequestMethod.GET)
    public Map<String, Object> turnbgRepair(@PathVariable("model") String model) {
        Map<String, Object> result = compute(model, "schedule_turnbgrepair", false);
        return result;
    }

    /**
     * 380BG设置镟修
     *
     * @param train 车组号
     * @return
     */
    @RequestMapping(value = "/insertturnbgRepair/{train}", method = RequestMethod.GET)
    public Map<String, Object> insertturnbgRepair(@PathVariable("train") String train) {
        Map<String, Object> result = insertDate("schedule_turnbgrepair", train, 170000, 200000, 0);
        return result;
    }

    /**
     * 380BG m3修
     *
     * @param model 车型
     * @return
     */
    @RequestMapping(value = "/m3Repair/{model}", method = RequestMethod.GET)
    public Map<String, Object> m3Repair(@PathVariable("model") String model) {
        Map<String, Object> result = compute(model, "schedule_m3bgrepair", false);
        return result;
    }

    /**
     * 380BG设置m3修
     *
     * @param train 车组号
     * @return
     */
    @RequestMapping(value = "/insertm3Repair/{train}", method = RequestMethod.GET)
    public Map<String, Object> insertm3Repair(@PathVariable("train") String train) {
        Map<String, Object> result = insertDate("schedule_m3bgrepair", train, 280000, 880000, 0);
        return result;
    }


    /**
     * 计算修竣相关数据
     *
     * @param tableName 查询的修竣表名
     * @param train     车组号
     * @param alarm     报警里程
     * @param next      必修里程
     * @param days      必修天数
     * @return 计算结果
     */
    public Map<String, Object> insertDate(String tableName,
            String train, int alarm, int next, int days) {
        Map<String, Object> result = new HashMap<String, Object>();
        try {
            String totalMileage = repairDao.findMileage(train);
            if (totalMileage != null) {
                Map<String, Object> newData = new HashMap<String, Object>();
                Date repairDate = new Date();
                newData.put("last_date", repairDate);
                newData.put("train", train);
                newData.put("last_mileage", totalMileage);
                int alarmMileage = Integer.valueOf(totalMileage) + alarm;
                newData.put("alarm_mileage", String.valueOf(alarmMileage));
                int nextMileage = Integer.valueOf(totalMileage) + next;
                newData.put("next_mileage", String.valueOf(nextMileage));
                if (days != 0) {
                    Date next_date = addDayOfDate(repairDate, days);
                    newData.put("next_date", next_date);
                }
                int insertResult = repairDao.insert(tableName, newData);
                if (insertResult > 0)
                    result.put("message", "");
                else
                    result.put("message", "插入失败");
                result.put("content", "");
            } else {
                result.put("content", "");
                result.put("message", "数据库中没有该车组里程数据");
            }
        } catch (Exception e) {
            e.printStackTrace();
            result.put("content", "");
            result.put("message", "服务器错误");
        }
        return result;
    }


    /**
     * 计算
     *
     * @param model      车型
     * @param tableName  表名
     * @param isHaveDate 有无天数限制
     * @return 计算结果
     */
    public Map<String, Object> compute(String model, String tableName, boolean isHaveDate) {
        Map<String, Object> result = new HashMap<String, Object>();
        try {
            List<Map<String, Object>> tempMap = new ArrayList<Map<String, Object>>();
            tempMap = repairDao.findSource(model);
            List<Map<String, Object>> resultMap = new ArrayList<Map<String, Object>>();
            if (tempMap.size() > 0) {
                for (Map<String, Object> schedule : tempMap) {
                    String train = (String) schedule.get("train");
                    int totalMileage = Integer.valueOf((String) schedule.get("total_mileage"));

                    Map<String, Object> lastData = new HashMap<String, Object>();
                    lastData = repairDao.findByTrain(tableName, train);
                    if (lastData != null) {
                        Date nowDate = new Date();
                        int lastMileage = Integer.valueOf((String) lastData.get("last_mileage"));
                        int nextMileage = Integer.valueOf((String) lastData.get("next_mileage"));
                        int alarmMileage = Integer.valueOf((String) lastData.get("alarm_mileage"));
                        String compareMileageResult;
                        if (isHaveDate) {
                            Date nextRepairDate = (Date) lastData.get("next_date");
                            if (nowDate.before(nextRepairDate)) {
                                compareMileageResult = compareMileage(totalMileage, alarmMileage, nextMileage);
                            } else {
                                compareMileageResult = "必修（时间）";
                            }
                        } else {
                            compareMileageResult = compareMileage(totalMileage, alarmMileage, nextMileage);
                        }

                        lastData.put("remark", compareMileageResult);
                        lastData.put("mileage_after_last", String.valueOf(totalMileage - lastMileage));
                        //返回source其他字段
                        lastData.put("uuid", schedule.get("uuid"));
                        lastData.put("counter", schedule.get("counter"));
                        lastData.put("upload_time", schedule.get("upload_time"));
                        lastData.put("file_name", schedule.get("file_name"));
                        lastData.put("p_xh", schedule.get("p_xh"));
                        lastData.put("p_psj", schedule.get("p_psj"));
                        lastData.put("p_yys", schedule.get("p_yys"));
                        lastData.put("model", schedule.get("model"));
                        lastData.put("update_time", schedule.get("update_time"));
                        lastData.put("total_mileage", schedule.get("total_mileage"));
                        resultMap.add(lastData);
                    }
                }
                result.put("content", resultMap);
                result.put("message", "");
            } else {
                result.put("content", "");
                result.put("message", "数据库中没有该车型数据");
            }

        } catch (Exception e) {
            e.printStackTrace();
            result.put("content", "");
            result.put("message", "服务器错误");
        }
        return result;
    }

    /**
     * 比较里程数
     *
     * @param totalMileage 总里程
     * @param alarmMileage 报警里程
     * @param nextMileage  必修里程
     * @return 结果
     */
    public String compareMileage(int totalMileage, int alarmMileage, int nextMileage) {
        String result;
        if (totalMileage < alarmMileage) {
            result = "正常";
        } else if (totalMileage < nextMileage) {
            result = "报警（里程）";
        } else {
            result = "必修（里程）";
        }
        return result;
    }


    /**
     * 在原日期的基础上增加天数
     *
     * @param date
     * @param i
     * @return
     */
    public static Date addDayOfDate(Date date, int i) {
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        c.add(Calendar.DATE, i);
        Date newDate = c.getTime();
        return newDate;
    }
}
