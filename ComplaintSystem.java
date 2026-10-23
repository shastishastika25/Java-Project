import java.util.*;
class ComplaintSystem {
 static Scanner sc = new Scanner(System.in);
 static Map<String, String> complaints = new HashMap<>();
 static int idCounter = 1001;
 public static void main(String[] args) {
 int choice;
 do {
 System.out.println("\n--- DIGITAL COMPLAINT SYSTEM ---");
 System.out.println("1. Register Complaint");
 System.out.println("2. Check Status");
 System.out.println("3. Exit");
 System.out.print("Enter your choice: ");
 choice = sc.nextInt();
 sc.nextLine(); // consume newline
 switch (choice) {
case 1:
 registerComplaint();
 break;
 case 2:
 checkStatus();
 break;
 case 3:
 System.out.println("Exiting system...");
 break;
 default:
 System.out.println("Invalid choice!");
 }
 } while (choice != 3);
 }
 // Complaint Registration
 public static void registerComplaint() {
 System.out.print("Enter your name: ");
 String name = sc.nextLine();
 System.out.print("Enter complaint: ");
 String complaint = sc.nextLine();
 String complaintId = "C" + idCounter++;
 complaints.put(complaintId, "Pending");
 System.out.println("Complaint Registered Successfully!");
 System.out.println("Your Complaint ID: " + complaintId);
}
 // Status Checking
 public static void checkStatus() {
 System.out.print("Enter Complaint ID: ");
 String id = sc.nextLine();
 if (complaints.containsKey(id)) {
 String status = complaints.get(id);
 System.out.println("Complaint Status: " + status);
 } else {
 System.out.println("Invalid Complaint ID!");
 }
 }
}