package cor.servlet;

import cor.FaceFilter;
import cor.URLFilter;

public class Main {
    public static void main(String[] args) {
        Request request = new Request();
        request.str = "大家好：），<script>,欢迎访问 mashibing.com,大家都是996 ";
        Response response = new Response();
        response.str = "";

        FilterChain filterChain = new FilterChain();
        filterChain.add(new HTMLFilter()).add(new SensitiveFilter());

        filterChain.doFilter(request, response, filterChain);

        System.out.println(request.str);
        System.out.println(response.str);
    }
}
