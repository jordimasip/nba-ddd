package com.jordimasip.backoffice.teams.application.create;

public class CreateTeamRequest {

    private final String id;
    private final String name;

    public CreateTeamRequest(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String id() {
        return id;
    }

    public String name() {
        return name;
    }
}
