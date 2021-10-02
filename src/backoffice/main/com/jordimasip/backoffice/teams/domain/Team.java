package com.jordimasip.backoffice.teams.domain;


import java.util.Objects;

public class Team {

    private final TeamId id;

    private final TeamName name;

    public Team(TeamId id, TeamName name) {
        this.id = id;
        this.name = name;
    }

    public TeamId id() {
        return id;
    }

    public TeamName name() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Team team = (Team) o;
        return Objects.equals(id, team.id) && Objects.equals(name, team.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

}
