public abstract class RendaFixa {
    private String nome;
  private String CPF;
  private String banco;;
  public RendaFixa(String nome, String CPF, String banco) {
    this.nome = nome;
    this.CPF = CPF;
    this.banco = banco;
  }
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }
  public String getCPF() {
    return CPF;
  }
  public void setCPF(String CPF) {
    this.CPF = CPF;
  }
  public String getBanco() {
    return banco;
  }
  public void setBanco(String banco) {
    this.banco = banco;
  } 


public abstract double juros(double primeiro, int tempo , double selic);
}