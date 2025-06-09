class Cafeteria implements Predio {
    private String nome;

    public Cafeteria(String nome) {
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