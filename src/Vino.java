public class Vino {
    private String etiqueta;
    private String varietal;
    private double precio;
    private int stockBotellas;

    public Vino(String etiqueta, String varietal, double precio, int stockBotellas) {
        this.etiqueta = etiqueta;
        this.varietal = varietal;
        this.precio = precio;

        if (stockBotellas >= 0) {
            this.stockBotellas = stockBotellas;
        } else {
            this.stockBotellas = 0;
        }
    }

    public void venderBotellas(int cantidad) {
        if (cantidad > 0 && cantidad <= stockBotellas) {
            stockBotellas -= cantidad;
            System.out.println("Venta realizada: " + cantidad + " botellas.");
        } else {
            System.out.println("No hay stock suficiente.");
        }
    }

    public void reponerStock(int cantidad) {
        if (cantidad > 0) {
            stockBotellas += cantidad;
            System.out.println("Stock repuesto: " + cantidad + " botellas.");
        }
    }

    public void mostrarInventario() {
        System.out.println("Etiqueta: " + etiqueta);
        System.out.println("Varietal: " + varietal);
        System.out.println("Precio: $" + precio);
        System.out.println("Stock: " + stockBotellas + " botellas");
    }
}
