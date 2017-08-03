package com.iceihehe.api.web.controller.filter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import java.io.IOException;

@Component
public class LoginFilter implements Filter {

    private static final Logger LOGGER = LoggerFactory.getLogger(LoginFilter.class);

    @Override
    public void init(FilterConfig config){}

    @Override
    public void destroy(){}

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        LOGGER.info("haha");
        chain.doFilter(request, response);
    }
}
