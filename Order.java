import java.util.List;

 class Order {
    private String orderId;
    private List<String> products;
    private double totalPrice;
    private String status;
    private String deliveryStatus;

    public Order(String orderId, List<String> products, double totalPrice, String status,
            String deliveryStatus)
             {
        this.orderId = orderId;
        this.products = products;
        this.totalPrice = totalPrice;
        this.status = status;
        this.deliveryStatus = deliveryStatus;
    }

    // Getters and setters for order information
    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public List<String> getProducts() {
        return products;
    }

    public void setProducts(List<String> products) {
        this.products = products;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDeliveryStatus() {
        return deliveryStatus;
    }

    public void setDeliveryStatus(String deliveryStatus) {
        this.deliveryStatus = deliveryStatus;
    }

    @Override
    public String toString() {
        return "Order [orderId=" + orderId + ", products=" + products + ", totalPrice=" + totalPrice + ", status="
                + status + ", deliveryStatus=" + deliveryStatus + "]";
    }
    
}