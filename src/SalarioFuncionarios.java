public class SalarioFuncionarios {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario("Funcionario 1", 25.0, 160);
        Lider lider1 = new Lider("Lider 1", 30.0, 160);
        Gerente gerente1 = new Gerente("Gerente 1", 35.0, 160);

        System.out.println("Salário Funcionário 1: R$" + funcionario1.calcularSalario());
        System.out.println("Salário Lider 1: R$" + lider1.calcularSalario());
        System.out.println("Salário Gerente 1: R$" + gerente1.calcularSalario());
    }
}