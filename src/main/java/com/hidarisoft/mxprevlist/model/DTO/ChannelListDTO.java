package com.hidarisoft.mxprevlist.model.DTO;

import com.hidarisoft.mxprevlist.utils.IUppercaseAnnotation;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class ChannelListDTO {
    @NotBlank(message = "{channelList.channel}")
    @IUppercaseAnnotation
    private String channel;
}
