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
    private ArrayList<String> hotelList;

    public Hotel() {
        hotelList = new ArrayList<>();
    }

    public void getItem() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the name of the hotel: ");
        String hotelName = scanner.nextLine();
        hotelList.add(hotelName);
        showHotels();
    }

    public void showHotels() {
        System.out.println("Current list of hotels:");
        for (int i = 0; i < hotelList.size(); i++) {
            System.out.println((i + 1) + ". " + hotelList.get(i));
        }
    }

    public void insertNewHotel() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the name of the new hotel: ");
        String newHotelName = scanner.nextLine();
        hotelList.add(newHotelName);
        showHotels();
    }

    public void changeList() {
        if (hotelList.size() > 3) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the new name for the hotel at index 3: ");
            String newName = scanner.nextLine();
            hotelList.set(3, newName);
            showHotels();
        } else {
            System.out.println("There are not enough hotels to change the one at index 3.");
        }
    }

    public void removeList() {
        if (hotelList.size() > 2) {
            hotelList.remove(2);
            showHotels();
        } else {
            System.out.println("There are not enough hotels to remove the one at index 2.");
        }
    }

    public static void main(String[] args) {
        Hotel hotelManager = new Hotel();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Add Hotel");
            System.out.println("2. Insert New Hotel");
            System.out.println("3. Change Hotel at Index 3");
            System.out.println("4. Remove Hotel at Index 2");
            System.out.println("5. Show Hotels");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    hotelManager.getItem();
                    break;
                case 2:
                    hotelManager.insertNewHotel();
                    break;
                case 3:
                    hotelManager.changeList();
                    break;
                case 4:
                    hotelManager.removeList();
                    break;
                case 5:
                    hotelManager.showHotels();
                    break;
                case 6:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 6);
        
        scanner.close();
    }
}
