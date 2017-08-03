package com.iceihehe.api.web.controller.filter;

import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import java.io.IOException;

@Component
@Order(Ordered.HIGHEST_PRECEDENCE)
public class LogFilter implements Filter{

    @Override
    public void init(FilterConfig config){

    }

    @Override
    public void destroy(){

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.printf(request.getRemoteAddr());
        chain.doFilter(request, response);
    }
}
