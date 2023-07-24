/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pharmacy.management.system;

/**
 *
 * @author HP ZBook
 */
public class MedicineModel {
    private String medicineName;
    private int medicineID;
    private int quantity;
    private String place;
    private Double price;
    private String type;
    private String Manufacture;
    private String expireData;

    public MedicineModel(String medicineName, int medicineID, int quantity, String place, Double price, String type, String Manufacture, String expireData) {
        this.medicineName = medicineName;
        this.medicineID = medicineID;
        this.quantity = quantity;
        this.place = place;
        this.price = price;
        this.type = type;
        this.Manufacture = Manufacture;
        this.expireData = expireData;
    }

    public String getMedicineName() {
        return medicineName;
    }

    public void setMedicineName(String medicineName) {
        this.medicineName = medicineName;
    }

    public int getMedicineID() {
        return medicineID;
    }

    public void setMedicineID(int medicineID) {
        this.medicineID = medicineID;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getManufacture() {
        return Manufacture;
    }

    public void setManufacture(String Manufacture) {
        this.Manufacture = Manufacture;
    }

    public String getExpireData() {
        return expireData;
    }

    public void setExpireData(String expireData) {
        this.expireData = expireData;
    }
    
   
  
}


