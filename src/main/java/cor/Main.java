package cor;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Msg msg = new Msg();
        msg.setMsg("大家好：），<script>,欢迎访问 mashibing.com,大家都是996 ");

        //处理msg
        FilterChain filterChain = new FilterChain();
        filterChain.add(new SensitiveFilter()).add(new HTMLFilter());

        FilterChain filterChain2 = new FilterChain();
        filterChain2.add(new FaceFilter()).add(new URLFilter());

        filterChain.add(filterChain2);

        filterChain.doFilter(msg);

        System.out.println(msg);
    }
}
