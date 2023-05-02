public class ManipularString {

    public static void main(String[] args){
        String x = "   Olá mundo, esse é o novo mundo";
        System.out.println(x.length()); //conta quantas letras tem na frase
        System.out.println(x + " concatenada"); // concatena palavras
        System.out.println(x.contains("novo")); //verifica se a palavra esta contida na frase
        System.out.println(x.indexOf("mundo")); //verifica a primeira aparição da palavra
        System.out.println(x.lastIndexOf("mundo")); // verifica a última aparoção da palavra
        System.out.println(x.toUpperCase()); //transforma tudo para caixa alta
        System.out.println(x.toLowerCase()); //trasnforma tudo para caixa baixa
        System.out.println(x.trim()); //remove os primeiros espaçamentos da frase
        System.out.println(x.substring(9)); //busca a frase a partir do numero passado como parâmetro
        System.out.println(x.equals("   Olá mundo, esse é o novo mundo")); // verifica se a palavra passada é igual
    }
}
