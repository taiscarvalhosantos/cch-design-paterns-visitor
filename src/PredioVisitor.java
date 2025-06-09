interface PredioVisitor {
    void visitar(PredioResidencial predioResidencial);
    void visitar(Banco banco);
    void visitar(Cafeteria cafeteria);
}