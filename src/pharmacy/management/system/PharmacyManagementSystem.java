/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pharmacy.management.system;

import java.util.Scanner;
import java.io.*;

/**
 *
 * @author HP ZBook
 */
public class PharmacyManagementSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        File fileobj = new File("drugs_info.txt");
        Scanner input = new Scanner(fileobj);
        while (input.hasNext()) {
            String a = input.nextLine();
            System.out.println(a);
        }
        MedicineList listOfMedicine = new MedicineList();
        int option;
        Scanner scanner = new Scanner(System.in);
        String isContinue = "yes";
        boolean exit = false;
        do {

            System.out.println("Welcome to Pharmacy Management System");
            System.out.println("1. Add New Medicine");
            System.out.println("2. Information of a Medicine");
            System.out.println("3. Update Medicine");
            System.out.println("4. Delete a Medicine");
            System.out.println("5. Sort By Quanitiy (order)");
            System.out.println("6. Sort by Expire Date (order");
            System.out.println("7. Expire At Date");
            System.out.println("8. SaveData");
            System.out.println("9. Exit");
            System.out.println("=====================");
            System.out.println("Choose A Number: ");

            option = scanner.nextInt();
            scanner.nextLine();
            switch (option) {
                case 1:
                    String newMedicineName;
                    int newMedicineID;
                    int newquantity;
                    String newplace;
                    Double newprice;
                    String newtype;
                    String newManufacture;
                    String newexpireData;
                    System.out.println("Welcome to Pharmacy Management System");
                    System.out.println("Enter a New Drug: ");
                    newMedicineName = scanner.next();
                    System.out.println("Enter a New ID: ");
                    newMedicineID = scanner.nextInt();
                    System.out.println("Enter Quantity: ");
                    newquantity = scanner.nextInt();
                    System.out.println("Enter place: ");
                    newplace = scanner.next();
                    System.out.println("Enter price: ");
                    newprice = scanner.nextDouble();
                    System.out.println("Enter Type: ");
                    newtype = scanner.next();
                    System.out.println("Enter New Menu Facture: ");
                    newManufacture = scanner.next();
                    System.out.println("Enter New expireData: ");
                    newexpireData = scanner.next();
                    scanner.nextLine();
                    MedicineModel newMedicine = new MedicineModel(newMedicineName, newMedicineID, newquantity, newplace,
                            newprice, newtype, newManufacture, newexpireData);
                    listOfMedicine.addNewMedicine(newMedicine);
                    break;
                case 2:
                    listOfMedicine.showListOfMedicine();
                    break;
                case 3:
                    int selectedMedisineID;
                    System.out.println("Enter the Medisine ID You Want to Update: ");
                    selectedMedisineID = scanner.nextInt();
                    scanner.nextLine();
                    boolean isUpdatedSucccessfully = listOfMedicine.updateSelectedMedicine(selectedMedisineID);
                    if (!isUpdatedSucccessfully) {
                        System.out.println("Update failed");
                    }
                    break;
                case 4:
                    int selectedMedisineID1;
                    System.out.println("Enter the Medisine ID You Want to delete: ");
                    selectedMedisineID1 = scanner.nextInt();
                    scanner.nextLine();
                    boolean isDeleteSucccessfully = listOfMedicine.deleteSelectedMedicine(selectedMedisineID1);
                    if (!isDeleteSucccessfully) {
                        System.out.println("Delete failed");
                    } else {
                        System.out.println("Delete successfully");
                    }

                    break;

                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    break;
                case 9:
                    exit = true;

                    break;
                default:
                    System.out.println("Please Try Again");
                    break;
            }
            if (exit) {
                break;
            }
            System.out.println("Do You Want Options Again? (yes/no)");
            isContinue = scanner.nextLine();
        } while (isContinue.equals("yes") || isContinue.equals("YES"));
        System.out.println("====================");
        System.out.println("Thank You");
        System.out.println("====================");
        scanner.close();
    }

}
