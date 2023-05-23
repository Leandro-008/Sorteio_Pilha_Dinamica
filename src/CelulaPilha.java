public class CelulaPilha {
    private Object elemento;
    private CelulaPilha anterior;
    public CelulaPilha(){}

    public CelulaPilha(Object elemento, CelulaPilha anterior){
    this.elemento = elemento;
    this.anterior = anterior;
    }

    public Object getDado(){
        return this.elemento;
    }
    
    public void setDado(Object elemento){
    this.elemento = elemento;
    }

    public CelulaPilha getAnterior(){
        return(this.anterior);
        }
        
    public void setAnterior(CelulaPilha anterior){
    this.anterior = anterior;
    }
}