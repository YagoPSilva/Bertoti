class Cliente {
    private String nome;
    private int idade;
    private Seguro seguro;

    public Cliente(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void setSeguro(Seguro seguro) {
        this.seguro = seguro;
    }

    public void fazerSeguro() {
        System.out.println("Cliente: " + nome + " (Idade: " + idade + ")");
        seguro.assegurar();
    }
}