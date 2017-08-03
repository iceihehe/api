package com.iceihehe.api.web.controller.filter;

import com.iceihehe.api.common.Message;
import com.iceihehe.api.common.constant.Code;
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
        LOGGER.info("xi");
        Boolean ok = false;

        if (ok) {
            chain.doFilter(request, response);
        } else{
            Message message = new Message();
            message.setCode(Code.LOGIN_REQUIRED);
            message.setMessage("要登录啊哥们!");

            response.setContentType("application/json;charset=UTF-8");
            response.getWriter().append(message.toJSONString());
        }
    }
}
