public abstract class Funcionario {
	private String nome;
	private float salario;
	private int id;

	public Funcionario(String nome, float salario, int id) {
		this.nome=nome;
		this.salario=salario;
		this.id=id;
	}
	public Funcionario() {}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public float getSalario() {
		return salario;
	}
	public void setSalario(float salario) {
		this.salario = salario;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public void aumentaSalario(float porcentagem) {
		salario=salario*(1+porcentagem/100);
	}

	@Override
	public String toString() {
		return "Nome: " + getNome() + " Salário: R$ " + getSalario();
	}
}