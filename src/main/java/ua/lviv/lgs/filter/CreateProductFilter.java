package ua.lviv.lgs.filter;

import ua.lviv.lgs.domain.UserRole;
import ua.lviv.lgs.shared.FilterService;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;
import java.util.Arrays;

@WebFilter("/createProduct.jsp")
public class CreateProductFilter implements Filter {
    private FilterService filterService = FilterService.getFilterService();

    public void destroy() {
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws ServletException, IOException {
        filterService.doFilterValidation(request, response, chain, Arrays.asList(UserRole.ADMINISTRATOR));
    }

    public void init(FilterConfig fConfig) throws ServletException {}
}
