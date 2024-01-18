package com.hidarisoft.mxprevlist.controller;

import com.hidarisoft.mxprevlist.model.entity.CpfList;
import com.hidarisoft.mxprevlist.repository.ICpfListRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
@Slf4j
public class CpfController {

    @Autowired
    private ICpfListRepository ICpfListRepository;

    @PostMapping
    private ResponseEntity<?> createCpfList(@RequestBody CpfList cpfList){
        log.info(String.valueOf(cpfList));
        ICpfListRepository.save(cpfList);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
