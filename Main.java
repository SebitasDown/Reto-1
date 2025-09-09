import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    //Entradas
        System.out.println("Ingrese su nombre: ");
        String nombre = sc.nextLine();

        System.out.println("Ingrese su edad: ");
        int edad = sc.nextInt();

        System.out.println("Ingrese su altura: ");
        double altura = sc.nextDouble();

        System.out.println("Ingrese su peso en kg: ");
        double peso = sc.nextDouble();

        System.out.println("Ingrese el plan (Basico, Plus, Premium): ");
        String plan = sc.next();

        System.out.println("¿Es la primera vez? (true/false): ");
        boolean vez = sc.nextBoolean();

        // Validacion de edad
        if (edad < 14){
            System.out.println("No legible");
            return;
        } else if (edad < 18) {
            System.out.println("Requiere autorizacion de acudiente");
        }

        // Precio base segun plan

        double precioBase = 0;
                switch (plan.toLowerCase()) {
                    case "basico":
                        precioBase = 80.0;
                        break;
                    case "plus":
                        precioBase = 120.0;
                        break;
                    case "premium":
                        break;
                    default:
                        System.out.println("Plan invalido");
                        return;
                }

        // Descuentos

        double descuento = 0;

                if (vez){
                    descuento += 0.10;
                }
                if (edad >= 16 && edad <= 25){
                    descuento += 0.10;
                }

                if (descuento > 0.20){
                    descuento = 0.20;
                }
        double precioFinal = precioBase - (precioBase * descuento);

        // Calcular BMI
        double bmi = peso / (altura * altura);
        String categoriaBMI;
        if (bmi < 18.5) {
            categoriaBMI = "Bajo peso";
        } else if (bmi < 25) {
            categoriaBMI = "Normal";
        } else if (bmi < 30) {
            categoriaBMI = "Sobrepeso";
        } else {
            categoriaBMI = "Obesidad";
        }

    // Resultado final

        System.out.println("\n--- Cotización Membresía ---");
        System.out.println("Nombre: " + nombre);
        System.out.println("Plan elegido: " + plan.toUpperCase());
        System.out.println("Precio base: $" + precioBase);
        System.out.println("Descuento aplicado: " + (descuento * 100) + "%");
        System.out.println("Precio final: $" + precioFinal);
        System.out.println("Categoría BMI: " + categoriaBMI);
    }
}
