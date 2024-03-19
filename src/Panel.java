public class Panel {
    public static void main(String[] args) {
        //Lista "Dinamica" de cadenas
     Anylist<String> listaNombres=new Anylist<>(19);
     listaNombres.add("Jorge");
     listaNombres.add("Ivan");
     listaNombres.add("Alonso");
     listaNombres.add("Mateo");

     //Lista dinamica de Enteros
        Anylist<Integer> listaNUM=new Anylist<>(19);
        listaNUM.add(2);
        listaNUM.add(6);
        listaNUM.add(56);
        listaNUM.add(49);
     //Lista"Dinamica" de valores Reales
     Anylist<Character> listaLetras=new Anylist<>();
     Anylist<Boolean> listaVorF=new Anylist<>();
    }
}
