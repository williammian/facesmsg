package com.wm.jsf.facesmessage;

public class ResumoPedido {
	
	private String item;
	
	private double valor;
	
	private String cartao;
	
	private double desconto;

	public ResumoPedido(String item, double valor, String cartao, double desconto) {
		this.item = item;
		this.valor = valor;
		this.cartao = cartao;
		this.desconto = desconto;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getCartao() {
		return cartao;
	}
	
	public void setCartao(String cartao) {
		this.cartao = cartao;
	}

	public double getDesconto() {
		return desconto;
	}

	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}
}