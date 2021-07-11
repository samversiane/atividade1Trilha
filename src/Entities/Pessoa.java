package Entities;

public class Pessoa {

    private String nome;
    private String dtNascimento;
    private String cpf;
    private Double salario;
    private Integer qtdDependentes;
    private Float altura;

    public Pessoa() {
    }

    public Pessoa(String nome, String dtNascimento, String cpf,
                  Double salario, Integer qtdDependentes, Float altura) {
        this.nome = nome;
        this.dtNascimento = dtNascimento;
        this.cpf = cpf;
        this.salario = salario;
        this.qtdDependentes = qtdDependentes;
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDtNascimento() {
        return dtNascimento;
    }

    public void setDtNascimento(String dtNascimento) {
        this.dtNascimento = dtNascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public Integer getQtdDependentes() {
        return qtdDependentes;
    }

    public void setQtdDependentes(Integer qtdDependentes) {
        this.qtdDependentes = qtdDependentes;
    }

    public Float getAltura() {
        return altura;
    }

    public void setAltura(Float altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Nome: " + nome +
                "\nData de nascimento: " + dtNascimento +
                "\nCPF: " + cpf +
                "\nSalario: " + salario +
                "\nQuantidade de dependentes: " + qtdDependentes +
                "\nAltura: " + altura;
    }
}