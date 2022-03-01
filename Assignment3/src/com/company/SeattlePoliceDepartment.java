package com.company;

import java.util.ArrayList;

public class SeattlePoliceDepartment {
    ArrayList<Person> person;
    String notification;

    public SeattlePoliceDepartment() {
        this.person = new ArrayList<>();
    }

    // notify the person
    public void NotifyCitizens(String notification) {
        this.notification = notification;
        for (Person p : person) {
            p.getNotification(this);
        }
    }
}
