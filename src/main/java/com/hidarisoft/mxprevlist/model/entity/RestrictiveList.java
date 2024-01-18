package com.hidarisoft.mxprevlist.model.entity;

import com.hidarisoft.mxprevlist.model.DTO.RestrictiveListDTO;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "RESTRICTIVE_LIST")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RestrictiveList {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "typeRestrictiveList", nullable = false)
    private String typeRestrictiveList;

    public void buildRestrictiveList(RestrictiveListDTO restrictiveListDTO){
        this.setTypeRestrictiveList(restrictiveListDTO.getTypeRestrictiveList());
    }
}
