package cor;

public class SensitiveFilter implements Filter {

    @Override
    public boolean doFilter(Msg msg) {
        String r = msg.getMsg();

        r = r.replaceAll("996", "995");
        msg.setMsg(r);
        return false;
    }
}
