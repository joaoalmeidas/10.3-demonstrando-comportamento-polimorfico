
public class PolimorfismoTeste {

	public static void main(String[] args) {
		
		FuncionarioComissionado comissionado = new FuncionarioComissionado("Jo�o", "Guilherme", "1225443546", 10000, .06);
		
		FuncionarioBaseMaisComissao basecomissao =  new FuncionarioBaseMaisComissao("Atilio", "Siqueira", "55461248463", 20000, .03, 500);
		
		System.out.printf("%s %s:%n%s%n%n",
						  "Chama toString de FuncionarioComissionado com uma ref�rencia da superclasse.",
						  "para a superclasse", comissionado.toString());
		
		System.out.printf("%s %s:%n%s%n%n",
						  "Chama toString de FuncionarioBaseMaisComissao com uma ref�rencia da subclasse.",
						  "para a subclasse", basecomissao.toString());
		
		FuncionarioComissionado comissionado2 = basecomissao;
		
		System.out.printf("%s %s:%n%s%n%n",
						  "Chama toString de FuncionarioBaseMaisComissao com uma ref�rencia da superclasse.",
						  "para a subclasse", comissionado2.toString());
	}

}
