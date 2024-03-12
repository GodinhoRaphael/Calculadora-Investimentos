final class Poupanca extends RendaFixa {
    private final double juros = 0.005;
    
  public Poupanca(String nome, String CPF, String banco) {
    super(nome, CPF, banco);
  }
  
  public double juros(double primeiro, int tempo, double selic){
      double juros;
      
      if(selic >= 8.5){
          juros = this.juros * primeiro * tempo;
      } else{
          double rendimentoMes = Math.pow(1.0 + ( 0.7*selic/100.0), 1.0/12.0) - 1.0;
          juros = primeiro * Math.pow(1.0 + rendimentoMes, tempo) - primeiro;
      }
      return juros;
}
}  