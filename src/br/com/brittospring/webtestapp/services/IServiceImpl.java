package br.com.brittospring.webtestapp.services;

import io.britto.brittospring.annotations.BrittoService;

@BrittoService
public class IServiceImpl implements IService {

	@Override
	public String sayCustomMessage(String message) {
		return "Britto" + message;
	}

}
