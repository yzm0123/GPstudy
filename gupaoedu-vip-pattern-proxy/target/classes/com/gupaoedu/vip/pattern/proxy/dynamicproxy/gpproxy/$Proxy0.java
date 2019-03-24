package com.gupaoedu.vip.pattern.proxy.dynamicproxy.gpproxy;
import com.gupaoedu.vip.pattern.proxy.Person;
import java.lang.reflect.*;
public final class $Proxy0 extends GPProxy implements com.gupaoedu.vip.pattern.proxy.Person{
	private GPInvocationHandle h;
	public $Proxy0(GPInvocationHandle h){
		this.h = h;
	}
	public void findLove(){
		try{
			Method m = com.gupaoedu.vip.pattern.proxy.Person.class.getMethod("findLove",new Class[]{});
			this.h.invoke(this,m,null);
		}catch(Throwable e){
			e.printStackTrace();
		}
	}
}
