import java.util.ArrayList;
public class Anylist<E> {
    private E[] buffer;
    private int Icapacidad;
    private int numEle;
    public Anylist(int Icapacidad){
        this.Icapacidad=Icapacidad;
        if (Icapacidad<=0){
            throw new IllegalArgumentException("El tamaño del buffer no puede ser menor o igual a 0");}
        this.buffer=(E[]) new Object[Icapacidad];
        this.numEle=0;
        System.out.printf("ahora ");
    }
    public Anylist(){
        this(35);
    }

    public void add(E elemento){
        if (numEle==buffer.length){
            int capacidad= buffer.length+Icapacidad;
            E[] nuevo =(E[]) new Object[capacidad];
            nuevo=java.util.Arrays.copyOf(buffer,capacidad);
            buffer=nuevo;
            System.out.printf("Ahora el array tiene %d posiciones%n",capacidad);
            }
        buffer[numEle]=elemento;
        numEle++;
        }

//        public void DeleteALL(){buffer.clear();}
//
//    public void Delete(int Posi){
//        if (Posi>buffer.length || Posi<=0){
//            throw new IllegalArgumentException("LA POSICION QUE DESEA ELEMINAR NO EXISTE");
//        }
//        for (int i=0;i> buffer.length;i++){
//            if (i+1==Posi) {
//                E[] nuevo2 = (E[]) new Object[buffer.length - 1];
//                nuevo2.remove
//            }
//        }
//    }

    }
