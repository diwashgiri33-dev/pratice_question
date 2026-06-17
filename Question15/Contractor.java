package Question15;

import java.io.*;
import java.util.*;
class Contractor extends Employee {

    int hours;
    double rate;

    Contractor(String name,
               int hours,
               double rate) {

        super(name);

        this.hours = hours;
        this.rate = rate;
    }

    double calculatePay() {

        return hours * rate;
    }
}

