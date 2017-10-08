# ustgroovy

    Setting up instructions
    Fisrt Groovy program/script
    Java vs Groovy (FilterLIs.java and ShortSyntax.groovy)
    Not a strongly typed language
    Under the hood, all types are Java classes
    instanceof to get the actual type
    Collections - List, Maps, Ranges
    Date
    Regex - Matcher, Pattern classes 
    Controls: If, Switch
    Closures

    Builders
        - MarkupBuilder, AntBuilder
    DataAccess
        - Object
        - DB, Mysql (Query the databse)
        - DataSets (Lazy db fetches)
    Junit
        - Unit Test
        - Unit using Junit 4.x
        - Parameterized Test Case
    Running Groovy on Maven
        pom.xml and specify the dependeices
                <dependency>
                    <groupId>org.codehaus.groovy</groupId>
                    <artifactId>groovy</artifactId>
                    <version>2.4.12</version>
                </dependency>
    Groovlets
        groovy-all
                <dependency>
                    <groupId>org.codehaus.groovy</groupId>
                    <artifactId>groovy-all-minimal</artifactId>
                    <version>1.5.8</version>
                </dependency>

                --web.xml

                <servlet>
                <servlet-name>GroovyServlet</servlet-name>
                    <servlet-class>groovy.servlet.GroovyServlet</servlet-class>
                </servlet>

                <servlet-mapping>
                    <servlet-name>GroovyServlet</servlet-name>
                    <url-pattern>*.groovy</url-pattern>
                </servlet-mapping>
