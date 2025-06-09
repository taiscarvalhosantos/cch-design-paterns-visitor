class CorretorDeSeguros implements PredioVisitor {
    private String nomeCorretor;

    public CorretorDeSeguros(String nomeCorretor) {
        this.nomeCorretor = nomeCorretor;
    }

    @Override
    public void visitar(PredioResidencial predioResidencial) {
        System.out.println(nomeCorretor + " visitou o " + predioResidencial.getNome() + ". Oferecendo seguro médico.");
    }

    @Override
    public void visitar(Banco banco) {
        System.out.println(nomeCorretor + " visitou o " + banco.getNome() + ". Oferecendo seguro contra roubo.");
    }

    @Override
    public void visitar(Cafeteria cafeteria) {
        System.out.println(nomeCorretor + " visitou a " + cafeteria.getNome() + ". Oferecendo seguro contra incêndio e inundação.");
    }
}