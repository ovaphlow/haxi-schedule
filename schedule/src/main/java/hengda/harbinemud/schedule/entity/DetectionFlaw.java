package hengda.harbinemud.schedule.entity;

import java.sql.Timestamp;
import java.util.Date;

public class DetectionFlaw {
    private Long id;
    private String uuid;
    private Long counter;
    private Timestamp upload_time;
    private String file_name;
    private String p_xh;
    private String p_psj;
    private String p_yys;
    private String model;
    private String train;
    private Timestamp update_time;
    private String total_mileage;
    private Date last_date;
    private String last_total_mileage;
    private String mileage_after_last;
    private String next_mileage;
    private String remark;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public Long getCounter() {
        return counter;
    }

    public void setCounter(Long counter) {
        this.counter = counter;
    }

    public Timestamp getUpload_time() {
        return upload_time;
    }

    public void setUpload_time(Timestamp upload_time) {
        this.upload_time = upload_time;
    }

    public String getFile_name() {
        return file_name;
    }

    public void setFile_name(String file_name) {
        this.file_name = file_name;
    }

    public String getP_xh() {
        return p_xh;
    }

    public void setP_xh(String p_xh) {
        this.p_xh = p_xh;
    }

    public String getP_psj() {
        return p_psj;
    }

    public void setP_psj(String p_psj) {
        this.p_psj = p_psj;
    }

    public String getP_yys() {
        return p_yys;
    }

    public void setP_yys(String p_yys) {
        this.p_yys = p_yys;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getTrain() {
        return train;
    }

    public void setTrain(String train) {
        this.train = train;
    }

    public Timestamp getUpdate_time() {
        return update_time;
    }

    public void setUpdate_time(Timestamp update_time) {
        this.update_time = update_time;
    }

    public String getTotal_mileage() {
        return total_mileage;
    }

    public void setTotal_mileage(String total_mileage) {
        this.total_mileage = total_mileage;
    }

    public Date getLast_date() {
        return last_date;
    }

    public void setLast_date(Date last_date) {
        this.last_date = last_date;
    }

    public String getLast_total_mileage() {
        return last_total_mileage;
    }

    public void setLast_total_mileage(String last_total_mileage) {
        this.last_total_mileage = last_total_mileage;
    }

    public String getMileage_after_last() {
        return mileage_after_last;
    }

    public void setMileage_after_last(String mileage_after_last) {
        this.mileage_after_last = mileage_after_last;
    }

    public String getNext_mileage() {
        return next_mileage;
    }

    public void setNext_mileage(String next_mileage) {
        this.next_mileage = next_mileage;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
