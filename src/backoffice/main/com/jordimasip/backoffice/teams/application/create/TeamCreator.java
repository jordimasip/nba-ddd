package com.jordimasip.backoffice.teams.application.create;

import com.jordimasip.backoffice.teams.domain.Team;
import com.jordimasip.backoffice.teams.domain.TeamRepository;
import com.jordimasip.shared.domain.Service;

@Service
final public class TeamCreator {

    private TeamRepository repository;

    public TeamCreator(TeamRepository repository) {
        this.repository = repository;
    }

    public void create(String id, String name) {
        Team team = new Team(id, name);

        repository.save(team);
    }
}
