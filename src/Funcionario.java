import java.util.Date;

public class Funcionario {

    String nome;
    String matricula;
    double salario;
    Date dataAdmissao;
    String CPF;

    public Funcionario(String nome, String matricula, double salario, Date dataAdmissao, String CPF) {
        this.nome = nome;
        this.matricula = matricula;
        this.salario = salario;
        this.dataAdmissao = dataAdmissao;
        this.CPF = CPF;
    }

    public Funcionario() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Date getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(Date dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public void receberAumento(double aumento) {
        salario += aumento;
    }

    public double calcularGanhoBrutoAnual() {
        return salario * 12;

    }

    public double calcularImposto() {

        double imposto = 0;
        if (salario > 2500.0) {
            imposto = ((salario - 2500.0) * 0.175 + (salario * 0.11));

        } else {
            imposto = salario * 0.11;

        }
        return imposto * 12;
    }
    public double calcularGanhoLiquidoMensal(){

        double imposto = 0;
        salario -= imposto;
        return salario;
    }


}

        





