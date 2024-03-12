import java.util.Scanner;
import java.io.*;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    System.out.println("Digite o valor a ser investido em R$:");
    double valor = scanner.nextDouble();
    System.out.println("Digite o tempo em meses:");
    int tempo = scanner.nextInt();
    System.out.println("Digite a taxa SELIC do ano:");
    double selic = scanner.nextDouble();
    if (selic >= 8.5) {
      System.out.println("O rendimento da poupança é de 0,5% a.m");
    } else {
      System.out.println("O rendimento da poupança é de 70% da SELIC");
    }
    if (tempo <= 180) {
      System.out.println("O IR do CDB é de 22,5%");
    } else if (tempo > 180 && tempo <= 360) {
      System.out.println("O IR do CDB é de 20%");
    } else if (tempo > 360 && tempo <= 720) {
      System.out.println("O IR do CDB é de 17,5%");
    } else {
      System.out.println("O IR do CDB é de 15%");
    }
    CDB CDB = new CDB("Nome: CDB", "12345678901","Banco CDB");
    LCA LCA = new LCA("Nome: LCA", "23456789012", "Banco LCA");
    LCI LCI = new LCI("Nome: LCI", "34567890123", "Banco LCI");
    Poupanca Poupanca = new Poupanca("Nome: Poupanca", "45678901234", "Banco Poupanca");
    
    double calculoCDB = CDB.juros(valor,tempo,selic);
    double calculoLCA = LCA.juros(valor, tempo, selic);
    double calculoLCI = LCI.juros(valor, tempo, selic);
    double calculoPoupanca = Poupanca.juros(valor, tempo, selic);
    
        System.out.println("Calculo do CDB: " + "R$ " +  String.format("%.2f",calculoCDB));
        System.out.println("Calculo do LCA: " + "R$ " + String.format("%.2f",calculoLCA));
        System.out.println("Calculo do LCI: " + "R$ " + String.format("%.2f",calculoLCI));
        System.out.println("Calculo do Poupanca: " + "R$ " + String.format("%.2f",calculoPoupanca));
      
     write("results.txt", "CDB", calculoCDB);
        write("results.txt", "LCA", calculoLCA);
        write("results.txt", "LCI", calculoLCI);
        write("results.txt", "Poupanca", calculoPoupanca);
  
  }
    private static void write(String Arquivo, String tipo, double resultado){
            try(BufferedWriter writer = new BufferedWriter(new FileWriter(Arquivo, true))){
                writer.write("Resultado: " + tipo + " R$ " + String.format("%.2f", resultado) + "\n");
            } catch(IOException e){
                System.err.println("Erro ao escrever." + e.getMessage());
            }
        }
}