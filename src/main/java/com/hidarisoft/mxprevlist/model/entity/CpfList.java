package com.hidarisoft.mxprevlist.model.entity;

import com.hidarisoft.mxprevlist.enums.TypeList;
import com.hidarisoft.mxprevlist.model.IGenericList;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "CPF_LIST_DATA")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CpfList implements IGenericList {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "cpf", nullable = false)
    private String cpf;

    @Override
    public TypeList typeList() {
        return TypeList.CPF;
    }
}
