package foo.fd.estudodecasolistar.model;

public class Estado {

    private int id;
    private String sigla;
    private String nome;

    public Estado(){}

    public Estado(int id, String sigla, String nome){

        this.setId(id);
        this.setSigla(sigla);
        this.setNome(nome);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
