package io.epopeia.ejb;

import javax.interceptor.Interceptor;

import org.springframework.ejb.interceptor.SpringBeanAutowiringInterceptor;

@Interceptor
public class SpringContextInterceptor extends SpringBeanAutowiringInterceptor {

}
