package Exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Estoque {
	
	
	Scanner leia = new Scanner(System.in);
	ArrayList<String> produto = new ArrayList<>();
	ArrayList<Integer> estoque = new ArrayList<Integer>();
	
	
	
	public Estoque() {
		
	}
	
	public void Bancodeprodutos() {
			
		produto.add("Cp.Prot. IPHONE X");
		produto.add("Carregador IPHONE X23");
		produto.add("Air phone SAMSUNG S42");
		produto.add("Smartphone LG Z98");
	}
	
	public void Bancodeestoque() {
			
		estoque.add(15);
		estoque.add(5);
		estoque.add(41);
		estoque.add(29);
		
	}
	
	public void adicionarprodutos(String novo) {
		produto.add(novo);
	}
	
	public void adicionarestoque(int valor) {
		estoque.add(valor);
	}
	
	public void buscarprodutos(String busca) {
		produto.contains(busca);
		if(produto.contains(busca)) {
		System.out.println("Produto encontrado!");
		}
		else {
		System.out.println("Produto não encontrado");
		}
	}
	
	public void alterarprodutos(String busca) {
		produto.contains(busca);
		if(produto.contains(busca)) {
		System.out.println("Produto encontrado!");
		produto.remove(busca);
		System.out.println("Entre com o novo produto: ");
		produto.add(leia.nextLine());
		System.out.println("Produto alterado!");
		}
		else {
		System.out.println("Produto não encontrado");
		}
	}
	
	public void removerproduto(String busca) {
		produto.contains(busca);
		if(produto.contains(busca)) {
		System.out.println("Produto encontrado!");
		produto.remove(busca);
		System.out.println("Produto removido!");
		}
		else {System.out.println("Produto não encontrado");
		}
		}
	
	public void imprimirprodutoestoque() {
		System.out.println("|Lista de produtos|");
		for(int x=0;x<produto.size();x++){
			
			System.out.println("Produto: "+produto.get(x)+"\tQtd: "+estoque.get(x));
			}
		}
		
	
}
