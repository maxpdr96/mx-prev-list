package com.hidarisoft.mxprevlist.controller;

import com.hidarisoft.mxprevlist.model.DTO.RestrictiveListDTO;
import com.hidarisoft.mxprevlist.service.RestrictiveListService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/restrictiveList")
@Slf4j
public class RestrictiveListController {

    @Autowired
    private RestrictiveListService restrictiveListService;

    @PostMapping
    private ResponseEntity<?> createRestrictiveList(@RequestBody RestrictiveListDTO restrictiveListDTO){
        log.info(String.valueOf(restrictiveListDTO));
        restrictiveListService.addRestrictiveList(restrictiveListDTO);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
