/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pharmacy.management.system;

import java.util.Scanner;

/**
 *
 * @author HP ZBook
 */
public class MedicineList {

    private Node head, tail;

    public MedicineList() {
        this.head = this.tail = null;
    }

    public boolean isEmpty() {
        return this.head == null;
    }

    //node new node
    public void addNewMedicine(MedicineModel newMedicine) {
        if (isEmpty()) {
            this.head = this.tail = new Node(newMedicine);
            return;
        }
        Node newNode = new Node(newMedicine);
        this.tail.setNext(newNode);
        this.tail = newNode;
    }

    public void showListOfMedicine() {

        Node selectedNode = this.head;
        while (selectedNode != null) {
            System.out.println(selectedNode.getMedicine().getMedicineName() + "  " + selectedNode.getMedicine().getMedicineID()+"  "+selectedNode.getMedicine().getQuantity()+"  "+selectedNode.getMedicine().getPlace()+"  "+selectedNode.getMedicine().getType()+"  "+selectedNode.getMedicine().getPrice()+"  "+selectedNode.getMedicine().getManufacture()+"  "+selectedNode.getMedicine().getExpireData());
            
            selectedNode = selectedNode.getNext();
        }
    }

    public void addManyMedicines(MedicineModel... listofMedicines) {
        for (MedicineModel newMedicine : listofMedicines) {
            addNewMedicine(newMedicine);
        }
    }
//    public boolean searchMedicine(String selectedMedicineName){
//        boolean isFound = false;
//      Node selectedNode = this.head;
//      while(selectedNode != null)
//      {
//          if(selectedNode.getMedicine().getMedicineName().contains(selectedMedicineName))
//          {
//          System.out.println(selectedNode.getMedicine().getMedicineName() + "  " + selectedNode.getMedicine().getMedicineID()+"  "+selectedNode.getMedicine().getQuantity()+"  "+selectedNode.getMedicine().getPlace()+"  "+selectedNode.getMedicine().getType()+"  "+selectedNode.getMedicine().getPrice()+"  "+selectedNode.getMedicine().getManufacture()+"  "+selectedNode.getMedicine().getExpireData());           
//          isFound = true;
//          }
//      selectedNode = selectedNode.getNext();
//      }
//      if(!isFound)
//      {
//      return false;
//      }
//        return true;
//    }

    public boolean updateSelectedMedicine(int selectedID){
        Scanner scanner = new Scanner(System.in);
      Node selectedNode = this.head;
      while(selectedNode != null)
      {
      if(selectedNode.getMedicine().getMedicineID() == selectedID)
      {
       String newMedicineName;
                int    newMedicineID;
                int    newquantity;
                String newplace;
                Double newprice;
                String newtype;
                String newManufacture;
                String newexpireData;
                
                System.out.println("Enter New Name of Drug you Want Update: ");
                newMedicineName=scanner.next();
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
                selectedNode.getMedicine().setMedicineName(newMedicineName);
                selectedNode.getMedicine().setMedicineID(newMedicineID);
                selectedNode.getMedicine().setQuantity(newquantity);
                selectedNode.getMedicine().setPlace(newplace);
                selectedNode.getMedicine().setPrice(newprice);
                selectedNode.getMedicine().setType(newtype);
                selectedNode.getMedicine().setManufacture(newManufacture);
                selectedNode.getMedicine().setExpireData(newexpireData);
                return true;
      }
      selectedNode = selectedNode.getNext();
    }
      scanner.close();
      return false;
    }
    
    public boolean deleteSelectedMedicine(int selectedID){
      Node selectedNode = this.head;
      if(this.head.getMedicine().getMedicineID() == selectedID)
      {
      this.head = this.head.getNext();
      return true;
      }
      while (selectedNode !=null){
      if(selectedNode.getNext().getMedicine().getMedicineID() == selectedID){
      selectedNode.setNext(selectedNode.getNext().getNext());
       return true;
      }
      selectedNode = selectedNode.getNext();
      }
      return false;
    }
   
}
