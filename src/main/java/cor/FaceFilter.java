package cor;

public class FaceFilter implements Filter {

    @Override
    public boolean doFilter(Msg msg) {
        String r = msg.getMsg();
        r.replace("：）", "^V^");
        msg.setMsg(r);
        return true;
    }
}
