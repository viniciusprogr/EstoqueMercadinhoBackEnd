package com.mercadinho.estoque.exceptions;

public class UnauthorizedAccessBussinessException extends BusinessException {

	private static final long serialVersionUID = 1L;

	public UnauthorizedAccessBussinessException(String message) {
		super(message);
	}
}
