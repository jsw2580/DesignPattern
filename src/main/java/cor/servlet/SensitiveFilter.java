package cor.servlet;

public class SensitiveFilter implements Filter {

    @Override
    public boolean doFilter(Request request, Response response, FilterChain filterChain) {
        request.str = request.str.replaceAll("996", "995");
        filterChain.doFilter(request, response, filterChain);
        response.str += "--SensitiveFilter";
        return true;
    }
}
