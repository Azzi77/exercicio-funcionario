public class TestaFunc {
    public static void main(String[] args) {



        Funcionario funcionario = new Funcionario();


        funcionario.setNome("Regina");
        funcionario.setCPF("111.111.111-12");
        funcionario.setSalario(3000.0);
        funcionario.calcularGanhoBrutoAnual();
        funcionario.calcularImposto();
        funcionario.calcularGanhoLiquidoMensal();


        System.out.println(funcionario.calcularGanhoBrutoAnual() );

        System.out.println(funcionario.calcularImposto());





    }
}
