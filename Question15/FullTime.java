package Question15;

import java.io.*;
import java.util.*;
class FullTime extends Employee {

    double salary;

    FullTime(String name,
             double salary) {

        super(name);
        this.salary = salary;
    }

    double calculatePay() {

        return salary;
    }
}