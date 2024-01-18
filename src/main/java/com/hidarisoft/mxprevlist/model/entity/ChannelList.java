package com.hidarisoft.mxprevlist.model.entity;

import com.hidarisoft.mxprevlist.model.DTO.ChannelListDTO;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "CHANNEL_LIST")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ChannelList {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "channel", nullable = false)
    private String channel;

    public void buildChannelList(ChannelListDTO channelListDTO){
        this.setChannel(channelListDTO.getChannel());
    }
}
