import java.util.Random;

public class StackDinamica {
    private CelulaPilha top;

    public void push(Object elemento){
        CelulaPilha novaCelula = new CelulaPilha();
        novaCelula.setDado(elemento);
        novaCelula.setAnterior(this.top);
        this.top = novaCelula;
        }

    public void pop(){
        if(!isEmpyt()){
        System.out.println("Retirando elem. da pilha..: "+this.top.getDado());
        this.top = this.top.getAnterior();
        }else{
        System.out.println("Pilha Vazia!!!");
        } 
    }

    public boolean isEmpyt(){
        if(this.top == null){
        
        return true;
        }else return false;
    }

    public int sizePilha(){
        CelulaPilha p; int cont = 0;
        p = this.top;
        while(p != null){
        p = p.getAnterior();
        cont++;
        }
        return cont; }

    public void imprimir(){
        CelulaPilha p; p = this.top;
        if(isEmpyt()){
        System.out.println("Pilha Vazia!!!");
        }else{
        while(p != null){
        System.out.println("Nome na pilha..: "+p.getDado());
        p = p.getAnterior();
            } 
        } 
    }

    public CelulaPilha top(){
        if(isEmpyt()){
        System.out.println("Pilha Vazia!!!");
        return null;
        }else {
        System.out.println("Nome no topo da Pilha..: "+top.getDado());
        return this.top;
        } 
    } 

    public void realizarSorteio() {
        Random gerador = new Random();

        StackDinamica pilha1 = new StackDinamica();
        StackDinamica pilha2 = new StackDinamica();
        StackDinamica pilha3 = new StackDinamica();

        for (int i = 0; i < 100; i++) {
            int numeroAleatorio = gerador.nextInt(9) + 1;
            if (numeroAleatorio >= 1 && numeroAleatorio <= 3) {
                pilha1.push(numeroAleatorio);
            } else if (numeroAleatorio >= 4 && numeroAleatorio <= 6) {
                pilha2.push(numeroAleatorio);
            } else if (numeroAleatorio >= 7 && numeroAleatorio <= 9) {
                pilha3.push(numeroAleatorio);
            }
        }

        int sorteio = 0;
        int totalSorteados = 0;

        while (!pilha1.isEmpyt() && !pilha2.isEmpyt() && !pilha3.isEmpyt() && totalSorteados < 100) {
            sorteio = gerador.nextInt(3) + 1;

            if (sorteio == 1) {
                pilha1.push(pilha2.top().getDado());
                pilha1.push(pilha3.top().getDado());
                System.out.println("Empilhando os números " + pilha2.top().getDado() + " e " + pilha3.top().getDado() + " na pilha 1");
            } else if (sorteio == 2) {
                pilha2.push(pilha1.top().getDado());
                pilha2.push(pilha3.top().getDado());
                System.out.println("Empilhando os números " + pilha1.top().getDado() + " e " + pilha3.top().getDado() + " na pilha 2");
            } else if (sorteio == 3) {
                pilha3.push(pilha1.top().getDado());
                pilha3.push(pilha2.top().getDado());
                System.out.println("Empilhando os números " + pilha1.top().getDado() + " e " + pilha2.top().getDado() + " na pilha 3");
            }

            pilha1.pop();
            pilha2.pop();
            pilha3.pop();
            totalSorteados++;
        }

        System.out.println("\nPilha 1:");
        pilha1.imprimir();
        System.out.println("\nPilha 2:");
        pilha2.imprimir();
        System.out.println("\nPilha 3:");
        pilha3.imprimir();

        if (pilha1.isEmpyt() || pilha2.isEmpyt() || pilha3.isEmpyt()) {
            System.out.println("\nO programa foi encerrado porque uma das pilhas ficou vazia.");
        } else {
            System.out.println("\nO programa foi encerrado porque atingiu o total de números sorteados.");
        }
    }
}
