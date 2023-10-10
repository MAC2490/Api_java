package principal;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        ApiConsumption example = new ApiConsumption();
        
        // GET sin datos (Consulta general)
        System.out.println("Consumo GET: " + example.GetConsumption("http://localhost/APIenPHP/List.php"));
        
        // GET con Datos (Consulta individual)
        Map<String, String> getData = new HashMap<>();
        getData.put("document", "108800");
        System.out.println("Consumo SELECT: " + example.GetConsumption("http://localhost/APIenPHP/getPeople.php", getData));
        
        // POST con datos (Insert)
        Map<String, String> insertData = new HashMap<>();
        insertData.put("document", "108801");
        insertData.put("name", "Oscar JAVA");
        insertData.put("last_name", "Loaiza JAVA");
        insertData.put("phone", "333333333");
        insertData.put("address", "Calle 20");
        insertData.put("email", "oscar@mail.com");
        System.out.println("Consumo INSERT: " + example.PostConsumtion("http://localhost/APIenPHP/Insert.php", insertData));
        
        // POST con Datos (Ubdate)
        Map<String, String> updateData = new HashMap<>();
        updateData.put("documnt", "108800");
        updateData.put("name", "Oscar JAVA UPDATE");
        updateData.put("las_name", "Loaiza JAVA UPDATE");
        updateData.put("phone", "333333");
        updateData.put("address", "Calle 20");
        updateData.put("email", "oscar@mail.com");
        System.out.println("Consumo UPDATE: " + example.PostConsumtion("http://localhost/APIenPHP/Update.php", updateData));
        
        // POST con Datos (Delete)
        Map<String, String> deleteData = new HashMap<>();
        deleteData.put("cedula", "102200");
        System.out.println("Consumo DELETE: " + example.PostConsumtion("http://localhost/APIenPHP/Delete.php", deleteData));
    }
}
