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
public class Node {
    private MedicineModel medicine;
    private Node next;
    public Node(MedicineModel medicine)
    {
    this.medicine = medicine;
    this.next = null;
    }

    public MedicineModel getMedicine() {
        return medicine;
    }

    public void setMedicine(MedicineModel medicine) {
        this.medicine = medicine;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
    
}
