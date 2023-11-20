import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Calendar;
import java.util.Date;

class Customer {
    private String name;
    private String phoneNumber;
    private boolean hasCredit;
    private double creditAmount;

    public Customer(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.hasCredit = false;
        this.creditAmount = 0.0;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public boolean hasCredit() {
        return hasCredit;
    }

    public void setCredit(boolean hasCredit) {
        this.hasCredit = hasCredit;
    }

    public double getCreditAmount() {
        return creditAmount;
    }

    public void addCredit(double amount) {
        creditAmount += amount;
    }

    public void deductCredit(double amount) {
        creditAmount -= amount;
    }
}

class Appointment {
    private String date;
    private String time;
    private Customer customer;

    public Appointment(String date, String time, Customer customer) {
        this.date = date;
        this.time = time;
        this.customer = customer;
    }

    public String getDate() {
        return date;
    }

    public String getTime() {
        return time;
    }

    public Customer getCustomer() {
        return customer;
    }
}

class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

class BookingSystem {
    private List<Appointment> appointments;
    private List<Product> products;

    public BookingSystem() {
        appointments = new ArrayList<>();
        products = new ArrayList<>();
    }


    public List<Appointment> getAppointments() {
        return appointments;
    }

    public void createAppointment(String date, String time, Customer customer) {
        // Opret en ny aftale og tilføj den til listen over aftaler
        Appointment appointment = new Appointment(date, time, customer);
        appointments.add(appointment);
    }

    public void cancelAppointment(Appointment appointment) {
        // Fjern en aftale fra listen over aftaler
        appointments.remove(appointment);
    }

    public void registerProductSale(Product product) {
        // Registrer et tilkøbt produkt
        products.add(product);
    }

    public void processPayment(Customer customer, double amount) {
        // Behandle betaling for en kunde
        if (customer.hasCredit()) {
            double remainingCredit = customer.getCreditAmount() - amount;
            if (remainingCredit >= 0) {
                customer.deductCredit(amount);
            } else {
                System.out.println("Customer does not have enough credit.");
            }
        } else {
            System.out.println("Payment received: $" + amount);
        }
    }

    public void viewAppointmentsForDate(String date) {
        // Vis aftaler for en bestemt dato
        for (Appointment appointment : appointments) {
            if (appointment.getDate().equals(date)) {
                System.out.println("Date: " + date + ", Time: " + appointment.getTime() +
                        ", Customer: " + appointment.getCustomer().getName());
            }
        }
    }

    public void viewCustomerInvoice(Customer customer) {
        // Vis kundens faktura
        double totalAmount = 0.0;
        System.out.println("Invoice for Customer: " + customer.getName());
        for (Appointment appointment : appointments) {
            if (appointment.getCustomer() == customer) {
                totalAmount += calculateTotalAmount(appointment);
                System.out.println("Date: " + appointment.getDate() + ", Time: " + appointment.getTime());
            }
        }
        System.out.println("Total Amount: $" + totalAmount);
    }

    // Andre nødvendige metoder baseret på kravene

    // Adgangskodekontrol metode for økonomiske oplysninger
    public boolean verifyPassword(String password) {
        return password.equals("hairyharry");
    }

    private double calculateTotalAmount(Appointment appointment) {
        double total = 0.0;
        for (Product product : products) {
            total += product.getPrice();
        }
        return total;
    }
}

public class Haarryyysss {
    public static void main(String[] args) {
        BookingSystem bookingSystem = new BookingSystem();
        Scanner scanner = new Scanner(System.in);

                while (true) {
                    System.out.println("Select an option:");
                    System.out.println("1. Create an appointment");
                    System.out.println("2. Cancel an appointment");
                    System.out.println("3. View your appointments");
                    System.out.println("4. Exit");
                    System.out.print("Enter your choice: ");

                    int choice = scanner.nextInt();
                    scanner.nextLine(); // Consume the newline character

                    switch (choice) {
                        case 1:
                            System.out.print("Enter customer name: ");
                            String name = scanner.nextLine();
                            System.out.print("Enter customer phone number: ");
                            String phoneNumber = scanner.nextLine();
                            Customer customer = new Customer(name, phoneNumber);

                            System.out.println("Enter time: ");
                            String times = scanner.nextLine();

                            // Get the current time
                            Calendar calendar = Calendar.getInstance();
                            Date now = calendar.getTime();
                            calendar.set(Calendar.HOUR_OF_DAY, 10); // Set to 10 AM
                            calendar.set(Calendar.MINUTE, 0);
                            calendar.set(Calendar.SECOND, 0);
                            Date tenAm = calendar.getTime();
                            calendar.set(Calendar.HOUR_OF_DAY, 18); // Set to 6 PM
                            Date sixPm = calendar.getTime();

                            if (now.before(tenAm) || now.after(sixPm)) {
                                System.out.println("Appointments can only be booked between 10 AM and 6 PM on weekdays.");
                            } else {
                                System.out.print("Enter date (YYYY-MM-DD): ");
                                String date = scanner.nextLine();
                                System.out.print("Enter time (HH:MM): ");
                                String time = scanner.nextLine();

                                // Check if it's a weekend (Saturday or Sunday)
                                calendar.setTime(new Date());
                                int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);

                                if (dayOfWeek == Calendar.SATURDAY || dayOfWeek == Calendar.SUNDAY) {
                                    System.out.println("The salon is closed on weekends.");
                                } else {
                                    bookingSystem.createAppointment(date, time, customer);
                                    System.out.println("Appointment created.");
                                }
                            }
                            break;


        case 2:
                    System.out.println("Appointments:");
                    List<Appointment> appointments = bookingSystem.getAppointments();
                    for (int i = 0; i < appointments.size(); i++) {
                        System.out.println(i + ". " + appointments.get(i).getDate() + " " + appointments.get(i).getTime());
                    }
                    System.out.print("Enter the number of the appointment to cancel: ");
                    int appointmentIndex = scanner.nextInt();
                    if (appointmentIndex >= 0 && appointmentIndex < appointments.size()) {
                        Appointment appointment = appointments.get(appointmentIndex);
                        bookingSystem.cancelAppointment(appointment);
                        System.out.println("Appointment canceled.");
                    } else {
                        System.out.println("Invalid appointment number.");
                    }
                    break;

                case 3:
                    System.out.println("Your Appointments:");
                    List<Appointment> yourAppointments = bookingSystem.getAppointments();
                    for (Appointment appointment : yourAppointments) {
                        Customer customerForAppointment = appointment.getCustomer();
                        System.out.println("Date: " + appointment.getDate() + " Time: " + appointment.getTime());
                        System.out.println("Customer Name: " + customerForAppointment.getName());
                        System.out.println("Customer Phone Number: " + customerForAppointment.getPhoneNumber());
                        System.out.println();
                    }
                    break;

                case 4:
                    System.out.println("Exiting the program.");
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }

            // Eksempel på oprettelse af kunde og aftale
            /*Customer customer1 = new Customer("Alice", "123-456-7890");
            bookingSystem.createAppointment("2023-10-25", "10:30", customer1);

            // Eksempel på aflysning af aftale
            List<Appointment> appointments = bookingSystem.getAppointments();
            if (!appointments.isEmpty()) {
                Appointment appointment = appointments.get(0);
                bookingSystem.cancelAppointment(appointment);

                // Eksempel på registrering af produktkøb
                Product product1 = new Product("Shampoo", 10.0);
                bookingSystem.registerProductSale(product1);

                // Eksempel på behandling af betaling
                Customer customer2 = new Customer("Bob", "987-654-3210");
                customer2.setCredit(true);
                customer2.addCredit(100.0);
                bookingSystem.createAppointment("2023-10-26", "11:00", customer2);
                bookingSystem.processPayment(customer2, 60.0);

                // Eksempel på visning af aftaler for en bestemt dato
                bookingSystem.viewAppointmentsForDate("2023-10-25");

                // Eksempel på visning af kundens faktura
                Customer customer3 = new Customer("Charlie", "111-222-3333");
                bookingSystem.createAppointment("2023-10-25", "12:00", customer3);
                bookingSystem.createAppointment("2023-10-25", "13:00", customer3);
                bookingSystem.viewCustomerInvoice(customer3);*/

                // Eksempel på adgangskodekontrol
                /*String password = "hairyharry";
                boolean isPasswordCorrect = bookingSystem.verifyPassword(password);
                System.out.println("Password is correct: " + isPasswordCorrect);*/
            }
        }
    }
//}
