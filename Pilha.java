public class Pilha {
    private int topo;
    private int[] elementos;
    Pilha(){
        topo = 0;
        elementos = new int[10];
    }
    void empilha(int coisa){
        elementos[topo] = coisa;
        topo++;
        cresce();
    }
    int desempilha(){
        topo--;
        int coisa = elementos[topo];
        return coisa;
    }
    int tamanho(){
        return topo;
    }

    String printy(){
       String a = "[";
       for (int i = 0; i < topo; i++) {
            int element = elementos[i];
            if (i == topo - 1){
                a += String.valueOf(element) + "]"; // último elemento 

            } else{
                a += String.valueOf(element) + ", ";      
            }
       }
       return a;
    }

    void cresce(){
        if (topo == elementos.length){ //verificação se está quase cheia
            int copy[] = new int[elementos.length * 2];
            for (int i = 0; i < topo; i++) {
                copy[i] = elementos[i];
            }
            elementos = copy;
        }
    }

    public static void main(String[] args) {
        // alguns testes
        Pilha nova = new Pilha();
        //cria a pilha com tamanho inicial 10
        nova.empilha(0);
        nova.empilha(1);
        nova.empilha(3);
        nova.empilha(4);
        nova.empilha(0);
        nova.empilha(1);
        System.err.println(nova.elementos.length);
        // tamanho máximo antes de crescer
        nova.empilha(3);
        nova.empilha(0);
        nova.empilha(1);
        nova.empilha(3);
        nova.empilha(3);
        System.err.println(nova.elementos.length);
        // tamanho máximo após crescer 
        nova.empilha(3);
        System.err.println(nova.printy());
        // pilha toda vertical
        
    }

}

