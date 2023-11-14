package model;

import lombok.*;
import lombok.experimental.FieldDefaults;

/**
 * @author Serhii Klunniy
 */
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Car {

    static int count;
    int id;
    String name;
    String color;

    public Car(String name) {
        this.id = ++count;    //count = 0 + 1;
        this.name = name;
        this.color = "red";
    }

}
