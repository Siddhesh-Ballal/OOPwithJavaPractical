// A106 Siddhesh Ballal
// 13 May 2022


// Assignment 6
// Design and develop a context for given case study and implement an interface for Vehicles Consider the
// example of vehicles like bicycle, car, and bike. All Vehicles have common functionalities such as Gear
// Change, Speed up and apply breaks. Make an interface and put all these common functionalities. Bicycle,
// Bike, Car classes should be implemented for all these functionalities in their own class in their own 
// way.

import java.util.Scanner;
 
interface vehicle {
    void gear_change(int a);
 
    void speed_up();
 
    void apply_brakes();
 
    void display();
}
 
class bicycle implements vehicle {
    int gear, speed;
 
    bicycle() {
        System.out.println("\tBicycle started successfully.\n");
        gear = 1;
        speed = 10;
    }
 
    public void gear_change(int gearex) {
        if (gearex < 7 && gearex > 0) {
            gear = gearex;
            System.out.println("\tGear changed successfully\n\tCurrent gear is: " + gear + "\n");
        } else {
            System.out.println("Gear is out of range.\n");
        }
    }
 
    public void speed_up() {
        if ((speed + 5) < 50) {
            speed += 5;
            System.out.println("\n\tBicycle speed increased\n\tCurrent speed is: " + speed + " km/hr\n");
        } else {
            System.out.println("Speed cannot be increased above 50 km/hr\n");
        }
    }
 
    public void apply_brakes() {
        Scanner sc = new Scanner(System.in);
        int x;
        System.out.println("Enter your choice....\n1.DECREASE SPEED\n2.STOP BICYCLE\n");
        x = sc.nextInt();
        if (x == 1) {
            if ((speed - 5) > 0) {
                speed -= 5;
                System.out.println("Speed reduced successfully\n\tCurrent speed is: " + speed + " km/hr\n");
            } else {
                speed = 0;
                gear = 0;
                System.out.println("Bicycle stopped successfully.\n");
            }
        }
        if (x == 2) {
            speed = 0;
            gear = 0;
            System.out.println("Bicycle stopped successfully.\n");
        }
    }
 
    public void display() {
        System.out.println("YOUR BICYCLE SPEED IS: " + speed + " KM/HR\n AND GEAR IS: " + gear + "\n");
    }
}
 
class car implements vehicle {
    int gear, speed;
 
    car() {
        System.out.println("\tCar started successfully.\n");
        gear = 1;
        speed = 10;
    }
 
    public void gear_change(int gearex) {
        if (gearex < 7 && gearex > 0) {
            gear = gearex;
            System.out.println("\tGear changed successfully\n\tCurrent gear is: " + gear + "\n");
        } else {
            System.out.println("Gear is out of range.\n");
        }
    }
 
    public void speed_up() {
        if ((speed + 20) < 150) {
            speed += 20;
            System.out.println("\n\tCar speed increased\n\tCurrent speed is: " + speed + " km/hr\n");
        } else {
            System.out.println("Speed cannot be increased above 150 km/hr\n");
        }
    }
 
    public void apply_brakes() {
        Scanner sc = new Scanner(System.in);
        int x;
        System.out.println("Enter your choice....\n1.DECREASE SPEED\n2.STOP CAR\n");
        x = sc.nextInt();
        if (x == 1) {
            if ((speed - 20) > 0) {
                speed -= 20;
                System.out.println("Speed reduced successfully\n\tCurrent speed is: " + speed + " km/hr\n");
            } else {
                speed = 0;
                gear = 0;
                System.out.println("Car stopped successfully.\n");
            }
        }
        if (x == 2) {
            speed = 0;
            gear = 0;
            System.out.println("Car stopped successfully.\n");
        }
    }
 
    public void display() {
        System.out.println("YOUR CAR SPEED IS: " + speed + " KM/HR\n AND GEAR IS: " + gear + "\n");
    }
}
 
class bike implements vehicle {
    int gear, speed;
 
    bike() {
        System.out.println("\tBike started successfully.\n");
        gear = 1;
        speed = 10;
    }
 
    public void gear_change(int gearex) {
        if (gearex < 6 && gearex > 0) {
            gear = gearex;
            System.out.println("\tGear changed successfully\n\tCurrent gear is: " + gear + "\n");
        } else {
            System.out.println("Gear is out of range.\n");
        }
    }
 
    public void speed_up() {
        if ((speed + 20) < 100) {
            speed += 20;
            System.out.println("\n\tBike speed increased\n\tCurrent speed is: " + speed + " km/hr\n");
        } else {
            System.out.println("Speed cannot be increased above 100 km/hr\n");
        }
    }
 
    public void apply_brakes() {
        Scanner sc = new Scanner(System.in);
        int x;
        System.out.println("Enter your choice....\n1.DECREASE SPEED\n2.STOP BIKE\n");
        x = sc.nextInt();
        if (x == 1) {
            if ((speed - 20) > 0) {
                speed -= 20;
                System.out.println("Speed reduced successfully\n\tCurrent speed is: " + speed + " km/hr\n");
            } else {
                speed = 0;
                gear = 0;
                System.out.println("Bike stopped successfully.\n");
            }
        }
        if (x == 2) {
            speed = 0;
            gear = 0;
            System.out.println("Bike stopped successfully.\n");
        }
    }
 
    public void display() {
        System.out.println("YOUR BIKE SPEED IS: " + speed + " KM/HR\n AND GEAR IS: " + gear + "\n");
    }
}
 
public class Assignment_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int z, a;
        vehicle v = null;
        int y;
        bb: do {
            System.out.println("SELECT VEHICLE...\n\t1.BICYCLE\n\t2.CAR\n\t3.BIKE\n\t4.EXIT\n\tCHOICE:");
            y = sc.nextInt();
            if (y == 1) {
                v = new bicycle();
            } else if (y == 2) {
                v = new car();
            } else if (y == 3) {
                v = new bike();
            } else if (y == 4) {
                break bb;
            } else {
                System.out.println("INVALID INPUT!!\n");
            }
            if (0 < y && y <= 4) {
                aa: do {
                    System.out.println("\tPress 1 to Speed Up\n");
                    System.out.println("\tPress 2 to Change Gear\n");
                    System.out.println("\tPress 3 to Apply Brakes\n");
                    System.out.println("\tPress 4 to Display Vehicle Status\n");
                    System.out.println("\tPress 5 to Change Vehicle\n");
                    System.out.println("\tPress 6 to Exit\n");
                    z = sc.nextInt();
                    switch (z) {
                        case 1:
                            v.speed_up();
                            break;
                        case 2:
                            System.out.println("Enter the gear that you want:");
                            a = sc.nextInt();
                            v.gear_change(a);
                            break;
                        case 3:
                            v.apply_brakes();
                            break;
                        case 4:
                            v.display();
                            break;
                        case 5:
                            break aa;
                        case 6:
                            break;
                        default:
                            System.out.println("INVALID INPUT!!\n");
                            break;
                    }
                } while (z != 6);
            }
        } while (y != 4);
    }
}