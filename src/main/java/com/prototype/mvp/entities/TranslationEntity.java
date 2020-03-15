package com.prototype.mvp.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TranslationEntity extends BaseEntity {
    private String key;
    private String locale;
    private String value;
}
