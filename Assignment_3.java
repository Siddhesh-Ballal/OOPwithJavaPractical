// A106 Siddhesh Ballal 
// 23 March 2022

// Assignment 3
// Identify commonalities and differences between Publication, Book and Magazine classes. Title, Price, 
// Copies are common instance variables and saleCopy is common method. The differences are, Book class 
// has author and order_Copies(). Magazine Class has orderQty, Current_issue() andreceive_issue(). Write 
// a program to find how many copies of the given books are ordered and display the total sale of 
// publication.

import java.util.Scanner;

class publication {
    private String title;
    private int price;
    private int copies;
    private int total;

    Scanner sc = new Scanner(System.in);

    public void SetTitle(String title) {
        this.title = title;
    }

    public void SetCopies(int copies) {
        this.copies = copies;
    }

    public String GetTitle() {
        return title;
    }

    public int GetTotal() {
        return total;
    }

    public int GetCopies() {
        return copies;
    }

    public int GetPrice() {
        return price;
    }

    void read_publ() {
        System.out.print("Enter Title:");
        title = sc.next();
        System.out.print("Enter price:");
        price = sc.nextInt();
        System.out.print("Enter copies:");
        copies = sc.nextInt();
    }

    void display() {
        System.out.print(title + "\t" + price + "\t" + copies);
    }

    void sale_copy(int number) {
        if (number <= copies) {
            copies = copies - number;
            total = total + number * price;
            System.out.println("\tYOU PURCHASED " + number + " COPIES\n\tYOU HAVE TO PAY:" + (price * number));
        } else {
            System.out.println(" INSUFFICIENT STOCK!!!!!!!!");
        }
    }
}

class book extends publication {
    private String author;

    void order_copies(int number) {
        int x = GetCopies() + number;
        SetCopies(GetCopies() + number);
        System.out.println("\n\tORDER SUCCESSFULL....");
        System.out.println("\tCOPIES AVAILABLE: " + x);
    }

    void read_book() {
        read_publ();
        System.out.print("Enter the author of the book:");
        author = sc.next();
    }

    void display_book() {
        System.out.println("Title\tPrice\tCopy\tAuthor");
        display();
        System.out.println("\t" + author);
    }
}

class magazine extends publication {
    private int order_qty;
    private String issue_date;

    void recieve_issue(String new_issue_date) {
        System.out.println("ENTER THE AMOUNT OF NEW COPIES ORDERED:");
        order_qty = sc.nextInt();
        SetCopies(order_qty);
        issue_date = new_issue_date;
        System.out.println("\tTHE MAGAZINE " + GetTitle() + "\n\tWITH ISSUE DATE " + issue_date + " AVAILABLE");
    }

    void read_mag() {
        read_publ();
        System.out.println("Enter the Current Issue Date[dd/mm/yyyy]");
        issue_date = sc.next();
    }

    void display_mag() {
        System.out.println("Title\tPrice\tCopy\tDate");
        display();
        System.out.println("\t" + issue_date);
    }
}

public class Assignment_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        book b = new book();
        magazine m = new magazine();
        int outer;
        do {
            System.out.println("\n\n\tCHOOSE ONE OF THE FOLLOWING.....\n\n\t1.BOOK\t\t\t2.MAGAZINE"
                    + "\n\n\t3.TOTAL SALE AMOUNT\t4.REVENUE OF PUBLICATION\n\n");
            System.out.println("Choice:");
            int k = sc.nextInt();
            int a;
            aa: if (k == 1) {
                do {
                    int c;
                    System.out.println("\n\t\tMENU FOR BOOK\n");
                    System.out.println("\t1. Read Book\t\t2. Display\n\t3. Sale Copies\t\t4. Order Copies");
                    System.out.println("\n\tChoice:");
                    c = sc.nextInt();
                    switch (c) {
                        case 1:
                            b.read_book();
                            break;
                        case 2:
                            b.display_book();
                            break;
                        case 3:
                            System.out.println("HOW MANY COPIES YOU (the customer) WANT?");
                            int n1 = sc.nextInt();
                            b.sale_copy(n1);
                            break;
                        case 4:
                            System.out.println("ENTER COPIES WANT TO ORDER (for your shop)?");
                            int n2 = sc.nextInt();
                            b.order_copies(n2);
                            break;
                        default:
                            System.out.println("Invalid choice entered.");
                            break;
                    }
                    System.out.println(
                            "Do you want to continue with the book section [1/0]...Enter 1 for YES and 0 for NO");
                    System.out.println("\tChoice:");
                    a = sc.nextInt();
                    if (a == 0)
                        break aa;
                } while (a == 1);
            } else if (k == 2) {
                mm: do {
                    System.out.println(
                            "\n\t\tMENU FOR MAGAZINE...\n\t\t1. READ\t\t2. DISPLAY\n\t3. SALE MAGAZINE COPIES\t\t4. RECIEVE NEW ISSUE\n");
                    int d;
                    System.out.println("\n\tChoice:");
                    d = sc.nextInt();
                    switch (d) {
                        case 1:
                            m.read_mag();
                            break;
                        case 2:
                            m.display_mag();
                            break;
                        case 3:
                            System.out.println("HOW MANY COPIES YOU WANT (the customer)?");
                            int n3 = sc.nextInt();
                            m.sale_copy(n3);
                            break;
                        case 4:
                            System.out.println("ENTER THE NEW ISSUE DATE [dd/mm/yyyy]");
                            String date = sc.next();
                            m.recieve_issue(date);
                            break;
                    }
                    System.out.println(
                            "DO YOU WANT TO CONTIN  UE WITH MAGAZINE SECTION?....[1/0] Enter 1 for YES and 0 for NO");
                    System.out.println("Choice:");
                    a = sc.nextInt();
                    if (a == 0) {
                        break mm;
                    }
                } while (a == 1);
            } else if (k == 3) {
                System.out.println("\n\tTOTAL SALE AMOUNT IS (which is to be paid by the customer)= "
                        + (b.GetTotal() + m.GetTotal()) + " ");
            } else if (k == 4) {
                System.out.println("\n\tTOTAL REVENUE FOR PUBLICATION IS: "
                        + (b.GetCopies() * b.GetPrice() + m.GetCopies() * m.GetPrice()));
            } else {
                System.out.println("Invalid key...");
            }
            System.out.println("DO YOU WANT TO CONTINUE WITH PUBLICATION?\n\tEnter 1 to continue or 0 to terminate");
            outer = sc.nextInt();
        } while (outer != 0);
        sc.close();
    }
}
