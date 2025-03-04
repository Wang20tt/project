package com.example.mes.system.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.sql.Timestamp;

@Data
public class Company implements Serializable {
    @TableId(value = "company_name")
    private Integer id;
    private String name;
    private Integer company_id;
    private Timestamp created_time;
    private String status;
    private String is_deleted;
    private String created_by;
    private Timestamp modified_time;
    private String modified_by;
}
