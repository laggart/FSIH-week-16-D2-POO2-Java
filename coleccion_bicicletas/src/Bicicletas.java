public class Bicicletas {
     // Datos
     private String marca;
     private String modelo;
     private double topSpeed;
     private boolean tieneMarchas;
     private int inventario;

     // Constructor


     public Bicicletas(String marca, String modelo, double topSpeed, boolean tieneMarchas, int inventario) {
          this.marca = marca;
          this.modelo = modelo;
          this.topSpeed = topSpeed;
          this.tieneMarchas = tieneMarchas;
          this.inventario = inventario;
     }


     public Bicicletas() {
     }

     // Setters y Getters


     public String getMarca() {
          return this.marca;
     }

     public void setMarca(String marca) {
          this.marca = marca;
     }

     public String getModelo() {
          return this.modelo;
     }

     public void setModelo(String modelo) {
          this.modelo = modelo;
     }

     public double getTopSpeed() {
          return this.topSpeed;
     }

     public void setTopSpeed(double topSpeed) {
          this.topSpeed = topSpeed;
     }

     public boolean isMarchas() {
          return this.tieneMarchas;
     }

     public boolean getMarchas() {
          return this.tieneMarchas;
     }

     public void setMarchas(boolean tieneMarchas) {
          this.tieneMarchas = tieneMarchas;
     }

     public int getInventario() {
          return this.inventario;
     }

     public void setInventario(int inventario) {
          this.inventario = inventario;
     }


     @Override
     public String toString() {
          String marchas = "";
          if(tieneMarchas){
               marchas = ", tiene marchas ";
          }else{ 
               marchas = ", este modélo no es de marchas ";
          }
          return "{" +
               " marca: " + getMarca() + " " +
               ", modelo: " + getModelo() + " " +
               ", topSpeed: " + getTopSpeed() + " " +
               marchas + " " +
               ", tenemos disponibilidad de: " + getInventario() + " unidades." +
               "}";
     }

     public void cambioMarchas(boolean tieneMarchas){
          if(tieneMarchas) {
               System.out.println("cambiando en 3... 2... 1... click");
          } else {
               System.out.println("imposible, esta bicicleta no es de marchas, Induraín");
          }
     }
     
}
