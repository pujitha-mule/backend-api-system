package com.example.backendapi.config;

import jakarta.servlet.*;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.concurrent.ConcurrentHashMap;

@Component
public class RateLimiterFilter implements Filter {

    private final ConcurrentHashMap<String, Integer> requests = new ConcurrentHashMap<>();

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {

        String ip = request.getRemoteAddr();
        requests.put(ip, requests.getOrDefault(ip, 0) + 1);

        if (requests.get(ip) > 10) {
            ((HttpServletResponse) response).setStatus(429);
            response.getWriter().write("Too many requests");
            return;
        }

        chain.doFilter(request, response);
    }
}