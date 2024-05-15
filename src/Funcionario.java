class Funcionario {
    private String nome;
    private double valorHora;
    private int horasTrabalhadas;

    public Funcionario(String nome, double valorHora, int horasTrabalhadas) {
        this.nome = nome;
        this.valorHora = valorHora;
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public double calcularSalario() {
        double salario = valorHora * horasTrabalhadas;
        if (this instanceof Lider) {
            salario *= 1.02; // Incremento de 2% para líderes
        } else if (this instanceof Gerente) {
            salario *= 1.05; // Incremento de 5% para gerentes
        }
        return salario;
    }
}