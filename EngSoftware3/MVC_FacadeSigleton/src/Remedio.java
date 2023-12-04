public class Remedio {
    private String nome;
    private String laboratorio;
    private int dosagem;
    private int valor;

    public Remedio(String nome, String laboratorio, int dosagem, int valor){
        nome = nome;
        laboratorio = laboratorio;
        dosagem = dosagem;
        valor = valor;
    }

    public String getNome(){
        return nome;
    }

    public String getLaboratorio(){
        return laboratorio;
    }

    public int getDosagem(){
        return dosagem;
    }

    public int getValor(){
        return valor;
    }

    public boolean matches(Remedio remedio){
        if(!nome.equals(remedio.nome)) return false;
        if(!laboratorio.equals(remedio.laboratorio)) return false;
        if(dosagem!= remedio.dosagem) return false;
        if(valor!=remedio.valor) return false;
        return true;
    }
}