package cor.servlet;

import java.util.ArrayList;
import java.util.List;

public class FilterChain implements Filter {
    List<Filter> filters = new ArrayList<>();
    int index = 0;

    public FilterChain add(Filter f) {
        filters.add(f);
        return this;
    }

    public boolean doFilter(Request request, Response response, FilterChain filterChain) {
        if(index == filters.size()) return false;
        Filter filter = filters.get(index);
        index ++;
        return filter.doFilter(request, response, filterChain);
    }
}
