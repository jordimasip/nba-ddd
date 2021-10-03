package com.jordimasip.backoffice.teams.infrastructure.persistence;

import ch.qos.logback.classic.util.LogbackMDCAdapter;
import com.jordimasip.backoffice.teams.domain.Team;
import com.jordimasip.backoffice.teams.domain.TeamRepository;
import com.jordimasip.shared.domain.Service;

import java.util.HashMap;

//@Service
public class InMemoryTeamRepository implements TeamRepository {

    private HashMap<String, Team> teams = new HashMap<>();

    @Override
    public void save(Team team) {
        teams.put(team.id().value(), team);
    }

}
