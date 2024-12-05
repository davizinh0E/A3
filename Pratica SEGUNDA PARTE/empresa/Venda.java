import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

class Produto {
    private String codigo;
    private String nome;
    private String categoria;
    private double preco;
    private int quantidadeEstoque;

    public Produto(String codigo, String nome, String categoria, double preco, int quantidadeEstoque) {
        this.codigo = codigo;
        this.nome = nome;
        this.categoria = categoria;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    // Getters e setters
    public String getCodigo() { return codigo; }
    public String getNome() { return nome; }
    public String getCategoria() { return categoria; }
    public double getPreco() { return preco; }
    public int getQuantidadeEstoque() { return quantidadeEstoque; }
    public void setQuantidadeEstoque(int quantidade) { this.quantidadeEstoque = quantidade; }

    @Override
    public String toString() {
        return "Produto{" +
                "codigo='" + codigo + '\'' +
                ", nome='" + nome + '\'' +
                ", categoria='" + categoria + '\'' +
                ", preco=" + preco +
                ", quantidadeEstoque=" + quantidadeEstoque +
                '}';
    }
}

class ProdutoService {
    private List<Produto> produtos = new ArrayList<>();

    // Cadastrar novo produto
    public void cadastrarProduto(Produto produto) {
        // Verifica se já existe um produto com o mesmo código
        if (produtos.stream().noneMatch(p -> p.getCodigo().equals(produto.getCodigo()))) {
            produtos.add(produto);
            System.out.println("Produto cadastrado com sucesso: " + produto.getNome());
        } else {
            System.out.println("Erro: Produto com este código já existe.");
        }
    }

    // Buscar produto por código
    public Optional<Produto> buscarProdutoPorCodigo(String codigo) {
        return produtos.stream()
                .filter(p -> p.getCodigo().equals(codigo))
                .findFirst();
    }

    // Atualizar estoque
    public void atualizarEstoque(String codigo, int novaQuantidade) {
        Optional<Produto> produtoOptional = buscarProdutoPorCodigo(codigo);
        
        produtoOptional.ifPresentOrElse(
            produto -> {
                produto.setQuantidadeEstoque(novaQuantidade);
                System.out.println("Estoque atualizado para o produto: " + produto.getNome());
            },
            () -> System.out.println("Produto não encontrado.")
        );
    }

    // Listar todos os produtos
    public void listarProdutos() {
        if (produtos.isEmpty()) {
            System.out.println("Nenhum produto cadastrado.");
        } else {
            produtos.forEach(System.out::println);
        }
    }

    // Método principal para demonstração
    public static void main(String[] args) {
        ProdutoService service = new ProdutoService();

        // Cadastrando produtos
        Produto camisa = new Produto("001", "Camisa Polo", "Camisetas", 79.99, 50);
        Produto calca = new Produto("002", "Calça Jeans", "Calças", 129.99, 30);

        service.cadastrarProduto(camisa);
        service.cadastrarProduto(calca);

        // Listando produtos
        System.out.println("\nProdutos cadastrados:");
        service.listarProdutos();

        // Atualizando estoque
        service.atualizarEstoque("001", 45);

        // Buscando produto
        Optional<Produto> produtoEncontrado = service.buscarProdutoPorCodigo("002");
        produtoEncontrado.ifPresentOrElse(
            p -> System.out.println("\nProduto encontrado: " + p),
            () -> System.out.println("Produto não encontrado")
        );
    }
}