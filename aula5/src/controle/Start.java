package controle;

public class Start {
	
	public static void main (String[] args){
		
		Funcionario f1	=	new Funcionario();
		f1.cpf			=	"0000000000";
		f1.idade		=	33;
		f1.matricula	=	"33093269";
		f1.nome			=	"Haroldo";
		f1.peso			=	"56";
		
		f1.andar();
		f1.trabalhar();

		
		
	}

}
