
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
TUTORIAL 3 [Spring Framework - Architecture]
------------------------------------------------------------------------------------------------------------------------
  Spring is modular, The Spring Framework provides about 20 modules

  ______________________________________________  
  | Core Container
  |	    Beans, Core, Context, SpEL
  | Data Access/Integration
  |	    Jdbc, Orm, Oxm, Jms, Transactions
  | Web MVC & Remoting
  |	    WebSocket, Servlet, Web, Portlet
  | AOP
  | ASPECTS
  | INSTRUMENTATION
  | MESSAGING
  | Test
  |______________________________________________

  Core Container
    The Core Container consists of the Core, Beans, Context, and Expression Language modules
      Core module
        provides the fundamental parts of the framework, including the `IoC and Dependency Injection` features.
      Bean module
        provides `BeanFactory`, which is a sophisticated implementation of the factory pattern.
      Context module
        `builds on` the `solid base provided by` the `Core and Beans modules`
        and it is a `medium to access any objects defined and configured`.
        The `ApplicationContext interface` is the `focal point` of the `Context module`.
      SpEL module
        provides a `powerful expression language` for `querying and manipulating` an `object graph` at `runtime`.

  Data Access/Integration
    The Data Access/Integration layer consists of, JDBC, ORM, OXM, JMS and Transaction modules.
      The JDBC module
        provides a `JDBC-abstraction layer` that removes the need for tedious JDBC related coding.
      The ORM module
        provides `integration layers` for popular `object-relational mapping APIs`,
        including `JPA`, `JDO`, `Hibernate`, and `iBatis`.
      The OXM module
        provides an `abstraction layer`
        that supports `Object/XML mapping implementations` for `JAXB`, `Castor`, `XMLBeans`, `JiBX` and `XStream`.
      The Java Messaging Service JMS module
        contains features for `producing and consuming messages`.
      The Transaction module
        supports `programmatic and declarative transaction management`
        for `classes` `that implement` `special interfaces` and `for all your POJOs`.

  Web
    The Web layer consists of the Web, Web-MVC, Web-Socket, and Web-Portlet modules.
      The Web module
        provides basic `web-oriented integration` features such as `multipart file-upload` functionality
        and the `initialization of the IoC container using servlet listeners`
        and a `web-oriented application context`.
      The Web-MVC module
        contains `Spring's Model-View-Controller (MVC)` implementation for web applications.
      The Web-Socket module
        provides support for `WebSocket-based, two-way communication` between the client and the server in web applications.
      The Web-Portlet module
        provides the `MVC implementation to be used in a portlet environment`
        and `mirrors` the functionality of `Web-Servlet module`.

  Miscellaneous
    There are few other important modules like AOP, Aspects, Instrumentation, Web and Test modules.
      The AOP module
        provides an `aspect-oriented programming` implementation
        allowing you to define `method-interceptors and pointcuts`
        to `cleanly decouple code` `that implements functionality` `that should be separated`.
      The Aspects module
        provides `integration with AspectJ`,
        which is again a `powerful and mature AOP framework`.
      The Instrumentation module
        provides `class instrumentation support` and `class loader implementations`
        to be used `in certain application servers`.
      The Messaging module
        provides support for `STOMP as the WebSocket sub-protocol` to use in applications.
        It also supports an `annotation programming model`
        for `routing` and `processing STOMP messages from WebSocket clients`.
      The Test module
        supports the `testing` of `Spring components` with `JUnit` or `TestNG` `frameworks`.


________________________________________________________________________________________________________________________
TUTORIAL 4 [Spring - Environment Setup]
------------------------------------------------------------------------------------------------------------------------
Set PATH(java_install_dir/bin) and JAVA_HOME(java_install_dir) environment variables
to refer to the directory that contains java and javac.

in your ~/.bashrc,
	PATH /usr/local/jdk1.6.0_15/bin:$PATH
	JAVA_HOME /usr/local/jdk1.6.0_15
	& then publish your enviornment, source ~/.bashrc


IDE
	https://www.eclipse.org/downloads/
	Once you download the installation,
	unpack the binary distribution into a convenient location.
	For example, /usr/local/eclipse on Linux/Unix and finally set PATH variable appropriately.

Install Apache Common Logging API
	Download binaries
		@ https://commons.apache.org/logging/download_logging.cgi
	Unpack the binary distribution into a convenient location
		/usr/local/commons-logging-1.1.1 on Linux/Unix.
	Make sure you set your CLASSPATH variable on this directory properly.
		export CLASSPATH='/usr/local/commons-logging-1.2'

Setup Spring Framework Libraries
	Download spring framework libraries,
	https://repo.spring.io/release/org/springframework/spring


JAVA_HOME
	Your java install directory, responsible for `java` command.
	Typically your java install directory.
PATH
	Path to javaInstallFolder/bin directory.
	java_install_dir/bin
	Responsible for `javac` command.
CLASSPATH
	A path where you place your compiled .class files
	export CLASSPATH=/usr/local/commons-logging-1.2
	export CLASSPATH=$CLASSPATH:'/Your/Path/To/spring-framework-5.2.5.RELEASE'

	Then, $ source ~/.bashrc (home dir /&/ .bashrc)
	Verify,
	echo $CLASSPATH

________________________________________________________________________________________________________________________
TUTORIAL 5 [Spring - Hello World Example]
------------------------------------------------------------------------------------------------------------------------
Open Eclipse, navigate to,
  create-new-project > /Your/Path/To/TestProject
  Enter ProjectName of your choice. 'HelloSpring'

  Till now u haven't included framework folder, to your project.
  your project should have an /EmptyDirectory, & /JRESystemlibrary folder

Next, we will add Spring Framework and common logging API libraries in our project.
  Right-Click on project,
  Build-Path → Configure-Build-Path   ->    Add External JARs
    -- CommonLogging.jar (from usr/local <- YourCommonLoggingBinaryExtractionDirectory)
    -- All spring.jar (from /path/to/spring/folder/extraction/Spring-Version/libs Directory)
    They will be placed under, Referenced Libraries

Create your actual source file for your project.
  RightClick, /src folder add `NEW PACKAGE` `com.subratpalhar`
  Next we will create `HelloWorld.java` and `MainApp.java files` `under the com.subratpalhar package`.

  Create your Beans.xml file(under /src directory)
  You have to make sure that this file is available in CLASSPATH

  Bean : You can think of it as an Object, needs to be injected. from container.

  BeansId <~~> Angulars service token
    {provide: UserServiceConfig, useValue: config }
    <bean id = "helloWorld" class = "com.subratpalhar.HelloWorld">
      <property name = "message" value = "Hello World!"/>
    </bean>
    id --as-- service token #unique
    value --as-- useValue


Following two important points are to be noted about the main program −
  The first step is to create an `application context` where we used `framework-API ClassPathXmlApplicationContext()`.
  This API() loads beans configuration file and eventually based on the provided API,
  it takes care of `creating and initializing all the objects`,
  i.e. `beans mentioned in the configuration file`.

  The second step is used `to get the required bean` using `getBean() method` of the `created context`.
  This method uses `bean-ID` to `return a generic object`,
  which finally can be `casted` `to the actual object`.
  --Once you have an object, you can use this object to call any class method.?

** your project's output directory will be /projectFolder/bin directory


ECLIPSE BUILD ERROR::
JavaBuildPath - ConfigureBuildPath - Libraries - Add Library - JRE System Library - work space default jre
finish


________________________________________________________________________________________________________________________
TUTORIAL [Spring - IoC Containers]
------------------------------------------------------------------------------------------------------------------------
The Spring `container` (Service-container) is at the core of the Spring Framework.
The container will create the objects, wire them together, configure them,
and manage their complete life cycle from creation till destruction.
The Spring container uses DI to manage the components that make up an application.
These objects are called Spring Beans, which we will discuss in the next chapter.
 [Bean(service)-created-by-container(service-container)]

The `container gets its instructions` on `what objects to instantiate, configure, and assemble`
by reading the `configuration metadata provided`.
The `configuration metadata` can be represented either by `XML`, `Java annotations`, or `Java code`.
The Spring `IoC container` makes use of `Java POJO classes and configuration metadata`
`to produce` a `fully configured and executable system` or `application`.

POJO + META-DATA => ContainerOutput

spring provides two distinct type of container,,
  - Spring Bean Factory Container
  - Spring Application Factory Container

  Spring BeanFactory Container
    This is the simplest container providing the basic `support for DI`
    and is `defined by` the `org.springframework.beans.factory.BeanFactory interface`.

    The `BeanFactory` and `related interfaces`,such as `BeanFactoryAware`, `InitializingBean`, `DisposableBean`,
    for the purpose of backward compatibility with a large number of `third-party frameworks` that integrate with Spring.

    There are a number of implementations of the `BeanFactory interface`
    that are come straight out-of-the-box with Spring.
    The most commonly used BeanFactory implementation is the `XmlBeanFactory class`.
    This container reads the `configuration metadata from an XML file`
    and uses it to create a fully configured system or application.


    "XmlBeanFactory factory = new XmlBeanFactory (new ClassPathResource("Beans.xml"));"
      The first step is to `create a factory object` where we used the framework
      APIXmlBeanFactory() to create the factory bean.
      The XmlBeanFactory() API takes care of creating and initializing all the objects,
      i.e. beans mentioned in the configuration file.

      ClassPathResource() API to load the bean configuration file available in CLASSPATH.

  Spring ApplicationContext Container (Spring's advanced container)
    This `container` adds more enterprise-specific functionality
    such as the ability to `resolve textual messages` from a `properties-file`
    and the ability `to ""publish"" application-events` to `interested event-listeners`.
    This container is 'defined by' the `org.springframework.context.ApplicationContext` `interface`.

    It can load 'bean-definitions', 'wire-beans-together', and `dispense-beans` upon request.

    The most commonly used ApplicationContext implementations are −
      -- FileSystemXmlApplicationContext
        This `container loads` the `definitions of the beans` from an `XML-file`.
        Here you need to provide the `full path of the XML bean configuration file` to the constructor.

      -- ClassPathXmlApplicationContext
        This container loads the definitions of the beans from an XML file.
        Here you do not need to provide the `full path of the XML file`
        but you need to set `CLASSPATH properly`
        because this container will look, `bean configuration XML file` `in CLASSPATH`.

      -- WebXmlApplicationContext
        This container `loads the XML file` with `definitions of all beans` `'from-within' a web application`.


      ApplicationContext context = new FileSystemXmlApplicationContext("src/Beans.xml");

      To create factory object where we used framework APIFileSystemXmlApplicationContext
      to create the factory bean after loading the bean configuration file from the given path.
      TheFileSystemXmlApplicationContext() API takes care of creating and initializing all the objects
      ie. beans mentioned in the XML bean configuration file.

  The `ApplicationContext container` includes all functionality of the `BeanFactorycontainer`,
  so it is generally `recommended over BeanFactory`.
  `BeanFactory` can still be used for `lightweight applications like mobile devices`
  `or` `applet-based applications` where `data-volume` and `speed` is `significant`.
  
________________________________________________________________________________________________________________________
TUTORIAL [Spring - Bean Definition]
------------------------------------------------------------------------------------------------------------------------
[BEAN]
  The objects that form the backbone of your application
  and that are `managed by the Spring IoC container` (central-dependency-resolver-n-injector) are called beans.
  you may compare bean as service in Angular & in Laravel world.

  _____________________________________
  | Spring                    Angular |
  -------------------------------------
  | Bean                      Service |
  | Ioc Container             Provider|
  -------------------------------------

  A bean is an object that is instantiated, assembled, and otherwise managed by a Spring IoC container.
  These beans are created with the configuration metadata that you supply to the container.
    - How to create a bean
    - Bean's lifecycle details
    - Bean's dependencies
  The configuration could be of type
    - XML based configuration file.
    - Annotation-based configuration
    - Java-based configuration

  Configuration metadata translates into a set of the properties that make up each bean definition.
    class
      This attribute is mandatory and `specifies the bean class to be used` `to create the bean`.
    name
      This attribute specifies the `bean identifier uniquely` (dependency token :Angular)
      In XMLbased configuration metadata,
      you use the id and/or name attributes to specify the bean identifier(s).
    scope
      This attribute specifies the `scope of the objects` created `from a particular "bean-definition"`
    constructor-arg
      This is used `to inject the dependencies`. (typehint: Laravel)
      use /http/controller/User
      hello(User $user, Request $request) {} //type-hint
    properties
      This is `used to inject the dependencies`.
    autowiring mode
      This is `used to inject the dependencies`.
    lazy-initialization mode
      A `lazy-initialized bean` `tells the IoC container`
      `to create a bean instance` `when it is first requested`, (lazyloading :Angular)
      `rather than at the startup`.
    initialization method
      A `callback to be called` just after `all necessary properties on the bean have been set by the container`.
    destruction method
      A `callback to be used`
      when the `container containing the bean is destroyed`.

________________________________________________________________________________________________________________________
TUTORIAL [Spring - Bean Scopes]
------------------------------------------------------------------------------------------------------------------------
[BeanScopes]
  BeanScope defines `object creation behaviour`(singletone|prototype|etc..), when a bean is reequested for.

  singleton
    If you want Spring to `return the same bean instance` each time one is needed.
  prototype
    `New bean instance` each time one is needed,
    you should declare the bean's scope attribute to be.
  request
    This scopes a bean definition to an `HTTP request`.
    Only `valid in the context of a web-aware` Spring `ApplicationContext`.
  session
    This scopes a bean definition to an `HTTP session`.
    Only valid in the context of a web-aware Spring ApplicationContext
  global-session
    This scopes a bean definition to a `global HTTP session`.
    Only valid in the context of a web-aware Spring ApplicationContext.

    The singleton scope
    This single instance is stored in a cache of such singleton beans, and all subsequent requests and references for that named bean return the cached object.
    <bean id = "..." class = "..." scope = "singleton"></bean>

  prototype
    If the scope is set to prototype,
    the Spring IoC container creates a new bean instance of the object every time a request for that specific bean is made.

    As a rule, use the prototype scope for all state-full beans and the singleton scope for stateless beans.
    <bean id = "helloWorld" class = "com.subratpalhar.HelloWorld" scope = "prototype"></bean>

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


























