package com.hidarisoft.mxprevlist.repository;

import com.hidarisoft.mxprevlist.model.entity.RestrictiveList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRestrictiveListRepository extends JpaRepository<RestrictiveList, Long> {
}
