package Bloco1;

import java.util.ArrayList;
import java.util.Scanner;

public class BibliotecaComunitaria {
	
public static void main(String[] args) {
		
		
		int l;
		Scanner leia = new Scanner(System.in);
		Biblioteca b = new Biblioteca ("nome","autor", "editora", "genero", 0);
		BibliotecaComunitaria bc = null;
		
		ArrayList<String> estoque = new ArrayList(); //Collection
		
		
		ArrayList<String> estoquel = new ArrayList(); //Collection
		
		estoquel.add("\n A Culpa das Estrelas");
		estoquel.add("\n Guerra dos Tronos");
		estoquel.add("\n Harry Potter e a Pedra Filosofal");
		estoquel.add("\n A Paciente Silenciosa");
		estoquel.add("\n Morada da Noite");
		estoquel.add("\n A garota que roubava livros");
		
		
// FAZER MENU
		do 
		{
			System.out.println("--------------------");
			
			System.out.println();
			
			System.out.println("--------MENU-----------");
			
			System.out.println("\n (1) Deseja doar livros.");
			System.out.println("\n (2) Deseja retirar qual livro.");
			System.out.println("\n (3) Deseja trocar com algum livro do estoque");
			System.out.println("\n (4) Deseja mostrar todos os produtos do estoque");
			System.out.println("\n (0) Deseja encerrar o programa");
			System.out.println("\n Digite a sua opção");
			l = leia.nextInt();
		
		
			switch(l)
			
			{
			
			case 1: //DOAÇÃO
				
				leia.nextLine(); //NEXTLINE - USOU PARA LIMPAR
				System.out.println("\n Digite o nome do livro que deseja doar: ");
				String livros = leia.nextLine();// NEXTLINE - PARA LER UMA COISA TIPO STRING
				System.out.println("\n Qual o gênero do seu livro?");
				String genero = leia.nextLine();
				System.out.println("\n Qual o autor do seu livro?");
				String autor = leia.nextLine();
				System.out.println("\n Qual a editora do seu livro?");
				String editora = leia.nextLine();
				System.out.println("\n Escreva um código para o seu livro?");
				int codigoDoLivro = leia.nextInt();
				estoquel.add(livros); //USUARIO VAI ESCREVER E AQ VAI ADICIONAR AO ESTOQUE
				
				leia.nextLine(); //NEXTLINE - USOU PARA LIMPAR
				
				break;
				
				
			case 2 : //RETIRAR
				
				leia.nextLine();
				
				System.out.println(estoquel); //MOSTRAR O ESTOQUE de livros PARA VISUALIZAÇÃO
				leia.nextLine(); 
				
				System.out.println("\n Digite o livro que quer retirar do estoque: ");
				String livro = leia.nextLine();
					
				if(estoque.contains(livro)) //CONTAINS - VER SE EXISTE DETERMINADO PRODUTO PARA REMOVER
				{
					estoque.remove(livro);
				}
				System.out.println("\n Produto removido com sucesso!!");
				System.out.println(estoque); //MOSTRAR O ESTOQUE PARA VISUALIZAÇÃO
				break;
				
			case 3: //TROCAR
				//QUAL PRODUTO VAI TIRAR E QUAL VAI COLOCAR
				//MAS TEM QUE VERIFICAR SE TEM E ATUALIZAR
				//MAS PODE SER QUE O PRODUTO NÃO TENHA NO ESTOQUE
				
				leia.nextLine();
				System.out.println(estoquel); //MOSTRAR O ESTOQUE DE LIVROS PARA VISUALIZAÇÃO
				leia.nextLine(); 
				System.out.println("\n Digite o livro que queres trocar do estoque: ");
				String verifica = leia.nextLine();
				System.out.println("\n Digite o nome do livro que vai entrar no lugar do " +verifica+ " : ");
				String novo = leia.nextLine();
				
				//VERIFICA SE TEM O PRODUTO 
				
				if(estoquel.contains(verifica)) //CONTAINS - VER SE EXISTE DETERMINADO PRODUTO PARA REMOVER
				{
					estoquel.remove(verifica);
					estoquel.add(novo);
				}
				else //SE NÃO TIVER
				{
					System.out.println("\n Produto Indisponivel no momento!!");
				}
			
		//MOSTRAR A LISTA DNV PARA VER SE ATUALIZOU
				System.out.println(estoquel); 
				break;
			
				
				
			case 4: //MOSTRAR
					
					System.out.println("\n Os produtos no estoque são");
					System.out.printf("\n",estoquel); //MOSTRAR ESTOQUE
					break;
					
			case 0: System.out.println("\n Finalizou o Programa!!!");
					break;
					
					default : //EXEÇÃO
				
				System.out.println("Erro! Opção Indisponivel");
			}
		}
		
		while(l!=0); //ENQUANTO DIFERENTE DE 0 VAI SAIR
		
	}

}
