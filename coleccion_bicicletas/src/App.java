import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
    
ArrayList<Bicicletas> bike = new ArrayList<>();

        Bicicletas b1 = new Bicicletas("Rockrider", "ST 100", 220, true, 10);
        Bicicletas b2 = new Bicicletas("Rockrider", "E-ST 500", 150, true, 2);
        Bicicletas b3 = new Bicicletas("Rockrider", "XC-100", 150, true, 5);
        Bicicletas b4 = new Bicicletas("Rockrider", "E-Riverside 500", 150, true, 1);
        Bicicletas b5 = new Bicicletas("BTWIN", "500 Robot", 150, false, 4);
        Bicicletas b6 = new Bicicletas("BTWIN", "RS 100", 150, false,3);



        System.out.println(b2.toString());

        bike.add(b1);
        bike.add(b2);
        bike.add(b3);
        bike.add(b4);
        bike.add(b5);
        bike.add(b6);

        System.out.println(bike);

        for (Bicicletas x: bike){
            System.out.println(x.getMarca()+ " modelo " + x.getModelo() + " tenemos " + x.getInventario() + " unidades");
        }

        b6.cambioMarchas(false);

    }
}
