package dio.queueFila;

import java.util.LinkedList;
import java.util.Queue;

public class Exec {

	public static void main(String[] args) {
		
		// interface Queue fila onde o primeiro adicionado e o primeiro a ser removido.
		Queue<Carro> queueCarros = new LinkedList<>();
		
		// criado tres objetos.
		queueCarros.add(new Carro("Ford"));
		queueCarros.add(new Carro("Fiat"));
		queueCarros.add(new Carro("Volkswagen"));
		
		// impressao da fila de objetos.
		System.out.println(queueCarros);
		
		// adiciona um objeto com metodo add.
		System.out.println(queueCarros.add(new Carro("Chevrolet")));
		
		// adicionando um objeto com metodo offer que retorna false se não adicionar mais nao da erro.
		System.out.println(queueCarros.offer(new Carro("Peugeot")));
		
		System.out.println(queueCarros);
		
		// pega o primeiro objeto da fila com metodo peek mais nao remove.
		System.out.println(queueCarros.peek());
		
		System.out.println(queueCarros);
		
		// pega o primeiro objeto da fila e remove com metodo poll.
		System.out.println(queueCarros.poll());
		
		System.out.println(queueCarros);
		
		// verifica se a fila esta vazia com metodo isEmpty.
		System.out.println(queueCarros.isEmpty());
		
		// verifica o tamanho da fila com metodo size.
		System.out.println(queueCarros.size());

	}

}
