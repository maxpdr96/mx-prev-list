package com.hidarisoft.mxprevlist.service;

import com.hidarisoft.mxprevlist.model.DTO.RestrictiveListDTO;
import com.hidarisoft.mxprevlist.model.entity.RestrictiveList;
import com.hidarisoft.mxprevlist.repository.IRestrictiveListRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class RestrictiveListService {

    private final IRestrictiveListRepository IRestrictiveListRepository;

    public void addRestrictiveList(RestrictiveListDTO restrictiveListDTO){
        RestrictiveList restrictiveList = new RestrictiveList();
        restrictiveList.buildRestrictiveList(restrictiveListDTO);
        IRestrictiveListRepository.save(restrictiveList);
    }

}
