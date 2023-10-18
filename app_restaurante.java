import javax.swing.JOptionPane;

public class app_restaurante {
    static cls_clientes[] clientes = new cls_clientes[100];
    static int int_posicionesClientes = 0;

    public static void main(String[] args) {
        fnt_menuPrincipal();
    }

    private static void fnt_menuPrincipal() {
        boolean menuActivo = true;

        while (menuActivo) {
            int opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "<<< MENU PRINCIPAL >>>\n" +
                            "1. Registrar Clientes\n" +
                            "2. Registrar Platos\n" +
                            "3. Registrar Pedido\n" +
                            "4. Mostrar Pedidos\n" +
                            "5. Salir\n"));

            switch (opcion) {
                case 1:
                    fnt_registrarClientes();
                    break;
                case 2:
                    // Lógica para registrar platos
                    break;
                case 3:
                    // Lógica para registrar pedidos
                    break;
                case 4:
                    // Lógica para mostrar pedidos
                    break;
                case 5:
                    menuActivo = false;
                    JOptionPane.showMessageDialog(null, "¡Gracias por usar la aplicación!");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida, por favor, seleccione una opción válida.");
            }
        }
    }

    private static void fnt_registrarClientes() {
        String nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre del cliente:");
        String codigo = JOptionPane.showInputDialog(null, "Ingrese el código del cliente:");
        String direccion = JOptionPane.showInputDialog(null, "Ingrese la dirección del cliente:");
        String contacto = JOptionPane.showInputDialog(null, "Ingrese el contacto del cliente:");

        clientes[int_posicionesClientes] = new cls_clientes(nombre, codigo, direccion, contacto);
        int_posicionesClientes++;
        JOptionPane.showMessageDialog(null, "Cliente registrado exitosamente.");
    }
}
