/**
 * 
 */
package com.subratpalhar;

//import org.springframework.context.ApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;
//
///**
// * @author root
// *
// */
//public class MainApp {
//
//  public static void main(String args[]) {
//    ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
//    HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
//    obj.getMessage();
//  }
//
//}


/**
// * Type XmlBeanFactory is deprecated
// */
//import org.springframework.beans.factory.InitializingBean; 
//import org.springframework.beans.factory.xml.XmlBeanFactory; 
//import org.springframework.core.io.ClassPathResource;  
//
//public class MainApp { 
//   public static void main(String[] args) { 
//      XmlBeanFactory factory = new XmlBeanFactory (new ClassPathResource("Beans.xml"));
//      HelloWorld obj = (HelloWorld) factory.getBean("helloWorld");    
//      obj.getMessage();    
//   }
//}



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class MainApp {
   public static void main(String args[]) {
      ApplicationContext context = new FileSystemXmlApplicationContext("src/Beans.xml");
      // ONLY GIVING A RELATIVE PATH FROM PROJECT ROOT
      
      HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
      obj.getMessage();
   }
}



