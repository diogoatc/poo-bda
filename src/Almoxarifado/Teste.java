package Almoxarifado;

public class Teste {

	public static void main(String[] args) {
	
		Peca p = new Peca();
		p.setNuminterno("44232");
		p.setPreco(33);
		p.setQtdeentrada(20);
		p.setQtdesaida(2);
		p.setUpc("22345");
		
		Descricaopeca d = new Descricaopeca();
		d.setAltura("10");
		d.setComprimento("23");
		d.setLargura("20");
		d.setNome("Parafuso");
		d.setPeso("10");
		
		p.setDesc(d);
		
		Ordemcompra o = new Ordemcompra();
		o.setOrdemcompra(true);
		o.setPeca("parafuso");
		o.setQuantpedida(230);
		
		o.setPeca_agr(p);
		
		Cliente c = new Cliente();
		c.setCnpj("1234213.32");
		c.setNome("fulano parafusos");
		c.setTelefone("12321542");
		
		Endereco e = new Endereco();
		e.setCep("223333-222");
		e.setCidade("Rio de Janeiro");
		e.setComplemento("fundos");
		e.setLogradouro("rua Caroá");
		e.setNumero("22");
		e.setUf("RJ");
		
		c.setEnd(e);
		
		System.out.println(c.getEnd().getLogradouro());
		System.out.println(p.getDesc().getLargura());
		System.out.println(o.getPeca_agr().getDesc().getNome());
	}

}
