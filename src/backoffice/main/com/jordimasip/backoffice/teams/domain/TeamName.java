package com.jordimasip.backoffice.teams.domain;

import com.jordimasip.shared.domain.StringValueObject;

public class TeamName extends StringValueObject {
    public TeamName(String value) {
        super(value);
    }

    private TeamName() {
        super("");
    }
}
