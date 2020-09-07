package model.util;

import java.util.function.Consumer;

import model.entities.Produto;

public class AlmentoPreco implements Consumer<Produto>{

	@Override
	public void accept(Produto p) {
		p.setPreco(p.getPreco()*1.1);		
	}

}
