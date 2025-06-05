public class Main {

    // Classe base Produto
    static class Produto {
        protected String nome;
        protected double preco;

        public Produto(String nome, double preco) {
            this.nome = nome;
            this.preco = preco;
        }

        public void exibirInfo() {
            System.out.println("Produto: " + nome);
            System.out.println("Preço: R$ " + String.format("%.2f", preco));
        }
    }

    // Subclasse Livro
    static class Livro extends Produto {
        private String autor;
        private int numPaginas;
        private boolean capaDura;

        public Livro(String nome, double preco, String autor, int numPaginas, boolean capaDura) {
            super(nome, preco);
            this.autor = autor;
            this.numPaginas = numPaginas;
            this.capaDura = capaDura;
        }

        @Override
        public void exibirInfo() {
            super.exibirInfo();
            System.out.println("Autor: " + autor);
            System.out.println("Número de páginas: " + numPaginas);
            System.out.println("Capa dura: " + (capaDura ? "Sim" : "Não"));
        }
    }

    // Subclasse Camisa
    static class Camisa extends Produto {
        private String cor;
        private String tamanho;
        private String material;

        public Camisa(String nome, double preco, String cor, String tamanho, String material) {
            super(nome, preco);
            this.cor = cor;
            this.tamanho = tamanho;
            this.material = material;
        }

        @Override
        public void exibirInfo() {
            super.exibirInfo();
            System.out.println("Cor: " + cor);
            System.out.println("Tamanho: " + tamanho);
            System.out.println("Material: " + material);
        }
    }

    // Programa principal
    public static void main(String[] args) {
        Livro livro1 = new Livro("Java para Iniciantes", 99.90, "Carlos Silva", 500, true);
        Camisa camisa1 = new Camisa("Camisa Polo", 59.90, "Azul", "M", "Algodão");

        System.out.println("--- Informações do Livro ---");
        livro1.exibirInfo();

        System.out.println("\n--- Informações da Camisa ---");
        camisa1.exibirInfo();
    }
}
