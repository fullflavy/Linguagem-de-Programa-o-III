public class Livro{
    private String titulo;
    private String autor;
    private int nroPaginas;
    private int anoPublicacao;
    
    public Livro(String titulo, String autor, int nroPaginas, int anoPublicacao){
        this.titulo = titulo;
        this.autor = autor;
        this.nroPaginas = nroPaginas;
        this.anoPublicacao = anoPublicacao;
    }

    public Livro(){
        this("", "", 0, 0);
    }

    //getters:
    public String getTitulo(){
        return titulo;
    }

    public String getAutor(){
        return autor;
    }

    public int getNroPaginas(){
        return nroPaginas;
    }

    public int getAnoPublicacao(){
        return anoPublicacao;
    }

    public String toString(){
        String print;
        print = String.format("Info:\n "+ getTitulo() + "\n " + getAutor() + "\n " + getNroPaginas() + "\n " + getAnoPublicacao());
        return print;
    }

    public boolean isOlder(int anoPub){
        if(this.anoPublicacao > anoPub){
            return true;
        }else{
            return false;
        }
    }
}