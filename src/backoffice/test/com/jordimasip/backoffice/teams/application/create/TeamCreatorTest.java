package com.jordimasip.backoffice.teams.application.create;

import com.jordimasip.backoffice.teams.domain.Team;
import com.jordimasip.backoffice.teams.domain.TeamId;
import com.jordimasip.backoffice.teams.domain.TeamName;
import com.jordimasip.backoffice.teams.domain.TeamRepository;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

final class TeamCreatorTest {

    @Test
    void save_a_valid_team() {
        TeamRepository repository = mock(TeamRepository.class);
        TeamCreator creator = new TeamCreator(repository);
        CreateTeamRequest request = new CreateTeamRequest("1bace7d6-bb61-4c1b-ae72-415263673b61", "some-name");

        Team team = new Team(
            new TeamId(request.id()),
            new TeamName(request.name())
        );

        creator.create(request);

        verify(repository, atLeastOnce()).save(team);
    }
}
