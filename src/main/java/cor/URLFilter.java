package cor;

public class URLFilter implements Filter {

    @Override
    public boolean doFilter(Msg msg) {
        String r = msg.getMsg();
        r.replace("mashibing.com", "http://www.mashibing.com");
        msg.setMsg(r);
        return true;
    }
}
