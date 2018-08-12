package com.demo.guice;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.google.inject.Injector;

public class InjectorRegistry {
	private static Logger logger = LogManager.getLogger();
	
	private static final InjectorRegistry INSTANCE = new InjectorRegistry();
	
	public Injector clientServicesInjector;
	
	private InjectorRegistry() {
		super();
	}

	public Injector getClientServicesInjector(){
		if(clientServicesInjector == null){
			throw new RuntimeException("clientServicesInjector is null - please call setClientServicesInjector earlier in your application");
		}
		return clientServicesInjector;
	}
	
	public void setClientServicesInjector(Injector clientServicesInjector) {
		logger.info("setting clientServicesInjector");
		if(clientServicesInjector != null){
			logger.warn("settting clientServicesInjector to " + clientServicesInjector + " although it was previously set to " + this.clientServicesInjector);
		}
		this.clientServicesInjector = clientServicesInjector;
	}

	public static InjectorRegistry getInstance() {
		return INSTANCE;
	}

}
