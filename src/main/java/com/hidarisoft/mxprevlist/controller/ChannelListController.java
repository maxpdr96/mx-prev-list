package com.hidarisoft.mxprevlist.controller;

import com.hidarisoft.mxprevlist.model.DTO.ChannelListDTO;
import com.hidarisoft.mxprevlist.service.ChannelListService;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/channelList")
@Slf4j
public class ChannelListController {

    @Autowired
    private ChannelListService channelListService;

    @PostMapping
    private ResponseEntity<?> createChannelList(@Valid @RequestBody ChannelListDTO channelListDTO) {
        log.info(String.valueOf(channelListDTO));
        channelListService.addChannelList(channelListDTO);
        return ResponseEntity.ok("OK");
    }
}
