package io.bswiercz.SenServer.room.dto;

import lombok.Builder;
import lombok.Getter;

import java.util.UUID;

@Builder
@Getter
public class ViewRoom {
    private UUID id;
    private String name;
}
