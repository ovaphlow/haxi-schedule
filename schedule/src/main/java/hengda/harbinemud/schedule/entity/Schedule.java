package hengda.harbinemud.schedule.entity;

import java.sql.Date;
import java.sql.Timestamp;

public class Schedule {
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
    private String last_p_gix;
    private Date last_date_p_gjx;
    private String last_total_mileage_p_gjx;
    private String mileage_after_last_p_gjx;
    private String next_p_gjx;
    private String next_mileage_p_gjx;
    private Date next_date;
    private Date date_p_sx;

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

    public String getLast_p_gix() {
        return last_p_gix;
    }

    public void setLast_p_gix(String last_p_gix) {
        this.last_p_gix = last_p_gix;
    }

    public Date getLast_date_p_gjx() {
        return last_date_p_gjx;
    }

    public void setLast_date_p_gjx(Date last_date_p_gjx) {
        this.last_date_p_gjx = last_date_p_gjx;
    }

    public String getLast_total_mileage_p_gjx() {
        return last_total_mileage_p_gjx;
    }

    public void setLast_total_mileage_p_gjx(String last_total_mileage_p_gjx) {
        this.last_total_mileage_p_gjx = last_total_mileage_p_gjx;
    }

    public String getMileage_after_last_p_gjx() {
        return mileage_after_last_p_gjx;
    }

    public void setMileage_after_last_p_gjx(String mileage_after_last_p_gjx) {
        this.mileage_after_last_p_gjx = mileage_after_last_p_gjx;
    }

    public String getNext_p_gjx() {
        return next_p_gjx;
    }

    public void setNext_p_gjx(String next_p_gjx) {
        this.next_p_gjx = next_p_gjx;
    }

    public String getNext_mileage_p_gjx() {
        return next_mileage_p_gjx;
    }

    public void setNext_mileage_p_gjx(String next_mileage_p_gjx) {
        this.next_mileage_p_gjx = next_mileage_p_gjx;
    }

    public Date getNext_date() {
        return next_date;
    }

    public void setNext_date(Date next_date) {
        this.next_date = next_date;
    }

    public Date getDate_p_sx() {
        return date_p_sx;
    }

    public void setDate_p_sx(Date date_p_sx) {
        this.date_p_sx = date_p_sx;
    }
}
