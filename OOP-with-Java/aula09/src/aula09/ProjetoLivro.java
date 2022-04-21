package aula09;

public class ProjetoLivro {

	public static void main(String[] args) {
		Pessoa [] p = new Pessoa [2];
		Livro [] l = new Livro [3];
		
		p[0] = new Pessoa("Pedro", 33, "M");
		p[1] = new Pessoa("Maria", 28, "F");
		
		l[0] = new Livro("Aprendendo Java", "Jose da Silva", 300, p[0]);
		l[1] = new Livro("POO para iniciantes", "Maria Candida", 250, p[1]);
		l[2] = new Livro("Javascript facil", "Everisto Alves", 4770, p[0]);
		
		l[0].abrir();
		l[0].folhear(200);
		l[0].avancarPag();
		System.out.println(l[0].detalhes());
		
		System.out.println(l[1].detalhes());
	}

}
