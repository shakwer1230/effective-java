package 考虑用静态工厂方法代替构造器;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

//服务访问API 客户端用来获取服务实列
public class Services {
    private Services(){}//阻止实列化


    private static final Map<String,Provider> providers=new ConcurrentHashMap<>();

    public static final String DEFAULT_PROVIDER_NAME="<def>";

    public static void registerDefaultProvider(Provider p){
        registerProvider(DEFAULT_PROVIDER_NAME,p);
    }

    public static void registerProvider(String name,Provider p){
        providers.put(name,p);
    }

    public static Service newInstance(){
        return newInstance(DEFAULT_PROVIDER_NAME);
    }
    public static Service newInstance(String name){
        Provider p=providers.get(name);
        if(p==null){
            throw new IllegalArgumentException("No provider registered with name:"+name);
        }
        return p.newSerivce();
    }

}
