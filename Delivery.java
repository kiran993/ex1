 class Delivery {
    private String orderId;
    private String deliveryStatus;
    private String deliveryAddress;
    private String deliveryPerson;

    public Delivery(String orderId, String deliveryStatus, String deliveryAddress, String deliveryPerson) {
        this.orderId = orderId;
        this.deliveryStatus = deliveryStatus;
        this.deliveryAddress = deliveryAddress;
        this.deliveryPerson = deliveryPerson;
    }

    // Getters and setters for delivery information
    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getDeliveryStatus() {
        return deliveryStatus;
    }

    public void setDeliveryStatus(String deliveryStatus) {
        this.deliveryStatus = deliveryStatus;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public String getDeliveryPerson;

    @Override
    public String toString() {
        return "Delivery [orderId=" + orderId + ", deliveryStatus=" + deliveryStatus + ", deliveryAddress="
                + deliveryAddress + ", deliveryPerson=" + deliveryPerson + ", getDeliveryPerson=" + getDeliveryPerson
                + "]";
    }
    
}
