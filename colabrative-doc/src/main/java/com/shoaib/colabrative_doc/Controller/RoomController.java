package com.shoaib.colabrative_doc.Controller;

import com.shoaib.colabrative_doc.Model.Room;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@Controller
public class RoomController {
    private String generateRoomId() {
        int length = 10;
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            int index = random.nextInt(characters.length());
            sb.append(characters.charAt(index));
        }
        return sb.toString();
    }

//    @PostMapping("/rooms/create")
//    public ResponseEntity<Room> createRoom() {
//        String roomId = generateRoomId();
//        // You can customize the room name however you want.
//        String roomName = "Room " + roomId;
//        Room room = new Room(roomId, roomName);
//        return ResponseEntity.ok(room);
//    }

}
