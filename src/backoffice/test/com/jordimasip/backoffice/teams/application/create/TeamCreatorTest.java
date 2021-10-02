package com.jordimasip.backoffice.teams.application.create;

import com.jordimasip.backoffice.teams.domain.Team;
import com.jordimasip.backoffice.teams.domain.TeamRepository;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

final class TeamCreatorTest {

    @Test
    void save_a_valid_team() {
        TeamRepository repository = mock(TeamRepository.class);
        TeamCreator creator = new TeamCreator(repository);

        Team team = new Team("some-id", "some-name");

        creator.create(team.id(), team.name());

        verify(repository, atLeastOnce()).save(team);
    }
}
