import App.Luta;
import App.Lutador;

public class App {
    public static void main(String[] args) throws Exception {
       Lutador l[] = new Lutador[6];
       l[0] = new Lutador("Olivier","França", 31, 1.75f, 69.9f, 11, 2);
       l[1] = new Lutador("Jaques", "Brasil", 29, 1.68f, 58.8f, 14, 2);
       l[2] = new Lutador("Kobe", "EUA", 35, 1.65f, 80.9f, 12, 2);
       l[3] = new Lutador("Lautaro", "Austrália",28, 1.93f, 81.6f, 13, 0);
       l[4] = new Lutador("Gabriel", "Brasil", 37, 1.75f, 119.3f, 5, 4);
       l[5] = new Lutador("Bob Shawn", "EUA", 30, 1.81f, 105.7f, 11, 2);


      Luta UEC01 = new Luta();
      UEC01.marcarLuta(l[0], l[1]);
      UEC01.lutar();
      l[0].status();
      l[1].status();

      UEC01.marcarLuta(l[5], l[4]);
      l[5].apresentar();
      l[4].apresentar();
      UEC01.lutar();
      l[5].status();
      l[4].status();

      
    

    }
}
