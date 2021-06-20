package cor;

public class HTMLFilter implements Filter {
    @Override
    public boolean doFilter(Msg msg) {
        String r = msg.getMsg();
        r = r.replace('<', '[');
        r = r.replace('>', ']');

        msg.setMsg(r);

        return true;
    }
}
