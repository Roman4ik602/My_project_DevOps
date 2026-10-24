package com.example.footballplayers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.Map;

@RestController
public class PlayerController {

    @GetMapping("/players")
    public List<Map<String, String>> getPlayers() {
        return List.of(
            Map.of(
                "name", "Lionel Messi",
                "country", "Argentina",
                "position", "Forward",
                "style", "Dribbling, passing"
            ),
            Map.of(
                "name", "Cristiano Ronaldo",
                "country", "Portugal",
                "position", "Forward",
                "style", "Speed, shooting"
            ),
            Map.of(
                "name", "Kylian Mbappe",
                "country", "France",
                "position", "Forward",
                "style", "Speed, acceleration, finishing"
            ),
            Map.of(
                "name", "Erling Haaland",
                "country", "Norway",
                "position", "Forward",
                "style", "Physical strength, speed, finishing"
            )
        );
    }
}






