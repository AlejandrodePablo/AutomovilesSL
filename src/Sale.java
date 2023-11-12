public class Sale {

    private String id;
    private String saleDate;
    private Customer customer;
    private Vehicle vehicle;
    private String payType;
    private String price;

    public String getId() {
        return "ID: " + id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSaleDate() {
        return "FECHA: " + saleDate;
    }

    public void setSaleDate(String saleDate) {
        this.saleDate = saleDate;
    }

    public String getPayType() {
        return "TIPO DE PAGO: " + payType;
    }

    public void setPayType(String payType) {
        this.payType = payType;
    }

    public String getPrice() {
        return "PRECIO: " + price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public String toString() {
        return "ID: " + id + "\nFecha: " + saleDate + "\nCliente: " + customer.toString() + "\nVehiculo: " + vehicle.toString() + "\nPrecio: " + price +
                "\nTipo de Pago: " + payType;
    }
}


