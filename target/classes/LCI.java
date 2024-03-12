final class LCI extends RendaFixa {
    private final double juros = 1.0;
  public LCI(String nome, String CPF, String banco) {
    super(nome, CPF, banco);
  }
  
  public double juros(double primeiro, int tempo, double selic){
      double taxa = selic/100;
      double taxaMes = Math.pow(1 + taxa, 1.0 / 12) - 1;
      double juros = primeiro*(Math.pow(1 + taxaMes, tempo)) - primeiro;
   
      return juros;
  }
}