package com.wm.jsf.facesmessage;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

@ManagedBean
@RequestScoped
public class PagamentoBean {
	
	private ResumoPedido resumoPedido = new ResumoPedido("E-Book Java EE 7", 97.0, null, 97.0);
	
	public String realizarPagamento() {
		FacesContext.getCurrentInstance().addMessage(
				null, new FacesMessage("Pagamento realizado com sucesso!"));
		
		FacesContext.getCurrentInstance()
			.getExternalContext()
			.getFlash().setKeepMessages(true);
		
		return "pagamento-sucesso.xhtml?faces-redirect=true";
	}
	
	public String realizarPagamentoEVerResumo() {
		FacesContext.getCurrentInstance().addMessage(
				null, new FacesMessage("Pedido realizado com sucesso!"));
		
		FacesContext.getCurrentInstance()
			.getExternalContext()
			.getFlash().setKeepMessages(true);
		
		FacesContext.getCurrentInstance()
			.getExternalContext()
			.getFlash().put("rp", resumoPedido);
		
		return "pagamento-sucesso.xhtml?faces-redirect=true";
	}
	
	public ResumoPedido getResumoPedido() {
		return resumoPedido;
	}
}
