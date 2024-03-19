import java.util.Arrays;

public class IntegerList {
private final static int CAPACIDADIN=7;
private int capacidad;
    private int[] buffer;
    private boolean comprobador[];
    public IntegerList(int capacidadInicial){
        if (capacidadInicial<7){
             throw new IllegalArgumentException("El arrays no debee ser mayor que ");
        }
        this.capacidad=capacidadInicial;
        buffer=new int[capacidad];
        comprobador=new boolean[capacidad];
        Arrays.fill(comprobador,false);
    }
    public IntegerList(){
        this(CAPACIDADIN);
    }
    public void add(int element,int posicionBuffer){
        if (posicionBuffer>buffer.length-1){
             throw new IllegalArgumentException("La posicion especificada para el buffer no debe ser mayor que el tamaño del arrays");
        }
        for (int i=0;i<buffer.length;i++){
        if (i-1==posicionBuffer){
            buffer[i]=element;
            comprobador[i]=true;
        }
        }

    }

    public int size(){
    return buffer.length;
    }
    public boolean isEmpty(){
        boolean estado=true;
        for (int i=0;i<buffer.length;i++){
            if (comprobador[i]=true){
                estado=false;
            }
        }
        return false;
    }
}
