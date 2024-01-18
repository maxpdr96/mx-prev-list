package com.hidarisoft.mxprevlist.repository;

import com.hidarisoft.mxprevlist.model.entity.CpfList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICpfListRepository extends JpaRepository<CpfList, Long> {

}
