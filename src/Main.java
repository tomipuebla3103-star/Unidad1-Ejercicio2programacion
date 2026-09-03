//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Vino vino = new Vino("Finca Mendoza", "Malbec", 8500, 20);

    vino.venderBotellas(5);
    vino.reponerStock(10);

    System.out.println("\n--- INVENTARIO FINAL ---");
    vino.mostrarInventario();
}
