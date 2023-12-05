package ex1;

public class Pessoa implements Comparable<Pessoa>{
	private String nome;
	private Double idade;
	
	@Override
	public int compareTo(Pessoa anotherPessoa) {
		// TODO Auto-generated method stub
		return this.idade.compareTo(anotherPessoa.idade);
	}
}
