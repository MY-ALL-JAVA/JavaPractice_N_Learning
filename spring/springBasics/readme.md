
: SPRING FRAMEWORK FROM TUTORIALS POINT :


subrat@palmatesolution:~/eclipse/java-2019-06/eclipse$ ./eclipse




________________________________________________________________________________________________________________________
TUTORIAL 1 [Applications of Spring]
------------------------------------------------------------------------------------------------------------------------
  POJO Based
  Spring enables developers to develop enterprise-class applications using `POJOs`.
  The benefit of using only POJOs is that you do not need an "EJB container product" such as an "application server"
  but you have the option of using only a robust `servlet container` such as `Tomcat` or some commercial product.

  Modular
  Spring is organized in a modular fashion. Even though the number of packages and classes are substantial,
  you have to worry only about the ones you need and ignore the rest.

  Integration with existing frameworks
  Spring does not reinvent the wheel, instead it truly makes use of some of the existing technologies
  like several `ORM frameworks`, `logging frameworks`, `JEE`, `Quartz` and `JDK timers`, and other `view technologies`.

  Testablity
  Testing an application written with Spring is simple because `environment-dependent code is moved into this framework`
  Furthermore, by using `JavaBeanstyle POJOs`, it becomes easier to use `dependency injection for injecting test data`.

  Web MVC
  Spring's web framework is a well-designed web MVC framework,
  which provides a great alternative to web frameworks such as `Struts` or other over-engineered or less popular web frameworks.

  Central Exception Handling
  Spring provides a convenient API to translate `technology-specific exceptions`
  (thrown by JDBC, Hibernate, or JDO, for example) into `consistent`, `unchecked` exceptions.

  Lightweight
  Lightweight `IoC containers` tend to be lightweight, especially when compared to EJB containers, for example.
  This is beneficial for developing and deploying applications on computers with limited memory and CPU resources.

  Transaction management
  Spring provides a consistent `transaction management interface`
  that can scale down to a `local transaction (using a single database, for example)`
  and scale up to `global transactions (using JTA, for example)`.

________________________________________________________________________________________________________________________
TUTORIAL 2 [Overview]
------------------------------------------------------------------------------------------------------------------------

  Spring enables developers to `develop enterprise-class applications` using `POJOs`.
  The benefit of using only POJOs is that `you do not need an EJB container product` such as an `application server`
  but you have the option of using only a robust `servlet container` such as `Tomcat` or some commercial product.

  Testing an application written with Spring is simple
  because environment-dependent code is moved into this framework.
  Furthermore, by using JavaBeanstyle POJOs,
  it becomes easier to use dependency injection for injecting test data.

  Lightweight IoC containers tend to be lightweight,
  especially when compared to EJB containers, for example.
  This is beneficial for developing and deploying applications on computers with limited memory and CPU resources.

  Spring provides a consistent transaction management interface
  that can scale down to a local transaction (using a single database, for example)
  and scale up to global transactions (using JTA, for example).

Dependency Injection (DI)
  The technology that Spring is most identified with is,
  the `Dependency Injection (DI)` flavor of `Inversion of Control (IOC)`.
  The Inversion of Control (IoC) is a general concept,
  and it can be expressed in many different ways.
  Dependency Injection is merely one concrete example of Inversion of Control.

  Application objects, should be independent of each other.
  DI helps glueing these objects together. (WITH BEAN CONFIGURATION)

  [own]
  Take this example a mix-blend of Php & JS (Ionic),
  you can inject an object with typecastable.

    use some/nameSpace/MyinjectableClass; // from 3rd party library
    this.somefunctionReturnsCallback( ($Result: MyinjectableClass) => {
      // Here in the callback, the 'MyinjectableClass' will be resolved by `ServiceContainer`, & will be injected.
      // MyinjectableClass can be an interface, or an abstract class, where you will see only abstarct methods
      // the library internally implements those abstract methods.
      $Result. ------AllMethods() & properties------
    })

Aspect Oriented Programming (AOP)
  The functions that span multiple points of an application are called `cross-cutting concerns`
  and these `cross-cutting concerns` are conceptually separate from the `application's business logic`.
  [OWN] The most common functionlity, such as an helper dd() in laravel
    or an exception handler. or an auth() helper
    these objects are same throughout the application.
    so keeping them separate & in one place make sense..

  The key `unit of modularity` in `OOP` is the `class`,
  whereas in `AOP` the `unit of modularity` is the `aspect`.
    `DI` helps you decouple your `application objects` from each other,
    while `AOP` helps you decouple `cross-cutting concerns` from the objects that they affect.

  The AOP module of Spring Framework provides an aspect-oriented programming implementation
  allowing you to define `method-interceptors` and `pointcuts`
  to cleanly decouple code that implements functionality that should be separated.







________________________________________________________________________________________________________________________
TUTORIAL #
------------------------------------------------------------------------------------------------------------------------














________________________________________________________________________________________________________________________
TUTORIAL #
------------------------------------------------------------------------------------------------------------------------















________________________________________________________________________________________________________________________
TUTORIAL #
------------------------------------------------------------------------------------------------------------------------



















________________________________________________________________________________________________________________________
TUTORIAL #
------------------------------------------------------------------------------------------------------------------------


















________________________________________________________________________________________________________________________
TUTORIAL #
------------------------------------------------------------------------------------------------------------------------


















________________________________________________________________________________________________________________________
TUTORIAL #
------------------------------------------------------------------------------------------------------------------------

















________________________________________________________________________________________________________________________
TUTORIAL #
------------------------------------------------------------------------------------------------------------------------
















________________________________________________________________________________________________________________________
TUTORIAL #
------------------------------------------------------------------------------------------------------------------------



















________________________________________________________________________________________________________________________
TUTORIAL #
------------------------------------------------------------------------------------------------------------------------



















________________________________________________________________________________________________________________________
TUTORIAL #
------------------------------------------------------------------------------------------------------------------------


























