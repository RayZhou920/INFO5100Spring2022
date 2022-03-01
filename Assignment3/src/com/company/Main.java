package com.company;

public class Main {

    public static void main(String[] args) {
	    // 5100 Assignment3 Code by Rui Zhou
        SeattlePoliceDepartment spd = new SeattlePoliceDepartment();

        Person person1 = new Person("Jack", 21);
        Person person2 = new Person("Tony", 22);
        Person person3 = new Person("Maria", 23);
        Person person4 = new Person("Wong", 25);

        person2.subscribe(spd);
        person4.subscribe(spd);
        person3.subscribe(spd);

        spd.NotifyCitizens("Notification1");

        person3.unsubscribe(spd);
        person2.unsubscribe(spd);

        spd.NotifyCitizens("Notification2");
    }

}
