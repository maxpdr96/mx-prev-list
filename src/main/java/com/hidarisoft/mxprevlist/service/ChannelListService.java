package com.hidarisoft.mxprevlist.service;

import com.hidarisoft.mxprevlist.model.DTO.ChannelListDTO;
import com.hidarisoft.mxprevlist.model.entity.ChannelList;
import com.hidarisoft.mxprevlist.repository.IChannelListRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class ChannelListService {

    private final IChannelListRepository IChannelListRepository;

    public void addChannelList(ChannelListDTO channelListDTO){
        log.info("Add new Channel: {}", channelListDTO);
        ChannelList channelList = new ChannelList();
        channelList.buildChannelList(channelListDTO);
        IChannelListRepository.save(channelList);
    }
}
