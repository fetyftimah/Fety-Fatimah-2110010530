/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package penjualan;

/**
 *
 * @author Fety Fatimah
 */
public class Booking {
    private int orderNo, customerCode, cityCode, postCode, telp;
    private String receiverName, address, paidState, sendingState;

    public Booking() {}

    public int getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(int orderNo) {
        this.orderNo = orderNo;
    }

    public int getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(int customerCode) {
        this.customerCode = customerCode;
    }

    public int getCityCode() {
        return cityCode;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public int getPostCode() {
        return postCode;
    }

    public void setPostCode(int postCode) {
        this.postCode = postCode;
    }

    public int getTelp() {
        return telp;
    }

    public void setTelp(int telp) {
        this.telp = telp;
    }

    public String getReceiverName() {
        return receiverName;
    }

    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPaidState() {
        return paidState;
    }

    public void setPaidState(String paidState) {
        this.paidState = paidState;
    }

    public String getSendingState() {
        return sendingState;
    }

    public void setSendingState(String sendingState) {
        this.sendingState = sendingState;
    }
    
    
}
