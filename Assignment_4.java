// A106 Siddhesh Ballal
// 26 April 2022

// Assignment 4
// Design and develop inheritance for a given case study and identify objects and relationships in it.
// Employee class with Emp_name, Emp_id, Address, Mail_id, and Mobile_no as data members. Inherit the
// classes, Programmer, Assistant Professor, Associate Professor and Professor from employee class. Add
// Basic Pay (BP) as the member of all the inherited classes with 97% of BP, DA 10 % of BP, HRA is 12% of
// BP, and PF is 0.1% of BP for staff club fund. Generate pay slips for the employees with their gross 
// and net salary.

import java.util.Scanner;

class Employee {
  Long mobilenumber;
  int EmpID;
  String address, email, Name, Post;
  double BP, DA, HRA, PF, Club;
  Scanner S = new Scanner(System.in);

  public void enterinfo() {
    System.out.println("Enter Employee ID: ");
    EmpID = S.nextInt();
    S.nextLine();
    System.out.println("Enter Name: ");
    Name = S.nextLine();
    System.out.println("Enter Email: ");
    email = S.nextLine();
    System.out.println("Enter Address: ");
    address = S.nextLine();
    System.out.println("Enter Mobile Number: ");
    mobilenumber = S.nextLong();
  }

  void DisplayInfo() {
    System.out.println("**********************************");
    System.out.println("EmpID: " + EmpID);
    System.out.println("Name: " + Name);
    System.out.println("Post: " + Post);
    System.out.println("Mobile Number:" + mobilenumber);
    System.out.println("Email ID: " + email);
    System.out.println("Address: " + address);
  }

  void enterPay() {
    System.out.println("Enter Basic Pay: ");
    BP = S.nextDouble();
  }

  void Generate_Payslip() {
    DA = 0.97 * BP;
    HRA = 0.1 * BP;
    PF = 0.12 * BP;
    Club = 0.0001 * BP;
    Double Gross = BP + DA + HRA;
    Double Net = Gross - PF - Club;

    System.out.println("**********************************");
    System.out.println("PAYMENT SLIP FOR " + EmpID);
    System.out.println("**********************************");
    this.DisplayInfo();
    System.out.println("Basic Pay: " + BP);
    System.out.println("DA: " + DA);
    System.out.println("HRA: " + HRA);
    System.out.println("PF: " + PF);
    System.out.println("Club: " + Club);
    System.out.println("Gross Pay: " + Gross);
    System.out.println("Net Pay: " + Net);
    System.out.println("**********************************");
  }
}

class Programmer extends Employee {
  {
    this.Post = "PROGRAMMER";
  }
}

class AssistantProfessor extends Employee {
  {
    this.Post = "ASSISTANT PROFESSOR";
  }
}

class AssociateProfessor extends Employee {
  {
    this.Post = "ASSOCIATE PROFESSOR";
  }
}

class Professor extends Employee {
  {
    this.Post = "PROFESSOR";
  }
}

public class Assignment_4 {
  public static void main(String[] args) {
    int MenuControl = 1, choice;
    while (MenuControl == 1) {
      Scanner In = new Scanner(System.in);
      System.out.println("Enter Choice to create new Employee Payslip: ");
      System.out.println("1 for Programmer");
      System.out.println("2 for Assistant Professor");
      System.out.println("3 for Associate Professor");
      System.out.println("4 for Professor");
      System.out.println("Enter Choice: ");
      choice = In.nextInt();

      switch (choice) {
        case 1: {
          Employee E = new Programmer();
          E.enterinfo();
          E.enterPay();
          E.Generate_Payslip();
          break;
        }
        case 2: {
          Employee E = new AssistantProfessor();
          E.enterinfo();
          E.enterPay();
          E.Generate_Payslip();
          break;
        }
        case 3: {
          Employee E = new AssociateProfessor();
          E.enterinfo();
          E.enterPay();
          E.Generate_Payslip();
          break;
        }
        case 4: {
          Employee E = new Professor();
          E.enterinfo();
          E.enterPay();
          E.Generate_Payslip();
          break;
        }
      }
      System.out.println("Do You wish to continue? Enter 1 for YES, and 0 for NO: ");
      MenuControl = In.nextInt();
    }
  }
}