import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Sale sale = new Sale();


        Vehicle vehicleSold = null;
        Customer customer1 = null;

        ArrayList<Vehicle> vehicles = new ArrayList<>();
        ArrayList<Customer> customers = new ArrayList<>();


        System.out.println("Cuantos vehiculos quieres almacenar?");
        int vehicleNumber = scanner.nextInt();

        for (int i = 0; i < vehicleNumber; i++) {
            Vehicle vehicle = new Vehicle();

            System.out.println("Introduce los datos del vehiculo " + i + ": ");

            System.out.println("Marca: ");
            vehicle.setBrand(scanner.next());

            System.out.println("Modelo: ");
            vehicle.setModel(scanner.next());

            System.out.println("Color: ");
            vehicle.setColor(scanner.next());

            System.out.println("Tipo de combustible: ");
            vehicle.setFuelType(scanner.next());

            System.out.println("Motor: ");
            vehicle.setMotor(scanner.next());

            System.out.println("Caballos de potencia: ");
            vehicle.setCv(scanner.next());

            System.out.println("Matricula: ");
            vehicle.setLicensePlate(scanner.next());

            vehicles.add(vehicle);
        }

        System.out.println("Introduce el numero de clientes a almacenar: ");
        int customerNumber = scanner.nextInt();

        for (int i = 0; i < customerNumber; i++) {
            Customer customer = new Customer();

            System.out.println("Nombre: ");
            customer.setName(scanner.next());

            System.out.println("Apellidos: ");
            customer.setSurname(scanner.next());

            System.out.println("Dni: ");
            customer.setDni(scanner.next());

            System.out.println("Direccion: ");
            customer.setAdress(scanner.next());

            customers.add(customer);
        }

        System.out.println("Escoge el coche que quieres comprar: ");
        for (Vehicle i : vehicles) {
            System.out.println("Matricula: " + i.getLicensePlate());
        }
        String licensePlateSelected = scanner.next();

        System.out.println("Escoge el cliente que quiere comprar el vehiculo: ");
        for (Customer i : customers) {
            System.out.println("Cliente: " + i.getDni());
        }
        String dniSelected = scanner.next();


        for (Vehicle i : vehicles) {
            if (i.getLicensePlate().equals(licensePlateSelected)) {
                vehicleSold = i;
            }
        }

        for (Customer i : customers) {
            if (i.getDni().equals(dniSelected)) {
                customer1 = i;
            }
        }


        System.out.println("DATOS DE LA VENTA: ");

        System.out.println("ID: ");
        sale.setId(scanner.next());

        System.out.println("FECHA: ");
        sale.setSaleDate(scanner.next());

        System.out.println("PRECIO: ");
        sale.setPrice(scanner.next());

        System.out.println("TIPO DE PAGO: ");
        sale.setPayType(scanner.next());

        sale.setCustomer(customer1);

        sale.setVehicle(vehicleSold);


        System.out.println("\nFICHA VENTA: ");

        System.out.println("\nDATOS DE LA VENTA\n" + sale.getId() + "\n" + sale.getSaleDate() + "\n" + sale.getPrice() + "\n" + sale.getPayType());

        System.out.println("\nDATOS DEL COMPRADOR");
        System.out.println(sale.getCustomer().toString());

        System.out.println("\nDATOS DEL VEHICULO");
        System.out.println(sale.getVehicle().toString());

        scanner.close();
    }
}