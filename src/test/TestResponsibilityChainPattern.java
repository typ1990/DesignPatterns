import responsibilitychainpattern.*;

public class TestResponsibilityChainPattern {


//    我们有一个字符串String msg = ":):,<script>,敏感,被就业,网络授课";我们希望应用以下三个规则对字符串进行过滤和谐处理：
//
//            (1)将字符串中出现的"<>"符号替换成"[]"
//
//            (2)处理字符串中的敏感信息，将被就业和谐成就业
//
//            (3)将字符串中出现的":):"转换成"^V^";
    public static void main(String[] args) {
        //设定过滤规则，对msg字符串进行过滤处理
        String msg = ":):,<script>,敏感,被就业,网络授课";
        //过滤请求
        Request request=new Request();
        //set方法，将待处理字符串传递进去
        request.setRequestStr(msg);
        //处理过程结束，给出的响应
        Response response=new Response();
        //设置响应信息
        response.setResponseStr("response:");
        //FilterChain,过滤规则形成的拦截链条
        FilterChain fc=new FilterChain();
        //规则链条添加过滤规则，采用的是链式调用
        fc.addFilter(new HTMLFilter())
                .addFilter(new SensitiveFilter())
                .addFilter(new FaceFilter());
        //按照FilterChain的规则顺序，依次应用过滤规则
        fc.doFilter(request, response,fc);
        //打印请求信息
        System.out.println(request.getRequestStr());
        //打印响应信息
        System.out.println(response.getResponseStr());

        /*
         * 处理器对数据进行处理
         * --|----|---数据--|-----|---
         * 规则1      规则2                 规则3       规则4
         */
    }
}
