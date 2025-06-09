class Banco implements Predio {
    private String nome;

    public Banco(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public void aceitar(PredioVisitor visitor) {
        visitor.visitar(this);
    }
}