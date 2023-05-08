package peoksoft;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");

        //with setter
     /*   Store store = context.getBean("storeBean", Store.class);
        System.out.println(store.getStoreName());
        System.out.println(store.getPriceProducts());
        System.out.println(store.getProducts());*/

        //with List Setter
      /*  Store store = context.getBean("store", Store.class);
        System.out.println(store.getProducts1());
        context.close();*/


        //With constructor
    /*    Store store = context.getBean("storeBean", Store.class);
        store.callYourProducts();
        context.close();*/



    }
}
