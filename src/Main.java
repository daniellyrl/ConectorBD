import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Conexao c = new Conexao();
        c.GeraConexao();

        PessoaDAO PessoaDAO = new PessoaDAO();
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome da pessoa: " );
        String nome = sc.nextLine();
        System.out.println("Digite a idade da pessoa: ");
        int idade = sc.nextInt();

        Pessoa p = new Pessoa();
        p.setNome(nome);
        p.setIdade(idade);

        PessoaDAO.adiciona(p);

        System.out.println("Pessoa adicinada com sucesso! ");
    }
}
