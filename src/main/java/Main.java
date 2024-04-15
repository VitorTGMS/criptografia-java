import java.util.*;

public class Main {
  public static void main(String[] args) {
    String pal;
    StringBuilder cripto = new StringBuilder();
    Stack<Character> vogal = new Stack<Character>();
    Queue<Character> consoante = new LinkedList<Character>();
    Queue<Integer> crip = new LinkedList<Integer>();

    Scanner sc = new Scanner(System.in);
    System.out.println("Entre com uma palavra: ");
    pal = sc.next();

    // percore a palavra e verifica se é vogal ou consoante e ordenando uma variavel
    // cripgráfica
    for (int i = 0; i < pal.length(); i++) {
      if (pal.charAt(i) == 'a' || pal.charAt(i) == 'e' || pal.charAt(i) == 'i' || pal.charAt(i) == 'o'
          || pal.charAt(i) == 'u') {
        vogal.push(pal.charAt(i));
        crip.add(1);
      } else {
        consoante.add(pal.charAt(i));
        crip.add(2);
      }
    }

    // System.out.println(vogal);
    // System.out.println(consoante);
    // System.out.println(crip);

    // escneia a variavel cripgráfica ordenando onde deve haver vogal e consoante
    while (!crip.isEmpty()) {
      if (crip.peek() == 1) {
        cripto.append(vogal.pop());
      } else {
        cripto.append(consoante.remove());
      }
      crip.remove();
    }

    System.out.println("Palavra original: " + pal);
    System.out.println("Palavra criptografada: " + cripto.toString());

    sc.close();
  }
}