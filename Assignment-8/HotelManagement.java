//!  Wap in java to enter java program define a class "Hotel" with member variable hotel list which is of Arraylist type & methods are 
//! 1)getItem() this is used to take the input name of the hotel from the user & insert  in the hotel list 
//! 2)throw-new-it shows the list of hotel
//! 3)insert-new-hotel input the name of a new hotel & add in the hotel list 
//! 4) change-list -change name of the hotel at 3rd index enter the new name 
//! 5)remove- list remove the name of hotel of 2nd index
//! In each method call the show.hotel() to show the updated hotel list


import java.util.ArrayList;
import java.util.Scanner;

class Hotel {
    private ArrayList<String> hotelList = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void addHotel() {
        System.out.print("Enter the name of the hotel: ");
        String hotelName = scanner.nextLine();
        hotelList.add(hotelName);
        displayHotels();
    }

    public void displayHotels() {
        System.out.println("Current Hotel List: " + hotelList);
    }

    public void insertHotel() {
        System.out.print("Enter a new hotel name to add: ");
        String newHotel = scanner.nextLine();
        hotelList.add(newHotel);
        displayHotels();
    }

    public void updateHotelName() {
        if (hotelList.size() > 3) {
            System.out.print("Enter a new name for the hotel at position 3: ");
            String newName = scanner.nextLine();
            hotelList.set(3, newName);
        } else {
            System.out.println("Not enough hotels in the list to update position 3.");
        }
        displayHotels();
    }

    public void removeHotel() {
        if (hotelList.size() > 2) {
            System.out.println("Removing hotel at position 2: " + hotelList.get(2));
            hotelList.remove(2);
        } else {
            System.out.println("Not enough hotels in the list to remove position 2.");
        }
        displayHotels();
    }
}

public class HotelManagement {
    public static void main(String[] args) {
        Hotel hotel = new Hotel();
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("\nHotel Management System");
            System.out.println("1. Add a Hotel");
            System.out.println("2. Show Hotel List");
            System.out.println("3. Insert a New Hotel");
            System.out.println("4. Update Hotel Name at Position 3");
            System.out.println("5. Remove Hotel at Position 2");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine();
            
            switch (choice) {
                case 1:
                    hotel.addHotel();
                    break;
                case 2:
                    hotel.displayHotels();
                    break;
                case 3:
                    hotel.insertHotel();
                    break;
                case 4:
                    hotel.updateHotelName();
                    break;
                case 5:
                    hotel.removeHotel();
                    break;
                case 6:
                    System.out.println("Exiting the program. Thank you!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
