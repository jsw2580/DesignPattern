package cor.servlet;

public class HTMLFilter implements Filter {
    @Override
    public boolean doFilter(Request request, Response response, FilterChain filterChain) {
        request.str = request.str.replaceAll("<", "[").replaceAll(">", "]");
        filterChain.doFilter(request, response, filterChain);
        response.str += "--HTMLFilter";
        return true;
    }
}
