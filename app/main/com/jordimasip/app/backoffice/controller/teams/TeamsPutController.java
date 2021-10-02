package com.jordimasip.app.backoffice.controller.teams;

import com.jordimasip.backoffice.teams.application.create.CreateTeamRequest;
import com.jordimasip.backoffice.teams.application.create.TeamCreator;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class TeamsPutController {

    private TeamCreator creator;

    public TeamsPutController(TeamCreator creator) {
        this.creator = creator;
    }

    @PutMapping(value = "/teams/{id}")
    public ResponseEntity<String> create(
        @PathVariable String id,
        @RequestBody Request request
    ){
        creator.create(new CreateTeamRequest(id, request.name()));
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}

final class Request {

    private String name;

    String name() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
