package com.arwest.config;

import java.util.Locale;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

@Configuration
public class I18NConfig {
	
	
	@Bean
	public ReloadableResourceBundleMessageSource messageSource() {
		
		ReloadableResourceBundleMessageSource reloadableResourceBundleMessageSource = 
				new ReloadableResourceBundleMessageSource();
		reloadableResourceBundleMessageSource.setBasename("classpath:i18n/messages");
		reloadableResourceBundleMessageSource.setCacheSeconds(1800);
		
		return reloadableResourceBundleMessageSource ;
	}
	
	@Bean
	public LocaleResolver localeResolver() {
		
		SessionLocaleResolver slr = new SessionLocaleResolver();
		slr.setDefaultLocale(Locale.US);
		
		return slr;
		
	}

}
