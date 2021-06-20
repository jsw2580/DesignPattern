package cor.servlet;

public interface Filter {
    boolean doFilter(Request request, Response response, FilterChain filterChain);
}
