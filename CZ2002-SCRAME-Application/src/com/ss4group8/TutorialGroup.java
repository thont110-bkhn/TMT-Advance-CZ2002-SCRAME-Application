package com.ss4group8;

import java.util.ArrayList;

public class TutorialGroup {
    private String groupName;
    private int availableVacancies;

    public TutorialGroup(String groupName, int availableVacancies) {
        this.groupName = groupName;
        this.availableVacancies = availableVacancies;
    }

    public String getGroupName() { return this.groupName; }

    public int getAvailableVacancies() { return this.availableVacancies; }

    public void enrolledIn () {
        this.availableVacancies -= 1;
    }

}