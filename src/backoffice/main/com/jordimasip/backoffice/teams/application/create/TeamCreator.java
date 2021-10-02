package com.jordimasip.backoffice.teams.application.create;

import com.jordimasip.backoffice.teams.domain.Team;
import com.jordimasip.backoffice.teams.domain.TeamId;
import com.jordimasip.backoffice.teams.domain.TeamName;
import com.jordimasip.backoffice.teams.domain.TeamRepository;
import com.jordimasip.shared.domain.Service;

@Service
final public class TeamCreator {

    private final TeamRepository repository;

    public TeamCreator(TeamRepository repository) {
        this.repository = repository;
    }

    public void create(CreateTeamRequest request) {
        Team team = new Team(
            new TeamId(request.id()),
            new TeamName(request.name())
        );

        repository.save(team);
    }
}
