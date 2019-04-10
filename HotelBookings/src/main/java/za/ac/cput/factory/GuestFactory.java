package za.ac.cput.factory;

import za.ac.cput.domain.Guest;

public class GuestFactory {
    public static Guest findGuest(String name, String surname, int age){
        return new Guest.Builder().name(name).surname(surname).age(age).build();
    }
}
