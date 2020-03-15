package com.prototype.mvp.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

import org.hibernate.annotations.Type;
import org.springframework.boot.configurationprocessor.json.JSONObject;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class GroupEntity extends BaseEntity {
    private String code;
    private String name;
    private String desc;

    @Type(type = "jsonb")
    @Column(columnDefinition = "jsonb")
    @Basic(fetch = FetchType.EAGER)
    private JSONObject customSchema;

    @Type(type = "jsonb")
    @Column(columnDefinition = "jsonb")
    @Basic(fetch = FetchType.EAGER)
    private JSONObject customForms;
}
