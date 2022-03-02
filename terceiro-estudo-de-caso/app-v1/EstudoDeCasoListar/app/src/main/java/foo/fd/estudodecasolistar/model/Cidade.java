package foo.fd.estudodecasolistar.model;

public class Cidade {

    // id pk
    // estadoID fk
    // nome

    private int id;
    private int estadoID;
    private String nome;

    public Cidade(){}

    public Cidade(int id, int estadoID, String nome){

        this.setId(id);
        this.setEstadoID(estadoID);
        this.setNome(nome);
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEstadoID() {
        return estadoID;
    }

    public void setEstadoID(int estadoID) {
        this.estadoID = estadoID;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String toString(String sigla) {

        return "--> ID: " + this.getId() + " --> Cidade: " + this.getNome() + " --> Sigla: " + sigla;
    }
}
