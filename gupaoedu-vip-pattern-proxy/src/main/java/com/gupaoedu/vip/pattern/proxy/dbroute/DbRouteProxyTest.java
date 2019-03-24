package com.gupaoedu.vip.pattern.proxy.dbroute;

import com.gupaoedu.vip.pattern.proxy.dbroute.proxy.OrderServiceStaticProxy;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DbRouteProxyTest {

    public static void main(String[] args) {

        try {
            IOrderService orderService = new OrderService();
            OrderServiceStaticProxy proxy = new OrderServiceStaticProxy(orderService);
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Order order = new Order();
            Date date = sdf.parse("2014-01-09");
            order.setCreateTime(date.getTime());
            proxy.createOrder(order);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
