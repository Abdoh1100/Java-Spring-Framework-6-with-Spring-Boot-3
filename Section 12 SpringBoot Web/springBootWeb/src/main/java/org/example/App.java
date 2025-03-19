package org.example;

import org.apache.catalina.Context;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws LifecycleException {
        System.out.println( "Hello World!" );

        Tomcat tomcat=new Tomcat();
//        tomcat.start();
//        tomcat.getServer().await(); // we tell the sever to wait as it exits automatically but
        // till now we did not handle the request
        // how tomcat will know which class or page to execute ?  through a URL
        // there should be mapping between the hello url and my servlet .
        // to do tha mapping we need to get the hold on the context object :
        Context context=tomcat.addContext("",null);
        Tomcat.addServlet(context,"hi",new helloServlet());
        context.addServletMappingDecoded("/hello","hi");
        // now start the server again :
        tomcat.start();
        tomcat.getServer().await();


    }
}
