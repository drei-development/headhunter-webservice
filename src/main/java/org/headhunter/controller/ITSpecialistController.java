package org.headhunter.controller;

import org.headhunter.model.ITSpecialist;
import org.headhunter.model.Message;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;


@RestController
public class ITSpecialistController {

    @PostMapping(value = "/create", consumes = "application/json", produces = "application/json")
    public ResponseEntity<Message> createITSpecialist(@RequestBody ITSpecialist specialist) {
        ArrayList<String> languages = specialist.getProgrammingLanguages();
        if (languages.size() > 0) {
            languages.forEach((l) -> System.out.println(l));
        }
        return ResponseEntity.ok(new Message("You created an ITSpecialist"));
    }

    @PutMapping(value = "/update", consumes = "application/json", produces = "application/json")
    public ResponseEntity<Message> updateITSpecialist(ITSpecialist specialist) {
        System.out.println(specialist.toString());
        return ResponseEntity.ok(new Message("You updated an ITSpecialist"));
    }


}
