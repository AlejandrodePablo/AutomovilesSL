public class Vehicle {

    private String licensePlate;
    private String brand;
    private String model;
    private String color;
    private String fuelType;
    private String motor;
    private String cv;

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public String getCv() {
        return cv;
    }

    public void setCv(String cv) {
        this.cv = cv;
    }

    @Override
    public String toString() {

        return "Matricula: " + licensePlate + "\nMarca: " + brand + "\nModelo: " + model + "\nColor: " + color + "\nTipo de Combustible: " + fuelType +
                "\nMotor: " + motor + "\nCaballos de potencia: " + cv;

    }
}
