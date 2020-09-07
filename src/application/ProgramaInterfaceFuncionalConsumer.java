package application;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import model.entities.Produto;
import model.util.AlmentoPreco;

public class ProgramaInterfaceFuncionalConsumer {

	public static void main(String[] args) {
		
		List<Produto> list = new ArrayList<>();
		list.add(new Produto("Tv", 900.00));
		list.add(new Produto("Mouse", 50.00));
		list.add(new Produto("Tablet", 350.50));
		list.add(new Produto("HD Case", 80.90));
		
		double aumento = 1.1;
		
		list.forEach(p -> p.setPreco(p.getPreco()*aumento));
		
		list.forEach(System.out::println);
	}

}
