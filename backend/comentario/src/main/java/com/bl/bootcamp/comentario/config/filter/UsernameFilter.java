package com.bl.bootcamp.comentario.config.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import org.slf4j.MDC;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(1)
public class UsernameFilter implements Filter {

	private final String USERNAME_REQUEST_HEADER = "username";
	private final String USER_KEY = "username";

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {

		MDC.put(USER_KEY, this.obtenerUsernameRequest(request));

		try {
			chain.doFilter(request, response);
		} finally {
			MDC.remove(USER_KEY);
		}
	}

	protected String obtenerUsernameRequest(ServletRequest request) {
		return ((HttpServletRequest) request).getHeader(USERNAME_REQUEST_HEADER);
	}
}
