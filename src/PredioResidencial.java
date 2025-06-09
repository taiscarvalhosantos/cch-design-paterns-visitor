class PredioResidencial implements Predio {
    private String nome;

    public PredioResidencial(String nome) {
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