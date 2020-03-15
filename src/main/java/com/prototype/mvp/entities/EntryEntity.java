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
public class EntryEntity extends BaseEntity {
    private String code;
    private String desc;
    private Integer seqId;

    @Type(type = "jsonb")
    @Column(columnDefinition = "jsonb")
    @Basic(fetch = FetchType.EAGER)
    private JSONObject customFields;
}
