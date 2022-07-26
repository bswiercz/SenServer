package io.bswiercz.SenServer.room;

import io.bswiercz.SenServer.room.dto.ViewRoom;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.UUID;

@RestController
class RoomController {
    @GetMapping("room")
    Collection<ViewRoom> getRooms() {
        return List.of(
                ViewRoom.builder()
                        .id(UUID.randomUUID())
                        .name("Pokoj")
                        .build()
        );
    }

    @PostMapping("room")
    void createRoom() {}
}
