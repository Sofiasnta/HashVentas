import java.util.HashMap;
public static void main(String[] args) {
    
    Venta venta1 = new Venta("001", "Producto A", 10, 100.0);
    Venta venta2 = new Venta("002", "Producto B", 5, 50.0);
    Venta venta3 = new Venta("003", "Producto C", 20, 200.0);   
    
    HashMap<String, Venta> hashMap = new HashMap<>();
    hashMap.put("001", venta1);
    hashMap.put("002", venta2);

        System.out.println(hashMap.get("001").getNombreproducto());
        System.out.println(hashMap.get("002").getNombreproducto());
        System.out.println(hashMap.get("003").getNombreproducto());
        
    }