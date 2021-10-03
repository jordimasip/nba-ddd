package com.jordimasip.backoffice.teams.infrastructure.persistence;

import com.jordimasip.backoffice.teams.domain.Team;
import com.jordimasip.backoffice.teams.domain.TeamRepository;
import com.jordimasip.shared.domain.Service;
import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Primary;

import javax.transaction.Transactional;

@Service
public class MySqlTeamRepository implements TeamRepository {
    private SessionFactory sessionFactory;

    public MySqlTeamRepository(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    @Transactional
    public void save(Team team) {
        sessionFactory.getCurrentSession().save(team);
    }

}
