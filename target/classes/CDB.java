public final class CDB extends RendaFixa implements IRenda{
    private final double juros = 1.2;
  public CDB(String nome, String CPF, String banco) {
    super(nome, CPF, banco);
  }
  
  public double juros(double primeiro, int tempo, double selic){
      double taxa = selic/100;
      double taxaMes = (Math.pow(1 + taxa, 1.0 / 12) - 1) * 1.2;
      double juros = primeiro*(Math.pow(1 + taxaMes, tempo)) - primeiro;
      
      double impostoRenda = calcular(tempo);
      
      return juros * (1 - impostoRenda);
  }
  
  public double calcular(int meses){
      double impostoRenda;
      if(meses <= 6){
          impostoRenda = 0.225;
      } else if(meses <= 12){
          impostoRenda = 0.20;
      } else if(meses <= 24){
          impostoRenda = 0.175;
      } else{
          impostoRenda = 0.15;
      }
      return impostoRenda;
  }
}